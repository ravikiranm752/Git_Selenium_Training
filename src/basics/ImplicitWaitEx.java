package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/inbox");

		driver.findElement(By.id("usernameField")).sendKeys("abc");
		driver.findElement(By.id("passwordField")).sendKeys("abc1234");

		driver.findElement(By.xpath("//button[@data-ga-track='spa-event|login|login|Save||||true']")).click();

		String test = driver.findElement(By.xpath("//*[contains(@class, 'commonErrorMsg')]")).getText();
		System.out.println(test);

	}

}
