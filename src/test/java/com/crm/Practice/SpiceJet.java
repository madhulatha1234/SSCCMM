package com.crm.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SpiceJet {
public static void main (String[]args) {
	//FirefoxOptions op=new FirefoxOptions();
	//ChromeOptions op=new ChromeOptions();
	//op.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.spicejet.com/");
}
}
