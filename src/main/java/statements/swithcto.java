 package statements;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class swithcto {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

	
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		//driver.findElement(By.xpath("//div[@class='fixedNav']//div[@class='subNav']//ul[@class='navList']//li//a[@href='index.html?overview-summary.html'][normalize-space()='Frames']"))				.click();

		// driver.switchTo().frame("packageListFrame");
		// Thread.sleep(2000);
		/*
		 * driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).
		 * click(); Thread.sleep(2000); driver.navigate().back();
		 * driver.switchTo().frame("Package, class and interface descriptions");
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//a[normalize-space()='org.openqa.selenium.chromium']")).click();
		 */ 
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);

//		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//frame0
	//	driver.switchTo().frame(frames.get(0));
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();

//		driver.switchTo().window(parent);
	
		
		//frame1
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Actions")).click();

		/*
		 * WebElement frameoverview =driver.findElement(By.tagName("iframe"));
		 * driver.switchTo().frame(frameoverview); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).
		 * click(); /*Thread.sleep(2000); driver.navigate().back();
		 * driver.findElement(By.xpath("//a[normalize-space()='AbstractAnnotations']")).
		 * click(); driver.navigate().back(); Thread.sleep(2000);
		 * driver.findElement(By.xpath(
		 * "//a[normalize-space()='org.openqa.selenium.chromium']")).click();
		 */

	}
}
