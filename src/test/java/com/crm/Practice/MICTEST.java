package com.crm.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import okio.Options;

public class MICTEST {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();

driver.get("https://mictests.com/");
driver.findElement(By.xpath("//button[.='Test my mic']")).click();
Thread.sleep(2000);

	}

}
