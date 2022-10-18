package Exercise5;

public class Stack {
	  private int arr[];
	  private int top,length,size;

	  public Stack(int size) {
	    arr = new int[size];
	    length = 0;
	    top = -1;
	  }

	  public void push(int ele) {
	    if (isFull()) {
	      System.out.println("Stack OverFlow!");
	    }
	    System.out.println("Inserting: " + ele);
	    arr[++top] = ele;
	  }
	  
	  public int pop() {
	    if (isEmpty()) {
	      System.out.println("Stack UnderFlow!");
	    }
	    return arr[top--];
	  }
	  
	  public int getSize() {
	    return top + 1;
	  }

	  public Boolean isEmpty() {
	    return top == -1;
	  }

	  public Boolean isFull() {
	    return length == size - 1;
	  }
	  
	  public int topMost() {
		    return arr[top];
	  }
	  
	  public void printElements() {
	    for (int i = 0; i <= top; i++) {
	      System.out.println(arr[i] + " ");
	    }
	  }

	  public static void main(String[] args) {
	    Stack st = new Stack(5);

	    st.push(1);
	    st.push(2);
	    st.push(3);
	    System.out.println("Stack: ");
	    st.printElements();
	    st.pop();
	    System.out.println("After popping out:");
	    st.printElements();
	    System.out.println("Top Most: "+st.topMost());
	    System.out.println("isFull: "+st.isFull());
	    System.out.println("isEmpty: "+st.isEmpty());
	    System.out.println("Remaining Size: "+st.getSize());
	  }
	}


//Output:

//	Inserting: 1
//	Inserting: 2
//	Inserting: 3
//	Stack: 
//	1 
//	2 
//	3 
//	After popping out:
//	1 
//	2 
//	Top Most: 2
//	isFull: false
//	isEmpty: false
//	Remaining Size: 2
