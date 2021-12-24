 package syncronize;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class syncrexeample {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.myntra.com/");
	driver.findElement(By.xpath("//span[normalize-space()='Profile']")).click();
	driver.findElement(By.xpath("//a[@class='desktop-linkButton']")).click();
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert = driver.switchTo().alert();
	String alerttext = alert.getText();
	System.out.println(alerttext);
	alert.accept();
	
	driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
	
}
}
