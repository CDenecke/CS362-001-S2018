
package finalprojectB;

import junit.framework.TestCase;
import java.util.Random;
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
      assertTrue(validator.isValid("http://google.com"));
      assertFalse(validator.isValid("welikjweogij://google.com"));
      assertFalse(validator.isValid("https://garbwleikkjfwoijeg.com"));
      assertFalse(validator.isValid("https://google.weoijfwe"));
   }
   
   
   public void testYourFirstPartition()
   {
	 //You can use this function to implement your First Partition testing
	      String[] schemes = {"http","https"};	   
		  UrlValidator validator = new UrlValidator(schemes);
	      assertTrue(validator.isValid("https://google.com"));
	      assertTrue(validator.isValid("https://bing.com"));
	      assertTrue(validator.isValid("https://yahoo.com"));
	      assertTrue(validator.isValid("https://aol.com"));
	      assertTrue(validator.isValid("https://oregonstate.edu"));
	      assertTrue(validator.isValid("https://youtube.com"));
	      assertTrue(validator.isValid("https://facebook.com"));
	      assertTrue(validator.isValid("https://reddit.com"));
	      assertTrue(validator.isValid("https://wikipedia.org"));
	      assertTrue(validator.isValid("https://twitter.com"));
   }
   
   public void testYourSecondPartition(){
		 //You can use this function to implement your Second Partition testing	   
	   		String[] schemes = {"http","https"};	   
	   		UrlValidator validator = new UrlValidator(schemes);
	   		assertFalse(validator.isValid("hasdkfjsdfkjl://google.com"));
	   		assertFalse(validator.isValid("httpssdfsadgas://bing.com"));
	   		assertFalse(validator.isValid("https:gsdafdgagsdf//yahoo.com"));
	   		assertFalse(validator.isValid("https://fghkjsdklhjlksdf.com"));
	   		assertFalse(validator.isValid("https://oregonstate.ksdfhkjsg"));
	   		assertFalse(validator.isValid("https:/ksdfhjkshkdfjakg/youtube.com"));
	   		assertFalse(validator.isValid("https://facebook.comsdgflksaghjkhgas"));
	   		assertFalse(validator.isValid("https://reddit.orgkdghkjhasjkg"));
	   		assertFalse(validator.isValid("https://wikipedia"));
	   		assertFalse(validator.isValid("https://twitter.gov"));
   }
   //You need to create more test cases for your Partitions if you need to 
   
   public void testIsValid()
   {
	   //You can use this function for programming based testing
	      String[] schemes = {"http","https"};	   
		  UrlValidator validator = new UrlValidator(schemes);
		  String[] urls = {"https://google.com","T","hasdkfjsdfkjl://google.com","F",
				  		   "https://youtube.com","T","httpssdfsadgas://bing.com","F",
				  		   "https://facebook.com","T","https:gsdafdgagsdf//yahoo.com","F",
				  		   "https://baidu.com","T","https://fghkjsdklhjlksdf.com","F",
				  		   "https://wikipedia.org","T","https://oregonstate.ksdfhkjsg","F",
				  		   "https://reddit.com","T","https:/ksdfhjkshkdfjakg/youtube.com","F",
				  		   "https://yahoo.com","T","https://facebook.comsdgflksaghjkhgas","F",
				  		   "https://qq.com","T","https://reddit.orgkdghkjhasjkg","F",
				  		   "https://taobao.com","T","https://wikipedia","F",
				  		   "https://google.co.in","T","https://twitter.gov","F",
				  		   "https://amazon.com","T","amazon.com","F",
				  		   "https://tmall.com","T","https://","F",
				  		   "https://twitter.com","T","httsdfesifhfe.sma","F",
				  		   "https://sohu.com","T","com.google//:http","F",
				  		   "https://instagram.com","T",".com","F",
				  		   "https://vk.com","T",".org","F",
				  		   "https://live.com","T","http//bing.com","F",
				  		   "https://jd.com","T","shttpsklsjalkflkjs.america","F",
				  		   "https://sina.com.cn","T","com.gnib","F",
				  		   "https://weibo.com","T","http://weeeeeee","F",
				  		   "https://yandex.ru","T","htpt:/gheinsdmgje....corn","F",
				  		   "https://360.cn","T","bert.bertieee.gone","F",
				  		   "https://google.co.jp","T","chase.nickoli.com","F",
				  		   "https://google.co.uk","T","theiah;lksf.com","F",
				  		   "https://netflix.com","T","sfjalejglisjglijsliaf","F",
				  		   "https://msn.com","T","msn","F",
				  		   "https://twitch.tv","T","outisedse.lol","F",
				  		   "https://microsoft.com","T","iamgroottttt","F",
				  		   "https://bing.com","T","loghebks.gov","F",
				  		   "https://ebay.com","T","poeting.yes","F"};
		  
		  Random rand = new Random();
		  
		  for(int i= 0; i < 100; i++) {
			  int  n = rand.nextInt(60);
			  if(n % 2 == 0) {
				  assertTrue(validator.isValid(urls[n]));
			  }else {
				  assertFalse(validator.isValid(urls[n]));
			  }
		  }
   }
   


}
