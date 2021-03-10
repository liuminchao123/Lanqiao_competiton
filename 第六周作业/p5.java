import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
 
 
public class p5 {
	public static void main(String[] args) {
	    DateFormat df = new SimpleDateFormat("EEE");
	    Scanner in = new Scanner(System.in);
	    int yy = in.nextInt();
	    int mm = in.nextInt();
	    int dd = in.nextInt();
 
	        /*Date d = new Date(yy,mm,dd);  直接new的日期和Calendar获取的日期星期不一样，Calendar获取的日期更精确
	        System.out.println(df.format(d));
	        */
	    Calendar can = Calendar.getInstance();
	    can.set(yy, mm-1, dd);
	    Date date = can.getTime();
	    String day = df.format(date);
	    // System.out.println("day: " + day);
 
	    if(day.equals("Mon")) {
            System.out.println(1);
        }
        else if(day.equals("Tue")) {
            System.out.println(2);
        }
        else if(day.equals("Wed")) {
            System.out.println(3);
        }
        else if(day.equals("Thu")) {
            System.out.println(4);
        }
        else if(day.equals("Fri")) {
            System.out.println(5);
        }
        else if(day.equals("周六")) {
            System.out.println(6);
        }
        else if(day.equals("周日")) {
            System.out.println(7);
        }
        in.close();
    }
}
 