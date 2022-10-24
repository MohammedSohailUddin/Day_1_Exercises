package Exercise3;

public class Circle {
	final double pi = 3.14; 
	double, radius;
	String color;
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) {
		radius = r;
	}
	
	public Circle(double r, String col) {
		radius = r;
		color = col;
	}
	
	double getRadius() {
		return radius;
	}
	void setRadius(double r) {
		this.radius=r;
	}
	
	String getColor() {
		return color;
	}
	void setColor(String col) {
		this.color=col;
	}
	double getArea() {
		return pi*radius*radius;
	}
//	String toString() {
//	}


class Cylinder extends Circle{
	
	public Cylinder() {
		height = 1.0;
	}
	
	public Cylinder(double r) {
		this.radius = r;
	}
	public Cylinder(double r, double h) {
		this.radius = r;
		this.height = h;
	}
	public Cylinder(double r, double h, String col) {
		this.radius = r;
		this.height = h;
		this.color = col;
	}
	
	double getHeight() {
		return height;
	}
	void setHeight(double h) {
		this.height = h;
	}
	double getVolume() {
		return pi*radius*radius*height;
	}
	
	double getArea() {
		return pi*radius*radius;
	}
}
	
public static void main(String args[]) {
	//System.out.println("welcome");
	Circle c = new Circle(4,"red");
	Circle cyl = c.new Cylinder(5,6,"red");
	System.out.println("Circle Area: "+c.getArea());
	System.out.println("Cylinder Area: "+cyl.getArea());
	System.out.println("Cylinder Volume: "+cyl.getVolume());		
}
}

//Output:

//	Circle Area: 50.24
//	Cylinder Area: 78.5
//	Cylinder Volume: 471.0
