/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import java.util.GregorianCalendar;
import java.util.LinkedList;


public class CalDayTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
  	CalDay day1 = new CalDay();
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
  	GregorianCalendar gregDay0 = new GregorianCalendar(2020, 10, 15);
  	CalDay day1 = new CalDay(gregDay0);
  	Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
  	day1.addAppt(appt0);
  }
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
  	GregorianCalendar gregDay0 = new GregorianCalendar(2020, 10, 15);
  	CalDay day1 = new CalDay(gregDay0);
  	Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
  	day1.addAppt(appt0);
  	assertEquals(1, day1.getSizeAppts());
  	assertEquals(15, day1.getDay());
  	assertEquals(11, day1.getMonth());
  	assertEquals(2020, day1.getYear());
  }
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
  	GregorianCalendar gregDay0 = new GregorianCalendar(2020, 10, 15);
  	GregorianCalendar gregDay1 = new GregorianCalendar(2019, 1, 1);
  	CalDay day0 = new CalDay(gregDay0);
  	CalDay day1 = new CalDay(gregDay1);
  	Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
  	day0.addAppt(appt0);
  	day0.toString();
  	day0.getFullInfomrationApp(day0);
  }
  //Invalid CalDay
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
  	CalDay day0 = new CalDay();
  	Appt appt0 = new Appt(1, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
  	day0.iterator();
  }
  //Invalid appointment
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
  	GregorianCalendar gregDay0 = new GregorianCalendar(2020, 10, 15);
  	CalDay day1 = new CalDay(gregDay0);
  	Appt appt0 = new Appt(13, 30, 9, 10, -1, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
  	appt0.setValid();
  	day1.addAppt(appt0);
  }
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
  	CalDay day1 = new CalDay();
  	day1.toString();
  }
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
  	GregorianCalendar gregDay0 = new GregorianCalendar(2020, 10, 15);
  	CalDay day1 = new CalDay(gregDay0);
  	Appt appt0 = new Appt(0, 9, 15, 10, 2020, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
  	day1.addAppt(appt0);
  	day1.getFullInfomrationApp(day1);
  }
  @Test(timeout = 4000)
  public void test08() throws Throwable {
  	Appt appt1 = new Appt(13, 30, 22, 4, 2018, "Lunch", "Lunch with my wife", "xyz@gmail.com");
  	Appt appt2 = new Appt(0, 30, 22, 4, 2018, "Lunch", "Lunch with my wife", "xyz@gmail.com");
  	GregorianCalendar calendarDay = new GregorianCalendar(2018, 3, 22, 15, 30, 00);
  	CalDay day0 = new CalDay(calendarDay);
  	CalDay day1 = new CalDay(calendarDay);
  	CalDay day2 = new CalDay(calendarDay);
   	day1.addAppt(appt1);
  	assertNotNull(day1.getFullInfomrationApp(day1));
  	day1.addAppt(appt2);
  	assertNotNull(day2.getFullInfomrationApp(day2));
  }
}
