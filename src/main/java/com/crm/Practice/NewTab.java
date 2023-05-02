package com.crm.Practice;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTab {
	@Test
	public void testt() {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.Facebook.com");
	WebElement element = driver.findElement(By.id("email"));
	JavascriptException js=(JavascriptException)driver;
	js.executeScript();
	}
}
