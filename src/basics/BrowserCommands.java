package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		String title = driver.getTitle();
		System.out.println(title);
		
		String myUrl = driver.getCurrentUrl();
		System.out.println(myUrl);
		
		
		//driver.close();
		driver.quit();
		
		
		
		
		
	}

}
