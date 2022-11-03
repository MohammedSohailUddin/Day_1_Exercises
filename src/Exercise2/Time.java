package Exercise2;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	 public Time() {  
		    this.second = 0;
		    this.minute = 0;
		    this.hour = 0;
		 }
	
	public Time(int hour, int minute, int second) {
		if ( hour >= 1 && hour <= 23)
            this.hour = hour;
        else 
            this.hour = 0;
        if ( minute >= 0 && minute <= 59)
            this.minute = minute;
        else 
            this.minute = 0;
        if ( second >= 0 && second <= 59)
            this.second = second;
        else 
            this.second = 0;
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
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
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
	     value = value + "[hr]:";
	     if (minute<10)
	     {
	    	 value = value + "0" + minute;
	     }
	     else
	     {
	    	 value = value + minute;
	     }
	     value = value + "[min]:";
	     if (second<10)
	     {
	    	 value = value + "0" + second+"[sec]";
	     }
	     else
	     {
	    	 value = value + second+"[sec]";
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
	       if (hour==24)
	       {
	           hour=0;
	       }
	       return this;
	}

	public static void main(String[] args) {
	      
	      Time t1 = new Time();
	      System.out.println(t1+"\n");  
	      Time t2 = new Time(1,2,3);
	      System.out.println(t2+"\n");
	      
	      t1.setHour(3);
	      t1.setMinute(2);
	      t1.setSecond(1);
	      System.out.println(t1+"\n");  
	      
	      t2.setTime(23, 59, 59);
	      System.out.println(t2+"\n");
	      System.out.println(t2.previousSecond()+"\n");
	      System.out.println(t2.nextSecond()+"\n"); 
	      System.out.println(t2.nextSecond().nextSecond());  
	      
	   }
	}

//Output:
//	00[hr]:00[min]:00[sec]
//
//			01[hr]:02[min]:03[sec]
//
//			03[hr]:02[min]:01[sec]
//
//			23[hr]:59[min]:59[sec]
//
//			23[hr]:59[min]:58[sec]
//
//			23[hr]:59[min]:59[sec]
//
//			00[hr]:00[min]:01[sec]
