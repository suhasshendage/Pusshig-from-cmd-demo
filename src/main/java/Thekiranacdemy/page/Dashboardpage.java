package Thekiranacdemy.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardpage {
	
	@FindBy(xpath="//h3")
	List<WebElement> courses;
	
	public Dashboardpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public boolean verifycourses(){
		boolean flag=false;
		for(WebElement course : courses){
			flag=course.isDisplayed();
		}
		return flag;
	}

}
