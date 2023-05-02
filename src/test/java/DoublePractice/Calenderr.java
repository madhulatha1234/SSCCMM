package DoublePractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calenderr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date date=new Date();
System.out.println(date);
            //choosing user defined format
SimpleDateFormat sd=new SimpleDateFormat("dd_MMMM_yy");//String pattern

	String upvalue = sd.format(new Date());
	System.out.println(upvalue);
	SimpleDateFormat sdd=new SimpleDateFormat("dd-MMM-yyyy");
	//The Calendar class is an abstract class that provides methodsfor
	//converting between a specific instant in time and a set
	//of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on,

	Calendar cal = Calendar.getInstance();//initialized with the current date and time
	cal.add(Calendar.DAY_OF_MONTH, -6);
	String d = sdd.format(cal.getTime());
	System.out.println(d);
	}

}
