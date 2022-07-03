package TheKiranacdemy.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;

import Thekiranacdemy.page.*;

public class LoginTest {
	WebDriver driver=null;
	Dashboardpage dp= null;
	
	@Test
	public void test1(){
		System.setProperty("Webdriver.crome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///G:/Driver/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

	
	    LoginPageObject lp = new LoginPageObject(driver);
	    
	   // lp.loginToApplication("kiran@gmail.com", "123456");
	    dp=lp.getdashboard();
	    Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
	@Test
	public void test2(){
		Assert.assertTrue(dp.verifycourses());
		System.out.println("True");
	}
		
	}


