package waitfuctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicity {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//implicit wait
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		//click on LInk
		driver.findElement(By.id("alert")).click();
	
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		// Handle Alerts
		Alert alert = driver.switchTo().alert();
		 String alerttext = alert.getText();
		 System.out.println("Alert text is: " + alerttext);
		 
		alert.accept(); // OK
		
	
 }

}
