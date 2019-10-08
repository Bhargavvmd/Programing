package HR;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateANDDay {
	public static void main(String[] args) {
		  /*Date now = new Date(18, 8, 2019);
		  
	        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
	        System.out.println(simpleDateformat.format(now));
	 
	        simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
	        System.out.println(simpleDateformat.format(now));
	 
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(now);
	        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));*/
		/* String input_date="22/03/2020";
		
		  SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		  java.util.Date dt1=format1.parse(input_date);
		  DateFormat format2=new SimpleDateFormat("EEEE"); 
		  String finalDay=format2.format(dt1);
		  System.out.println(finalDay);*/
		int month=22;
		int day=03;
		int year=2020;
		 String input_date=month+"/"+day+"/"+year;
          SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
         try{
          java.util.Date dt1=format1.parse(input_date);
          DateFormat format2=new SimpleDateFormat("EEEE");
          String finalDay=format2.format(  dt1);
          System.out.println(finalDay);
         }
         catch(Exception e){
             
         } 
       
     
	}
}
