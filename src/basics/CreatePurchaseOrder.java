package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatePurchaseOrder {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.purnadata.in/PurnaDemo/index.php");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[4]/div[2]/button[1]")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/b[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();

		driver.findElement(By.name("btn_new_party")).click();

		driver.findElement(By.id("supplier_address")).sendKeys("123,abc");
		driver.findElement(By.id("gst_no")).sendKeys("58746985");
		driver.findElement(By.id("contact_petrson")).sendKeys("Ravi");
		driver.findElement(By.id("cont_no")).sendKeys("8569874521");

		WebElement Dropdown = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[8]/div[1]/select[1]"));
		Select select = new Select(Dropdown);
		select.selectByVisibleText("15 DAYS");
		
		driver.findElement(By.id("credit_period")).sendKeys("20 Days");
		driver.findElement(By.id("note")).sendKeys("Purchase Order");
		driver.findElement(By.id("terms_and_condition")).sendKeys("Order Cannot cancelled");
		
		driver.findElement(By.id("po_item_name_new")).sendKeys("Milk");
		driver.findElement(By.id("item_code")).sendKeys("1105");
		driver.findElement(By.id("po_item_descr")).sendKeys("Milk Product");
		driver.findElement(By.id("po_hsn_code")).sendKeys("123456789");
		driver.findElement(By.id("po_units")).sendKeys("10");
		driver.findElement(By.id("po_quantity")).sendKeys("50");
		driver.findElement(By.id("po_rate")).sendKeys("10");
		driver.findElement(By.id("project")).sendKeys("Purna");
		driver.findElement(By.id("myButton")).click();
		
	
		WebElement Dropdown1 = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/select[1]"));
		Select select1 = new Select(Dropdown1);
		select1.selectByVisibleText("6");
		
		WebElement Dropdown2 = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[3]/div[1]/select[1]"));
		Select select2 = new Select(Dropdown2);
		select2.selectByVisibleText("6");
		
		WebElement Dropdown3 = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[4]/div[1]/select[1]"));
		Select select3 = new Select(Dropdown3);
		select3.selectByVisibleText("6");
		
		driver.findElement(By.id("packing_and_forwarding")).sendKeys("10");
		driver.findElement(By.id("deliverycharges")).sendKeys("50");
		driver.findElement(By.id("myButtonlast")).click();
		
		
		driver.findElement(By.id("btn")).click();
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		

	}

}
