package com.crm.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage  {
	//WebDriverUtili
@FindBy (id="login:username")
private WebElement username;

@FindBy(id="login:password")
private WebElement password;

@FindBy(id="login:type")
private WebElement loginbutton;

}
