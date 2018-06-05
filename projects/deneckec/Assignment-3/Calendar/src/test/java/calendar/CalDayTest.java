/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Iterator;


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
  @Test(timeout = 4000)
  public void test09() throws Throwable {
    Appt appt1 = new Appt(13, 30, 22, 4, 2018, "Lunch", "Lunch with my wife", "xyz@gmail.com");
    Appt appt2 = new Appt(0, 30, 22, 4, 2018, "Lunch", "Lunch with my wife", "xyz@gmail.com");
    GregorianCalendar calendarDay = new GregorianCalendar(2018, 3, 22, 15, 30, 00);
    CalDay day0 = new CalDay(calendarDay);
    day0.addAppt(appt2);
    day0.addAppt(appt1);
    LinkedList<Appt> appts = day0.getAppts();
    Iterator<Appt> itr = appts.iterator();
    Object element = itr;
    while(itr.hasNext()) 
             element = itr.next();
    assertTrue(element == appt1);
  }
  @Test(timeout = 4000)
  public void test10() throws Throwable {
    Appt appt1 = new Appt(13, 30, 22, 4, 2018, "Lunch", "Lunch with my wife", "xyz@gmail.com");
    Appt appt2 = new Appt(13, 30, 22, 4, 2018, "Lunch", "Lunch with my wife", "xyz@gmail.com");
    GregorianCalendar calendarDay = new GregorianCalendar(2018, 3, 22, 15, 30, 00);
    CalDay day0 = new CalDay(calendarDay);
    day0.addAppt(appt2);
    day0.addAppt(appt1);
    LinkedList<Appt> appts = day0.getAppts();
    Iterator<Appt> itr = appts.iterator();
    Object element = itr;
    while(itr.hasNext()) 
             element = itr.next();
    assertTrue(element == appt1);
  }
  @Test(timeout = 4000)
  public void test11() throws Throwable {
    GregorianCalendar calendarDay = new GregorianCalendar(2018, 3, 22, 15, 30, 00);
    CalDay day0 = new CalDay(calendarDay);

    StringBuilder sb = new StringBuilder();
    if(day0.isValid()){
      String todayDate = (day0.getMonth()+1) + "/" + day0.getDay() + "/" + day0.getYear();
      sb.append("\t --- " + todayDate + " --- \n");
      sb.append(" --- -------- Appointments ------------ --- \n");
      Iterator<Appt> itr = day0.getAppts().iterator();
      Object element;
      while(itr.hasNext()) {
         element = itr.next();  
         sb.append(element + " ");
      }
    }
    sb.append("\n");

    assertEquals(sb.toString(), day0.toString());
  }
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
    Appt appt1 = new Appt(12, 30, 22, 5, 2018, "Wash dishes", "Next time we should buy paper plates", "xyz@gmail.com");
    Appt appt2 = new Appt(12, 05, 22, 5, 2018, "Get cancer", "You may be entitled to financial compensation", "xyz@gmail.com");
    Appt appt3 = new Appt(12, 10, 22, 5, 2018, "Pack", "Pack your bags for a camping trip", "xyz@gmail.com");
    GregorianCalendar cal = new GregorianCalendar(2018, 2, 22, 12, 30, 00);
    GregorianCalendar cal1 = new GregorianCalendar(2018, 4, 22, 12, 10, 00);    
    GregorianCalendar cal2 = new GregorianCalendar(2018, 4, 22, 12, 10, 00);
    CalDay day0 = new CalDay(cal);
    
    day0.addAppt(appt1);
    assertEquals("3-22-2018 \n\t0:30AM Wash dishes Next time we should buy paper plates ", day0.getFullInfomrationApp(day0));
    CalDay day1 = new CalDay(cal1);
    day1.addAppt(appt2);
    assertEquals("5-22-2018 \n\t0:05AM Get cancer You may be entitled to financial compensation ", day1.getFullInfomrationApp(day1));
    CalDay day2 = new CalDay(cal2);
    day2.addAppt(appt3);
    assertEquals("5-22-2018 \n\t0:10AM Pack Pack your bags for a camping trip ", day2.getFullInfomrationApp(day2));
  }
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
    GregorianCalendar cal = new GregorianCalendar(2018, 2, 22, 12, 30, 00);
    CalDay day0 = new CalDay(cal);
    Appt appt1 = new Appt(12, 30, 22, 5, 2018, "Wash dishes", "Next time we should buy paper plates", "xyz@gmail.com");
    Appt appt2 = new Appt(11, 05, 22, 5, 2018, "Get cancer", "You may be entitled to financial compensation", "xyz@gmail.com");
    day0.addAppt(appt1);
    day0.addAppt(appt2);
    assertEquals(day0.getAppts().get(0), appt2);
  }
}
