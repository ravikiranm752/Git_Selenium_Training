package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void sample () {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.purnadata.in/PurnaDemo/index.php");

		WebElement textbox_username = driver.findElement(By.id("username"));
		textbox_username.sendKeys("admin");

		driver.findElement(By.name("password")).sendKeys("admin");

		driver.findElement(By.name("submit")).click();

	}
	
}
