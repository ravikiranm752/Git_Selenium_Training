package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEx4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.naukri.com/nlogin/login?utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=Cj0KCQjwhYS_BhD2ARIsAJTMMQZglF825eG0bKXfNEn2Wy3vCS4UnYPRwMUNw9S2pUr-niYnByokeIoaArlkEALw_wcB&gclsrc=aw.ds");

		driver.findElement(By.id("usernameField")).sendKeys("abc");
		driver.findElement(By.id("passwordField")).sendKeys("abc1234");

		driver.findElement(By.xpath("//button[@data-ga-track='spa-event|login|login|Save||||true']")).click();
	}

}
