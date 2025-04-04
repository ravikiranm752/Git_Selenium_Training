package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		WebElement Dropdown_Language = driver.findElement(By.id("programming-languages"));
		
		Select select = new Select(Dropdown_Language);
		
		//select.selectByIndex(2);
		//select.selectByValue("JavaScript");
		select.selectByVisibleText("Python");
	}

}
