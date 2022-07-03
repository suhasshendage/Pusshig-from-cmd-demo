package com.jbk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	WebDriver driver;
	public void correctCredential(){
	 
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	driver.findElement(By.xpath("//button")).click();
}
}
