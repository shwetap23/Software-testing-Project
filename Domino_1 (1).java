import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Domino_1 {

	public static void main(String[] args) throws InterruptedException {
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhavi\\Desktop\\Selenium Jar\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver D=new ChromeDriver();
		D.get("https://www.dominos.co.in/");
		D.manage().window().maximize();	
	    D.findElement(By.linkText("OUR MENU")).click();
	    Thread.sleep(2000);
		D.findElement(By.xpath("//*[@id=\"veg-pizzas\"]/div[2]/div/div[1]/div/a")).click();
	    Thread.sleep(2000);
	   
	    
	    JavascriptExecutor js00 = (JavascriptExecutor) D;
	//  js00.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    js00.executeScript("window.scrollBy(0,4000)");
	    Thread.sleep(3000);
	    js00.executeScript("window.scrollBy(0,-4000)", "");
	    Thread.sleep(2000);
		
	    D.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
	    Thread.sleep(2000);
	    JavascriptExecutor js01 = (JavascriptExecutor) D;
	  //js01.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    js01.executeScript("window.scrollBy(0,4000)");
	    Thread.sleep(3000);
	    js01.executeScript("window.scrollBy(0,-4000)", "");
	    Thread.sleep(2000);
		
	    D.findElement(By.xpath("//a[contains(text(),'Side Orders')]")).click();
	    JavascriptExecutor js02 = (JavascriptExecutor) D;
	   //js02.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    js02.executeScript("window.scrollBy(0,4000)");
	    Thread.sleep(3000);
	    js02.executeScript("window.scrollBy(0,-4000)", "");
	    Thread.sleep(2000);
	    
	    D.findElement(By.xpath("//h2[contains(text(),'Pastas')]")).click();
	    JavascriptExecutor js03 = (JavascriptExecutor) D;
	    //js03.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    js03.executeScript("window.scrollBy(0,4000)");
	    Thread.sleep(3000);
	    js03.executeScript("window.scrollBy(0,-4000)", "");
	    Thread.sleep(2000);
	    
	    Thread.sleep(2000);
	    D.findElement(By.xpath("//h2[contains(text(),'Dips')]")).click();
	    JavascriptExecutor js04 = (JavascriptExecutor) D;
	   // js04.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    js03.executeScript("window.scrollBy(0,4000)");
	    Thread.sleep(3000);
	    js03.executeScript("window.scrollBy(0,-4000)", "");
	    Thread.sleep(2000);
	    
	    Thread.sleep(2000);
	    D.findElement(By.xpath("//h2[contains(text(),'Desserts')]")).click();
	    JavascriptExecutor js05 = (JavascriptExecutor) D;
	 // js05.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    js03.executeScript("window.scrollBy(0,4000)");
	    Thread.sleep(3000);
	    js03.executeScript("window.scrollBy(0,-4000)", "");
	    Thread.sleep(2000);
	    
	    
	    Thread.sleep(2000);
	    D.findElement(By.xpath("//h2[contains(text(),'More')]")).click();
	    JavascriptExecutor js06 = (JavascriptExecutor) D;
	 // js06.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    js03.executeScript("window.scrollBy(0,4000)");
	    Thread.sleep(3000);
	    js03.executeScript("window.scrollBy(0,-4000)", "");
	    Thread.sleep(2000);
	    
	    
	    Thread.sleep(2000);
	    D.findElement(By.xpath("//a[contains(text(),'Beverages')]")).click();
	    JavascriptExecutor js07 = (JavascriptExecutor) D;
	    // js06.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    js07.executeScript("window.scrollBy(0,4000)");
	    Thread.sleep(3000);
	    js07.executeScript("window.scrollBy(0,-4000)", "");
	    Thread.sleep(2000);
	    
	    Thread.sleep(2000);
	    D.findElement(By.xpath("//a[contains(text(),'Choice Of Crusts')]")).click();
	    JavascriptExecutor js08 = (JavascriptExecutor) D;
	    // js06.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    js08.executeScript("window.scrollBy(0,4000)");
	     Thread.sleep(3000);
	     js08.executeScript("window.scrollBy(0,-4000)", "");
	    Thread.sleep(2000);
	    
	    Thread.sleep(2000);
	    D.findElement(By.xpath("//a[contains(text(),'Choice Of Toppings')]")).click();
	    JavascriptExecutor js09 = (JavascriptExecutor) D;
	    // js06.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    js09.executeScript("window.scrollBy(0,4000)");
	     Thread.sleep(3000);
	     js09.executeScript("window.scrollBy(0,-4000)", "");
	    Thread.sleep(2000);
	    
	    Thread.sleep(2000);
	    D.findElement(By.xpath("//a[contains(text(),'Pizza Mania')]")).click();
	    JavascriptExecutor js10 = (JavascriptExecutor) D;
	    // js06.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    js10.executeScript("window.scrollBy(0,4000)");
	     Thread.sleep(3000);
	     js10.executeScript("window.scrollBy(0,-4000)", "");
	    Thread.sleep(2000);
	    
	    Thread.sleep(2000);
	    D.findElement(By.xpath("//a[contains(text(),'Burger Pizza')]")).click();
	    JavascriptExecutor js11 = (JavascriptExecutor) D;
	    // js06.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    js11.executeScript("window.scrollBy(0,4000)");
	     Thread.sleep(3000);
	     js11.executeScript("window.scrollBy(0,-4000)", "");
	    Thread.sleep(2000);
	    
	    Thread.sleep(2000);
	    D.findElement(By.xpath("//a[contains(text(),'chicken')]")).click(); 
	    JavascriptExecutor js12 = (JavascriptExecutor) D;
	    // js06.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    js12.executeScript("window.scrollBy(0,4000)");
	    Thread.sleep(3000);
	    js12.executeScript("window.scrollBy(0,-4000)", "");
	    Thread.sleep(2000);
	    D.navigate().to("https://www.dominos.co.in/");
	    
	    
	
	    
	    //order online button
	      D.findElement(By.xpath("//button[contains(text(),'ORDER ONLINE NOW')]")).click();
	      Thread.sleep(2000);
	      D.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/input[1]")).click(); //Delivery
	      Thread.sleep(2000);
	      D.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("mumbai");
	      Thread.sleep(4000);
	      D.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/div[2]/span[2]")).click(); //locate me
	      Thread.sleep(4000);
	      D.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[2]/div/div[2]/div/div/div[2]/div[3]/div/button/span")).click(); //add to cart
	      Thread.sleep(3000);
	      D.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[2]/div/div[1]/div/div/div[2]/div[3]/div[2]/button/span")).click(); // pop-up window
	      Thread.sleep(3000);
	      D.findElement(By.xpath("//span[contains(text(),'CHECKOUT')]")).click(); //checkout
	      Thread.sleep(4000);
	      System.out.println("Veg Pizza Added Successfully");
	      Thread.sleep(2000);
		  D.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[3]/div[1]/div/div/div[2]/div[2]/div/div/div[2]/ul/li[5]/div/div[2]/div")).click();
	      Thread.sleep(4000);
	      
	      
	    //login-signup page Button
	      
	     D.findElement(By.xpath("//div[contains(text(),'Login | Signup')]")).click(); 
	      Thread.sleep(5000);
	    D.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("9820204735");
	      Thread.sleep(3000);
	      D.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")).click();
	      Thread.sleep(3000); //Submit Button
	   //  D.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).sendKeys("525778");
	      Thread.sleep(4000); //For OTP
	      D.findElement(By.xpath("//span[contains(text(),'SUBMIT')]")).click();
	      Thread.sleep(4000); //sumbit
	      D.findElement(By.xpath("//span[contains(text(),'esc')]")).click(); //cross Button
	      
	      
	     Thread.sleep(3000); 
	     D.navigate().to("https://www.dominos.co.in/");
	     Thread.sleep(3000);  
	     D.findElement(By.xpath("//button[contains(text(),'ORDER ONLINE NOW')]")).click();
	     Thread.sleep(2000);
	     D.findElement(By.xpath("//span[contains(text(),'PASTA PIZZA PARTY')]")).click();
	     Thread.sleep(2000);
	     System.out.println("Pasta Pizza added Successfully");
	     Thread.sleep(2000);
	     D.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[8]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]/span[1]")).click();
	     Thread.sleep(3000); //add to cart for Pasta Pizza
	     D.findElement(By.xpath("//span[contains(text(),'NON-VEG PIZZA')]")).click();
	      Thread.sleep(3000);
	     System.out.println("Non-Veg Pizza added Successfully");
		 Thread.sleep(2000);
	     D.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[8]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/button[1]/span[1]")).click();
	     Thread.sleep(3000);//add to cart Non veg pizza 
	     D.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[8]/div/div[1]/div/div/div[2]/div[3]/div[1]/button/span")).click();
		 Thread.sleep(2000);//popup-window
		 System.out.println("extra Cheeze added Successfully");
		 Thread.sleep(2000);
	     D.findElement(By.xpath("//span[contains(text(),'MEALS & COMBOS')]")).click();
	     Thread.sleep(3000);
	     System.out.println("Meals & combos added Successfully");
		 Thread.sleep(2000);
	     D.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[10]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]/span[1]")).click();
	     Thread.sleep(3000);
	     D.findElement(By.xpath("//span[contains(text(),'PIZZA MANIA')]")).click();
	     Thread.sleep(3000);
	     System.out.println("Pizza Mania added Successfully");
		 Thread.sleep(2000);
	     D.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[12]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/button[1]")).click();
	     Thread.sleep(3000);
	     D.findElement(By.xpath("//span[contains(text(),'SPECIALITY CHICKEN')]")).click();
	     Thread.sleep(3000);
	     System.out.println("Chicken added Successfully");
		 Thread.sleep(2000);
	     D.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[14]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]/span[1]")).click();
	     Thread.sleep(3000);
	     D.findElement(By.xpath("//span[contains(text(),'SIDES')]")).click();
	     Thread.sleep(3000);
	     System.out.println("Garlic Bread added Successfully");
		 Thread.sleep(2000);
	     D.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[16]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]/span[1]")).click();
	     Thread.sleep(3000);
	     D.findElement(By.xpath("//span[contains(text(),'CHECKOUT')]")).click(); //checkout
	     Thread.sleep(4000);
	     D.navigate().to("https://www.dominos.co.in/");
	      
	     /*this is for 3 lines
	      D.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div/div[1]/div[1]/span[1]")).click();
	      Thread.sleep(4000);
	      D.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div/div[1]/div[2]/div/div[3]/div/div/div/div/ul/li[3]/div/span")).click();
	      Thread.sleep(4000); */
	     
	     //FOR Chat Us
	      Thread.sleep(4000);
	      D.findElement(By.xpath("//body/div[@id='ymPluginDivContainerInitial']/div[@id='ymDivCircle']/img[1]")).click();
	      Thread.sleep(4000);
	      D.findElement(By.xpath("//iframe[@id='ymIframe']")).click();
	      Thread.sleep(4000);
	      D.findElement(By.xpath("//div[@id='ymDivCircle']")).click();
	      Thread.sleep(4000);
	      
	      //for Coupon
	      Thread.sleep(4000);
	      D.findElement(By.xpath("//img[@id='offers-item0']")).click();
	      Thread.sleep(4000);
	      D.findElement(By.xpath("//a[contains(text(),'SELECT LOCATION')]")).click();
	      Thread.sleep(4000);
	      D.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[3]/div[1]/button[1]")).click();
	      Thread.sleep(4000);
	      D.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[2]/div/div[1]/div/div/div[2]/div[3]/div[1]/button/span")).click();
	      Thread.sleep(4000);
	      D.findElement(By.xpath("//span[contains(text(),'CHECKOUT')]")).click();
	      Thread.sleep(4000);
	      D.navigate().to("https://www.dominos.co.in/");
	      Thread.sleep(4000);
	      
	      
	     //Store Finder 
	      
	      
	       D.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   D.findElement(By.xpath("//a[contains(text(),'STORE FINDER')]")).click();
           D.findElement(By.xpath("//a[contains(text(),'Search Nearby')]")).click();
	       WebElement E1= D.findElement(By.xpath("//input[@id='normal-search-block']")); 
		   E1.sendKeys("Venenzia Pune Mumbai Highway Balewadi, Pune Mumbai Highway Balewadi - 411045");
		   E1.sendKeys(Keys.ARROW_DOWN);
		   E1.sendKeys(Keys.ENTER);
		   D.findElement(By.xpath("//a[@id='normal-search-block-submit']")).click();
		   Thread.sleep(4000);
			
		 //Advanced Search Button
		   D.findElement(By.xpath("//a[contains(text(),'Advanced Search')]")).click();
		   D.findElement(By.xpath("//select[@id='advanced-search-block-state']")).sendKeys("Andhra Pradesh");
		   D.findElement(By.xpath("//select[@id='advanced-search-block-city']")).sendKeys("Guntur");
		   D.findElement(By.xpath("//select[@id='advanced-search-block-locality']")).sendKeys("-- Select Locality --");
		   D.findElement(By.xpath("//a[@id='advanced-search-block-submit']")).click();
		   D.findElement(By.xpath("//body/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[2]/a[1]")).click();
		   Thread.sleep(4000);
		   D.findElement(By.xpath("//body/div[1]/div[2]/div[1]/ol[1]/li[1]/a[1]/span[1]")).click();
		   Thread.sleep(2000);
		   D.navigate().to("https://www.dominos.co.in/"); 
		      
		      
		   
		      
	       //gift card
	       D.findElement(By.linkText("GIFT CARD")).click();
		   Thread.sleep(2000);
			
			//view all
	       D.findElement(By.linkText("View All")).click();
	       Thread.sleep(2000);
			
			 
			//Frequently Asked Question
			D.findElement(By.xpath("//label[contains(text(),'Frequently Asked Questions')]")).click();
	        D.findElement(By.xpath("//label[contains(text(),'1. How can I purchase any form of Gift voucher?')]")).click();
		    D.findElement(By.xpath("//label[contains(text(),'2. Which are the different gift cards being sold b')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'3. What can be bought using a Dominos gift card/vo')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'4. How to redeem Gift card? How to activate Domino')]")).click();
			Thread.sleep(2000);
			D.findElement(By.xpath("//label[contains(text(),'5. What if OTP is not delivered to customer?')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'6. How to check Dominos Gift Card balance?')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'7. Is customer charged for SMS, when they register')]")).click();
			Thread.sleep(2000);
			D.findElement(By.xpath("//label[contains(text(),'8. How is Dominos Physical card different from Ele')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'9. In what denominations is Dominos Gift Card sold')]")).click();
		    D.findElement(By.xpath("//label[contains(text(),'10. In what denominations is Dominos Electronic Vo')]")).click();
		    Thread.sleep(2000);
		    D.findElement(By.xpath("//label[contains(text(),'11. What is validity of Gift Card?')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'12. What is validity of Electronic Gift Voucher?')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'13. How long does it take to receive Gift Card whe')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'14. Can I purchase more than 1 Gift Card at a time')]")).click();
			Thread.sleep(2000);
			D.findElement(By.xpath("//label[contains(text(),'15. How do I use the Dominos Gift Card at the Webs')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'16. Should the entire value of the Dominos Gift Ca')]")).click();
		    D.findElement(By.xpath("//label[contains(text(),'18. What can be done if the billed value exceeds t')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'19. How can the gift cards be recharged/reloaded?')]")).click();
		    Thread.sleep(2000);
			D.findElement(By.xpath("//label[contains(text(),'20. How is the validity of the gift card determine')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'21. What is the minimum/maximum amount for reload/')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'22. Where can the gift cards be purchased?')]")).click();
			Thread.sleep(2000);
			D.findElement(By.xpath("//label[contains(text(),'23. Is OTP required in case of online redemption o')]")).click();
	        D.findElement(By.xpath("//label[contains(text(),'24. Can gift cards be used along with credit cards')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'25. My order was unsuccessful, your website gave m')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'26. My order was Cancelled, Can I use my electroni')]")).click();
			Thread.sleep(2000);
			D.findElement(By.xpath("//label[contains(text(),'27. I am unable to use electronic gift voucher. It')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'28. My Electronic gift voucher says already used o')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'29. My Electronic gift voucher has expired and I h')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'30. I had Electronic gift voucher of larger value ')]")).click();
			D.findElement(By.xpath("//label[contains(text(),'31. My order was late and I made payment through E')]")).click();
			Thread.sleep(2000);
				
					
		 //**FOR Carporate_query**
			Thread.sleep(2000); 
			D.findElement(By.xpath("//a[contains(text(),'Corporate enquiry')]")).click();
			D.findElement(By.xpath("//input[@id='name']")).sendKeys("Santoshi");
			D.findElement(By.xpath("//input[@id='organisation']")).sendKeys("ABC");
			D.findElement(By.xpath("//input[@id='mobile']")).sendKeys("1234567890");
			D.findElement(By.xpath("//input[@id='emailid']")).sendKeys("santoshi@gmail.com");
			D.findElement(By.xpath("//input[@id='location']")).sendKeys("Kolhapur");
			Thread.sleep(2000);
			D.findElement(By.xpath("//input[@id='date']")).click();
			Thread.sleep(2000);
			D.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]/a")).click();
			Thread.sleep(2000);
			D.findElement(By.xpath("//textarea[@id='query']")).sendKeys("Kolhapur");
			Thread.sleep(2000);
		//	D.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/form/button"));
			Thread.sleep(2000);
			System.out.println("Submitted successfully");
			Thread.sleep(2000);
		    D.navigate().to("https://www.dominos.co.in/");
		    Thread.sleep(2000);
				 
	    //	Defect-	E Gift Voucher
			/*	D.findElement(By.xpath("//*[@id=\"our-menu\"]/ul/li[2]/a")).click();
				System.out.println("Title of page :"+D.getTitle());
				D.navigate().back();
				Thread.sleep(2000); 	*/
			
		//for contact Button
			Thread.sleep(2000);
			D.findElement(By.xpath("//*[@id=\"top-header\"]/ul/li[5]/a")).click(); 
			Thread.sleep(2000);
				
				
		//For mail
		     Actions A=new Actions(D);
			 A.moveToElement(D.findElement(By.xpath("//body/div[1]/div[2]/section[1]/div[3]/ul[1]/li[1]/div[1]/img[1]"))).perform();
		     Thread.sleep(2000);
			
		//For Find Your nearest outlet
			 A.moveToElement(D.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/section[1]/div[3]/ul[1]/li[2]/div[1]/img[1]"))).perform();
			 Thread.sleep(2000);
			 
				
		//For facebook page
			 D.findElement(By.xpath("//body/div[1]/div[2]/section[1]/div[4]/section[1]/div[3]/div[1]/div[1]/p[1]/a[1]")).click();
			 Thread.sleep(2000);
			 System.out.println("facebook page opened successfully");
			 D.navigate().back();
				
		//For google plus page
			Thread.sleep(2000);
			D.findElement(By.xpath("//body/div[1]/div[2]/section[1]/div[4]/section[1]/div[3]/div[1]/div[2]/p[1]/a[1]")).click();
			Thread.sleep(2000);
			System.out.println("Google Plus page opened successfully");
			Thread.sleep(2000);
			D.navigate().back();
				
		//For instagram page
			D.findElement(By.xpath("//body/div[1]/div[2]/section[1]/div[4]/section[1]/div[3]/div[1]/div[3]/p[1]/a[1]")).click();
			System.out.println("Instagram page opened successfully");
			D.navigate().back();
				
		//For twitter page
			D.findElement(By.xpath("//body/div[1]/div[2]/section[1]/div[4]/section[1]/div[3]/div[1]/div[4]/p[1]/a[1]")).click();
			System.out.println("Twitter page opened successfully");
			D.navigate().to("https://www.dominos.co.in/");
		    Thread.sleep(2000);
				
		//Home Mainpage
		//For blog
			JavascriptExecutor js = (JavascriptExecutor) D;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			js.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(2000);
				
			D.findElement(By.linkText("Blog")).click();
			Thread.sleep(2000);
			D.findElement(By.xpath("//body/div[@id='wrap']/div[2]/div[2]/form[1]/input[1]")).sendKeys("Pizza");
			D.findElement(By.xpath("//body/div[@id='wrap']/div[2]/div[2]/form[1]/input[2]")).click();
			Thread.sleep(2000);
			D.get("https://www.dominos.co.in/");
			    
		//For investor
		    JavascriptExecutor js2 = (JavascriptExecutor) D;
		    js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		    js2.executeScript("window.scrollBy(0,2000)");
		    Thread.sleep(2000);  
			D.findElement(By.linkText("Investor")).click();
			Thread.sleep(2000);
		    System.out.println("Investor page open successfully");
			D.get("https://www.dominos.co.in/");
				
			
		//For feedback
			JavascriptExecutor js3 = (JavascriptExecutor) D;
		    js3.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
		    js3.executeScript("window.scrollBy(0,2000)");
		    Thread.sleep(2000);
		     
		    D.findElement(By.linkText("FeedBack")).click();
			D.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/section[1]/div[1]/div[1]/section[2]/form[1]/section[1]/div[1]/div[1]/label[2]/input[1]")).click();
			D.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Santoshi");
			D.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Lohar");
			Thread.sleep(2000);
			Select s= new Select(D.findElement(By.xpath("//select[@id='city-list']")));
			s.selectByValue("KOHLAPUR");
			Thread.sleep(2000);
			D.findElement(By.xpath("//input[@id='contact_no']")).sendKeys("1234567890");
			D.findElement(By.xpath("//input[@id='email']")).sendKeys("Santoshi@123");
			D.findElement(By.xpath("//input[@id='next']"));
			D.navigate().to("https://www.dominos.co.in/");
			

		//For ADS
			JavascriptExecutor js4 = (JavascriptExecutor) D;
		    js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		    js4.executeScript("window.scrollBy(0,2000)");
		    Thread.sleep(2000);
			D.findElement(By.linkText("Ads")).click();
			System.out.println("Investor page open successfully");
			D.get("https://www.dominos.co.in/");
				
				
			}

		}

	
	     
	


