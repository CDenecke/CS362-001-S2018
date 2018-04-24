/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t14/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
   public void test01()  throws Throwable  {
      Appt appt0 = new Appt(12, 15, 12, 10, 2019, "Early Christmas", "I can't wait to open presents so let's do it now", "hohoho@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/12/2019 at 12:15pm ,Early Christmas, I can't wait to open presents so let's do it now\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
   public void test02()  throws Throwable  {
      Appt appt0 = new Appt(12, 30, 1, 35, 40000, "Satan's Birthday Party", "Let's hope this never happens", "666@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t35/1/40000 at 12:30pm ,Satan's Birthday Party, Let's hope this never happens\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
   public void test03()  throws Throwable  {
      Appt appt0 = new Appt(-1, 60, -1, 35, 40000, "Satan's Birthday Party", "Let's hope this never happens", "666@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t35/-1/40000 at -1:60am ,Satan's Birthday Party, Let's hope this never happens\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
   public void test04()  throws Throwable  {
      Appt appt0 = new Appt(-1, 60, -1, 10, 40000, "Satan's Birthday Party", "Let's hope this never happens", "666@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/-1/40000 at -1:60am ,Satan's Birthday Party, Let's hope this never happens\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt(15, 80, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/9/2018 at 3:80pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 10, -5, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/9/-5 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, -1, 10, 5, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/-1/5 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
   @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 10, 2018, null, "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/9/2018 at 3:30pm ,, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", null, "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/9/2018 at 3:30pm ,Birthday Party, \n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", null);
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      assertEquals("xyz@gmail.com", appt0.getEmailAddress());
      appt0.setValid();
  }
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      assertEquals(true, appt0.isOn(9, 10, 2018));
      appt0.setValid();
  }
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      assertEquals(true, appt0.hasTimeSet());
      appt0.setValid();
  }
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, -1, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t-1/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt(25, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/9/2018 at 13:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
}
