
package finalprojectB;

import junit.framework.TestCase;
//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {

   
   public UrlValidatorTest(String testName) {
      super(testName);

   }

   
   
   public void testManualTest()
   {
   //You can use this function to implement your manual testing
      String[] schemes = {"http","https"};	   
	   UrlValidator validator = new UrlValidator(schemes);
      assertFalse(validator.isValid(null));
      assertFalse(validator.isValid("http://google.com"));
      /*
      assertFalse(validator.isValid("welikjweogij://google.com"));
      assertFalse(validator.isValid("https://garbwleikkjfwoijeg.com"));
      assertFalse(validator.isValid("https://google.weoijfwe"));
      */
   }
   
   
   public void testYourFirstPartition()
   {
	 //You can use this function to implement your First Partition testing	   

   }
   
   public void testYourSecondPartition(){
		 //You can use this function to implement your Second Partition testing	   

   }
   //You need to create more test cases for your Partitions if you need to 
   
   public void testIsValid()
   {
	   //You can use this function for programming based testing

   }
   


}
