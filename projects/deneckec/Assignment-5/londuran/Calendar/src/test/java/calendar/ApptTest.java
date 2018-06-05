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
  //Month > 12
  /*
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
  */
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
  //Month < 1
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
  //hour < 0
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt(-1, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/9/2018 at -1:30am ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  //Hour > 24
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt(25, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/9/2018 at 13:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }

  //Doesn't work
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
      assertTrue(appt0.isOn(9, 10, 2018));
      assertFalse(appt0.isOn(10, 10, 2018));
      assertFalse(appt0.isOn(10, 11, 2018));
      assertFalse(appt0.isOn(10, 10, 2019));
  }
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
    Appt appt0 = new Appt(40, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt0.setValid();
    assertFalse(appt0.getValid());

    Appt appt1 = new Appt(15, 80, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt1.setValid();
    assertFalse(appt1.getValid());

    Appt appt2 = new Appt(15, 30, 50, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt2.setValid();
    assertFalse(appt2.getValid());

    Appt appt3 = new Appt(15, 30, 50, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt3.setValid();
    assertFalse(appt3.getValid());

    Appt appt4 = new Appt(15, 30, 9, 50, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt4.setValid();
    assertFalse(appt4.getValid());

    Appt appt5 = new Appt(15, 30, 9, 10, -5, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt5.setValid();
    assertFalse(appt5.getValid());

    Appt appt6 = new Appt(-1, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt6.setValid();
    assertFalse(appt6.getValid());

    Appt appt7 = new Appt(15, -1, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt7.setValid();
    assertFalse(appt7.getValid());

    Appt appt8 = new Appt(15, 30, -1, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt8.setValid();
    assertFalse(appt8.getValid());

    Appt appt9 = new Appt(15, 30, 9, -1, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt9.setValid();
    assertFalse(appt9.getValid());

    Appt appt10 = new Appt(0, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt10.setValid();
    assertTrue(appt10.getValid());

    Appt appt11 = new Appt(23, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt11.setValid();
    assertTrue(appt11.getValid());

    Appt appt12 = new Appt(15, 0, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt12.setValid();
    assertTrue(appt12.getValid());

    Appt appt13 = new Appt(15, 59, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt13.setValid();
    assertTrue(appt13.getValid());

    Appt appt14 = new Appt(15, 30, 1, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt14.setValid();
    assertTrue(appt14.getValid());

    Appt appt15 = new Appt(15, 30, 31, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt15.setValid();
    assertTrue(appt15.getValid());

    Appt appt16 = new Appt(15, 30, 9, 1, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt16.setValid();
    assertTrue(appt16.getValid());

    Appt appt17 = new Appt(15, 30, 9, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt17.setValid();
    assertTrue(appt17.getValid());

    Appt appt18 = new Appt(15, 30, 9, 10, 1, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt18.setValid();
    assertTrue(appt18.getValid());

    Appt appt19 = new Appt(15, 30, 9, 10, 0, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt19.setValid();
    assertFalse(appt19.getValid());

    Appt appt20 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt20.setValid();
    appt20.setRecurrence(null, 2, 1, 10);
    assertEquals(1, appt20.getRecurIncrement());

    Appt appt21 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt21.setValid();
    appt21.setRecurrence(null, 2, 1, 10);
    assertEquals(10, appt20.getRecurNumber());
  }
}

//166