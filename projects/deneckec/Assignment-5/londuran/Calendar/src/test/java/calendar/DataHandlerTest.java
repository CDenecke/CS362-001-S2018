
/** A JUnit test class to test the class DataHandler. */



package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import java.io.*;


public class DataHandlerTest{
	@Test(timeout = 4000)
	public void test00()  throws Throwable  {
		DataHandler handler = new DataHandler("calendar.xml", true);
	}
	@Test(timeout = 4000)
	public void test01()  throws Throwable  {
		DataHandler handler = new DataHandler("badfile", true);
	}
	@Test(timeout = 4000)
	public void test02()  throws Throwable  {
		Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		Appt appt1 = new Appt(15, 30, 12, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		DataHandler handler = new DataHandler("calendar.xml", true);
		GregorianCalendar gregDay0 = new GregorianCalendar(appt0.getStartYear(), appt0.getStartMonth(), appt0.getStartDay());
		GregorianCalendar gregDay1 = new GregorianCalendar(appt1.getStartYear(), appt1.getStartMonth(), appt1.getStartDay());
		handler.getApptRange(gregDay0, gregDay1);
	}
	@Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	  	Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	  	DataHandler handler = new DataHandler("calendar.xml", true);
	  	handler.saveAppt(appt0);
	  }
	@Test(timeout = 4000)
	  public void test04()  throws Throwable  {
	  	Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	  	int[] recurDays = {1,2,3};
	  	appt0.setRecurrence(recurDays, 1, 2, 10);
	  	DataHandler handler = new DataHandler("calendar.xml", true);
		GregorianCalendar gregDay0 = new GregorianCalendar(appt0.getStartYear(), appt0.getStartMonth(), appt0.getStartDay());
		GregorianCalendar gregDay1 = new GregorianCalendar(2020, 10, 15);
		handler.getApptRange(gregDay0, gregDay1);
	  }
	@Test(timeout = 4000)
	public void test05()  throws Throwable  {
		DataHandler handler = new DataHandler();
	}
	@Test(timeout = 4000)
	public void test06()  throws Throwable  {
		Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt0.setValid();
		DataHandler handler = new DataHandler();
		handler.saveAppt(appt0);
		handler.deleteAppt(appt0);
	}
	@Test(timeout = 4000)
	public void test07()  throws Throwable  {
		Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt0.setValid();
		DataHandler handler = new DataHandler("calendar.xml", false);
		handler.saveAppt(appt0);
		handler.deleteAppt(appt0);
	}
	@Test(timeout = 4000)
	public void test08()  throws Throwable  {
		Appt appt0 = new Appt(15, 30, 9, 10, -5, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
		appt0.setValid();
		DataHandler handler = new DataHandler("calendar.xml", true);
		handler.saveAppt(appt0);
		handler.deleteAppt(appt0);
	}
	@Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	  	Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	  	int[] recurDays = new int[0];
	  	appt0.setRecurrence(recurDays, Appt.RECUR_BY_WEEKLY, 1, 10);
	  	DataHandler handler = new DataHandler("calendar.xml", true);
		GregorianCalendar gregDay0 = new GregorianCalendar(appt0.getStartYear(), appt0.getStartMonth(), appt0.getStartDay());
		GregorianCalendar gregDay1 = new GregorianCalendar(2020, 10, 15);
		handler.getApptRange(gregDay0, gregDay1);
	  }
	@Test(timeout = 4000)
		public void test10() throws Throwable {
			try{
			DataHandler handler = new DataHandler("calendar.xml", true);
			}
			catch (IOException ioe) {
            System.out.println("Document Builder had an invalid configuration");
			}
	}
	Appt appt0 = new Appt(12, 30, 22, 4, 2018, "Lunch", "Lunch with my wife", "xyz@gmail.com");
  Appt appt1 = new Appt(14, 00, 22, 6, 2018, "Shopping", "Shopping and buy stuffs", "xyz@gmail.com");
	@Test(timeout = 4000)
  public void test11()  throws Throwable  {
    DataHandler data= new DataHandler();
    java.util.LinkedList <calendar.Appt> appts2;
    GregorianCalendar cal = new GregorianCalendar();
    cal.set(2018, 1, 27);
    GregorianCalendar cal2 = new GregorianCalendar();
    cal2.set(2018, 1, 25);
    assertTrue(appt0.getValid());

    CalDay calday = new CalDay(cal);
    CalDay calday2 = new CalDay(cal2);
    calday.addAppt(appt0);
		 calday2.addAppt(appt1);
     appts2= calday.getAppts();

		 assertTrue(calday.isValid());
		 assertTrue(calday2.isValid());
     assertTrue(data.save());
		 assertNotNull(data.getApptRange(cal2, cal));
     assertTrue(data.saveAppt(appt0));
     assertTrue(data.deleteAppt(appt0));
     assertTrue(data.saveAppt(appt1));

     int recurdays[] = null;
 		int recurby = 1;
 		int recurinc = 1;
 		int recurnnum= 1;
 		appt0.setRecurrence(recurdays, recurby, recurinc, recurnnum);
 		appt0.isRecurring();
         }
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
    DataHandler data= new DataHandler("x", false);
      int recurdays[] = new int[3];
      int recurby = 2;
      int recurinc = 1;
      int recurnnum= 1;
      appt0.setRecurrence(recurdays, recurby, recurinc, recurnnum);
      appt0.isRecurring();

  }
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
    DataHandler handler=new DataHandler("calendar.xml", true);
    GregorianCalendar day0=new GregorianCalendar(appt0.getStartYear(), appt0.getStartMonth(), appt0.getStartDay());
    GregorianCalendar day1=new GregorianCalendar(appt1.getStartYear(), appt1.getStartMonth(), appt1.getStartDay());
    handler.getApptRange(day0, day1);
  }
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
    DataHandler handler=new DataHandler("calendar.xml", true);
    handler.saveAppt(appt0);
  }
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
    int[] recurDays={1,2,3};
    appt0.setRecurrence(recurDays, 1,2,10);
    DataHandler handler=new DataHandler("calendar.xml", true);
    GregorianCalendar day0=new GregorianCalendar(appt0.getStartYear(), appt0.getStartMonth(), appt0.getStartDay());
    GregorianCalendar day1=new GregorianCalendar(2019, 12,12);
    handler.getApptRange(day0, day1);
  }
}