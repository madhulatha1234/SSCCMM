package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class flipkart {

	public static void main(String[] args) throws InterruptedException 
	{
//WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://flipkart.com/");
driver.findElement(By.xpath("//button[.='✕']")).click();
////div[@class='_4rR01T']/../../div/following-sibling::div//div[@class='_30jeq3 _1_WHN1']
////div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/div/following-sibling::div//div[@class='_30jeq3 _1_WHN1']
driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("laptops");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	WebElement val = driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_1AtVbE col-12-12']//div[@class='_30jeq3 _1_WHN1']"));
	System.out.println("first value"+val.getText());
	List<WebElement> value = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_1AtVbE col-12-12']//div[@class='_30jeq3 _1_WHN1']"));
	//System.out.println("first value"+value);
	Thread.sleep(2000);
	for(int i=1;i<value.size()-1;i++) {
		
		String text = value.get(i).getText();
	
		String text1 = text.substring(1);
		String text2 = text1.replace(",", "");
		//System.out.println(text2);
	
		int values=Integer.parseInt(text2);
		if(values>35000 && values<50000) {
			System.out.println(values);
		}
		
	}
	
	}

}
