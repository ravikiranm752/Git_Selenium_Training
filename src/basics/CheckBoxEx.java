package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		//WebElement checkbox_Bicycle = driver.findElement(By.id("bicycle-checkbox"));
		//if(!checkbox_Bicycle.isSelected()) {
		//	checkbox_Bicycle.click();
		//}
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0; i<checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}

	}

}
