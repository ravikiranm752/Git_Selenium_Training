package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        System.out.println("Opening website...");
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
        Thread.sleep(3000); // Increased to 3 seconds for better observation

        // Handling Confirm Box
        System.out.println("Clicking on Confirm Box button...");
        driver.findElement(By.id("confirmBox")).click();
        Thread.sleep(3000);

        System.out.println("Getting Confirm Box text...");
        String text = driver.switchTo().alert().getText();
        System.out.println("Alert text: " + text);
        Thread.sleep(3000);

        System.out.println("Dismissing Confirm Box...");
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);

        // Handling Prompt Box
        System.out.println("Clicking on Prompt Box button...");
        driver.findElement(By.id("promptBox")).click();
        Thread.sleep(3000);

        System.out.println("Sending input 'Hello' to Prompt Box...");
        driver.switchTo().alert().sendKeys("Hello");
        Thread.sleep(5000); // Longer wait to see the input clearly

        System.out.println("Accepting Prompt Box...");
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        // Closing the browser
        System.out.println("Closing the browser...");
        driver.quit();
    }
}
