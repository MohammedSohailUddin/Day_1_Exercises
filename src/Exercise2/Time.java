package Exercise2;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int h, int m, int s) {
		if ( h >= 1 && h <= 23)
            hour = h;
        else 
            hour = 0;
        if ( m >= 0 && m <= 59)
            minute = m;
        else 
            minute = 0;
        if ( s >= 0 && s <= 59)
            second = s;
        else 
            second = 0;
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	public void setHour(int h) {
		hour = h;
	}
	public void setMinute(int m) {
		minute = m;
	}
	public void setSecond(int s) {
		second = s;
	}
	public void setTime(int h, int m, int s) {
		hour = s;
		minute = m;
		second = s;
	}
		@Override
	  public String toString()
	   {
	      String value="0";
	      if (hour<10)
	      {
	    	  value = value+hour;
	      }
	      else
	      {
	    	 value = ""+hour;
	     }
	     value = value + ":";
	     if (minute<10)
	     {
	    	 value = value + "0" + minute;
	     }
	     else
	     {
	    	 value = value + minute;
	     }
	     value = value + ":";
	     if (second<10)
	     {
	    	 value = value + "0" + second;
	     }
	     else
	     {
	    	 value = value + second;
	     }
	     return(value);
	   }
	  public Time(Time t) {
		  this.second = t.getSecond();
		  this.minute = t.getMinute();
		  this.hour = t.getHour();
	  }
	  public Time previousSecond() {
			second--;
			 if (second==0)
		       {
		          minute--;
		          second=59;
		       }
		       if (minute==0)
		       {
		         hour--;
		         minute=59;
		       }
		       if (hour==0)
		       {
		           hour=23;
		       }
		       return this;
		}
	public Time nextSecond() {
		second++;
		 if (second==60)
	       {
	          minute++;
	          second=0;
	       }
	       if (minute==60)
	       {
	         hour++;
	         minute=0;
	       }
	       if (hour==23)
	       {
	           hour=0;
	       }
	       return this;
	}
	
	public static void main(String args[])
	  {
	     Time t = new Time(2,20,40);
			//System.out.println(t);
	     do {
	    	 System.out.println( t.toString());
	    	 Time T = t.nextSecond();
	    	 //Time TT = t.previousSecond();
	    	 t = T;
	    	 //t=TT;
	     }
	     while (!((t.getHour()==0) && (t.getMinute()==0) && (t.getSecond()==0))); 
	  }
}

//Output:

//	21:44:55 to 23:59:59
