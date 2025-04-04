package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.purnadata.in/PurnaDemo/index.php");

		WebElement textbox_username = driver.findElement(By.id("username"));
		textbox_username.sendKeys("admin");

		driver.findElement(By.name("password")).sendKeys("admin");

		driver.findElement(By.name("submit")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/span[1]")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[6]/a[1]"))));
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[6]/a[1]")).click();

	}

}
