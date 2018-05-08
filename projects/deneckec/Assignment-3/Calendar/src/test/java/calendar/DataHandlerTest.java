
/** A JUnit test class to test the class DataHandler. */


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;


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
}
