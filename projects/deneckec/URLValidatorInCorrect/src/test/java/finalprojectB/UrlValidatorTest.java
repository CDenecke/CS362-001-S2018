
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

   
   /*
   public void testManualTest()
   {
   //You can use this function to implement your manual testing
      String[] schemes = {"http","https"};	   
	  UrlValidator validator = new UrlValidator(schemes);
      assertFalse(validator.isValid(null));
      assertTrue(validator.isValid("https://google.com"));
      assertFalse(validator.isValid("welikjweogij://google.com"));
      
      assertFalse(validator.isValid("https://garbwleikkjfwoijeg.com"));
      assertFalse(validator.isValid("https://google.weoijfwe"));
      
   }
   */
   /*
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
	   		assertTrue(validator.isValid("https://fghkjsdklhjlksdf.com"));
	   		assertTrue(validator.isValid("https://oregonstate.ksdfhkjsg"));
	   		assertFalse(validator.isValid("https:/ksdfhjkshkdfjakg/youtube.com"));
	   		assertTrue(validator.isValid("https://facebook.comsdgflksaghjkhgas"));
	   		assertTrue(validator.isValid("https://reddit.orgkdghkjhasjkg"));
	   		assertTrue(validator.isValid("https://wikipedia"));
	   		assertTrue(validator.isValid("https://twitter.gov"));
   }
   */
   //You need to create more test cases for your Partitions if you need to 
   
   public void testIsValid()
   {
	   //You can use this function for programming based testing
	      String[] schemes = {"http","https"};	   
		  UrlValidator validator = new UrlValidator(schemes);
		  String[] urls = {
		  					 	"https://google.com","hasdkfjsdfkjl://google.com",
				  		 		"https://youtube.com","httpssdfsadgas://bing.com",
				  		 	 	"https://facebook.com","https:gsdafdgagsdf//yahoo.com",
				  		 	 	"https://baidu.com", "https:gsdafdgagsdf//yahoo.com",
				  		 	 	"https://wikipedia.org", "https:gsdafdgagsdf//yahoo.com",
				  		 	  	"https://reddit.com","https:/ksdfhjkshkdfjakg/youtube.com",
				  		 	  	"https://yahoo.com", "https:/ksdfhjkshkdfjakg/youtube.com",
				  		 	  	//"https://qq.com", "https://reddit.orgkdghkjhasjkg",
				  		 	  	"https://taobao.com",  "https:/ksdfhjkshkdfjakg/youtube.com",//16
					  		   	"https://google.co.in", "https:/ksdfhjkshkdfjakg/youtube.com",
					  		   	"https://amazon.com","amazon.com",
					  		   	"https://tmall.com", "https:/ksdfhjkshkdfjakg/youtube.com",
					  		   	"https://twitter.com","httsdfesifhfe.sma",
					  		   	"https://sohu.com","com.google//:http",
					  		   	"https://instagram.com",".com",
				  		   	"https://vk.com",".org",
				  		   	"https://live.com","http//bing.com",
				  		   	"https://jd.com","shttpsklsjalkflkjs.america",
				  		   	"https://sina.com.cn","com.gnib",
				  		   	"https://weibo.com","http://weeeeeee",
				  		   	"https://yandex.ru","htpt:/gheinsdmgje....corn",
				  		   	"https://360.cn","bert.bertieee.gone",
				  		   	"https://google.co.jp","chase.nickoli.com",
				  		   	"https://google.co.uk","theiah;lksf.com",
				  		   	"https://netflix.com","sfjalejglisjglijsliaf",
				  		   	"https://msn.com","msn",
				  		   	"https://twitch.tv","outisedse.lol",
				  		   	"https://microsoft.com","iamgroottttt",
				  		   	"https://bing.com", "loghebks.gov",
				  		   	"https://ebay.com", "poeting.yes",


				  		   	//valid?
				  		   	"https://",
				  		   	"https://twitter.gov",
				  		   	"https://wikipedia",
				  		   	"https://facebook.comsdgflksaghjkhgas",
				  		   	"https://oregonstate.ksdfhkjsg",
				  		   	"https://fghkjsdklhjlksdf.com"
		  };
		  
		  Random rand = new Random();
		  
		  for(int i= 0; i < 22; i++) {
			  //int  n = rand.nextInt(60);
			  if(i % 2 == 0) {
			  	//System.out.println("urls[" + i + "] = " + urls[i]);
				  assertTrue(validator.isValid(urls[i]));
			  }
			  else {
			  				  	// System.out.println("urls[" + i + "] = " + urls[i]);

				  assertFalse(validator.isValid(urls[i]));
			  }
			  
		  }
   }
}
