package Practice;

import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NEWPRACTICE {

	public static void main(String[] args) throws InterruptedException {
        String str="ito am from india";
       String arr[]= str.split(" ");
       for(int i=0;i<=arr.length-1;i++){
           if(i==1||i==2){
               String st=arr[i];
               String rev="";
               for(int i1=st.length()-1;i1>=0;i1--){
                   rev=rev+st.charAt(i1);
                  
               }
                                  System.out.println(rev);
           }
           else {
           System.out.println(arr[i]);
           }
       }		
		
		
			}
				
	
}
