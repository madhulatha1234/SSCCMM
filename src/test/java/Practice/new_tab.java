package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class new_tab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		//driver.get("https://www.Facebook.com");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.location=arguments[0]","https://www.Facebook.com");
//		Thread.sleep(2000);
//		WebElement element = driver.findElement(By.id("email"));
//		Thread.sleep(2000);
//		
//		js.executeScript("arguments[0].value=arguments[1]",element,"madhu");
		//WebElement fashion = driver.findElement(By.xpath("(//div[.='Fashion'])[4]"));
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement val = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]"));
		Select sel=new Select(val);
		List<WebElement> opt = sel.getOptions();
		opt.toString();
	System.out.println(opt);
		
	}

	
	

}
