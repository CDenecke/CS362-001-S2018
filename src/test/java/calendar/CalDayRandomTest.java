package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 3 * 1000 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 
		         GregorianCalendar gregDay0 = new GregorianCalendar(1000, 10, 15);
  				 CalDay day1 = new CalDay(gregDay0);
  				 CalDay day2 = new CalDay();
			 //if(!appt.getValid())continue;
			for (int i = 0; i < NUM_TESTS; i++) {
				int startHour=ValuesGenerator.getRandomIntBetween(random, -8, 30);
				int startMinute=ValuesGenerator.getRandomIntBetween(random, -20, 80);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, -10, 40);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, -4, 16);
				 int startYear=ValuesGenerator.getRandomIntBetween(random, -5, 5);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 String emailAddress="xyz@gmail.com";
				 //Construct a new Appointment object with the initial data	 
				 //Construct a new Appointment object with the initial data	 
		         Appt appt = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description,
		                 emailAddress);
		        appt.setValid();
				day1.addAppt(appt);
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
	 }	
}
