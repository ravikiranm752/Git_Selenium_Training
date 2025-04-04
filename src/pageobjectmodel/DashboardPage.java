package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	public DashboardPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/b[1]")
	public WebElement link_Main;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]")
	public WebElement link_Purchase;
}
