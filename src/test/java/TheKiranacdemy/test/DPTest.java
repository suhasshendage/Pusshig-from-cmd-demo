package TheKiranacdemy.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class DPTest {
	 WebDriver driver=null;
	 
	@BeforeSuite
	public void setup(){
	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   driver = new ChromeDriver();   
}
  @Test(dataProvider = "logindata")
  public void f(String uname, String pass,String ErrMsg,String Errpass) {
	  
	  driver.get("file:///G:/Driver/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	  driver.findElement(By.id("email")).sendKeys(uname);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//button")).click();
	  
	  if(driver.getTitle().equals("JavaBykiran | Dashboard"))
		  Assert.assertEquals(driver.getTitle(), "JavaBykiran | Dashboard");
	  else{
		  WebElement emailErr= driver.findElement(By.id("email_error"));
		  Assert.assertEquals(emailErr.getText(), ErrMsg);
		  
		  WebElement PassErr= driver.findElement(By.id("password_error"));
		  Assert.assertEquals(PassErr.getText(), Errpass);
	  }
  }
 
  @DataProvider
  public Object[][] logindata() {
    return new Object[][] {
      new Object[] { " ", "" ,"Please enter valid email.","Please enter password."},
      new Object[] { "suhas", "shendage" ,"Please enter email as kiran@gmail.com","Please enter password 123456"}, 
      new Object[] { "kiran@gmail.com", "suhas","",  "Please enter password 123456" },
      new Object[] { "kiran@gmail.com", "123456","", " " },
      
    };
  } 
}
