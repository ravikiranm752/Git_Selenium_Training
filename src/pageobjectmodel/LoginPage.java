package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	public WebElement textbox_username;
	
	@FindBy(id="password")
	public WebElement textbox_password;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/form[1]/div[4]/div[2]/button[1]")
	public WebElement btn_login;

}
