package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
Thread.sleep(2000);
List<WebElement> ele = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
ArrayList<String> arry=new ArrayList<String>();
Thread.sleep(2000);
for (WebElement webElement : ele) {
	
String valu = webElement.getText();
arry.add(valu);
System.out.println(arry);
	
}
Collections.sort(arry);
System.out.println(arry);
	}

}
