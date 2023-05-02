package com.crm.Practice;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("https://www.makemytrip.com/");
Actions act=new Actions(driver);
act.moveByOffset(10, 10).perform();
driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/bus-tickets/']")).click();
Thread.sleep(2000);
driver.findElement(By.id("fromCity")).click();
driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bangalore");
driver.findElement(By.xpath("//span[.='Bangalore, Karnataka']")).click();
Thread.sleep(2000);
//driver.findElement(By.id("toCity")).click();
//Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("mysore");
Thread.sleep(2000);
driver.findElement(By.xpath("//span[.='Mysore, Karnataka']")).click();
Thread.sleep(2000);
Date da=new Date();
String[] data = da.toString().split(" ");
System.out.println(da);
String date=data[0];
String month=data[1];
String year=data[2];
String datemonthyear=date+"-"+month+"-"+year;
System.out.println(datemonthyear);
	}

}
