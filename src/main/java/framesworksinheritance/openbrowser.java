
package framesworksinheritance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class openbrowser extends baseclass {
	    @Test
	public void openBrowsers() throws Exception {
		openBrowsers("chromebrowser");
		 wait(10);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			screenshot();
			currenturl("https://opensource-demo.orangehrmlive.com/");
			title();
			teradown();
	}
			@Test
			public void myntralogin() throws Exception {
				openBrowsers("chromebrowser");
				wait(10);
				driver.get("https://www.myntra.com/");
				hover();
		     	alert(null);
		     	screenshot();
		     	teradown();
	}
			@Test
			public void loginfertilizer() throws Exception {
			openBrowsers("chromebrowser");
			wait(10);
			maximize();
			openapplication("https://myaccounts.in/Fertilizers");
			hover();
		    screenshot();
			}
			 
			 
			}