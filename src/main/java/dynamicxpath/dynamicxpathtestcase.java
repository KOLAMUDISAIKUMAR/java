 package dynamicxpath;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicxpathtestcase {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dynamic = new ChromeDriver();
		dynamic.get("https://www.alibaba.com/");
		Thread.sleep(3000);
		dynamic.findElement(By.name("SearchText")).sendKeys("samsungmobiles");
	    //dynamic.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		WebElement element = dynamic.findElement(By.xpath("//*[contains(@name,'SearchText')]"));
		element.submit();
	}

}

