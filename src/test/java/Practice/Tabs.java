package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tabs {

	static public  void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Robot rbt=new Robot();
		for(int i=0;i<=3;i++) {
			Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_T);
		rbt.keyRelease(KeyEvent.VK_T);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		}
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> as=new ArrayList<String>(ids);
		for(int i=0;i<=as.size();i++) {
			//String yyy = as.get(i);
		String jjj = as.get(3);
		driver.switchTo().window(jjj);
		driver.close();
		//driver.get("https://english.bmrc.co.in/#/");
		}
		
		}
	

}
