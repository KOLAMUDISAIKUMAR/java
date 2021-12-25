package collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandlingSetEx {
	public static void main(String[] args) throws InterruptedException {
		// Open browser
		WebDriverManager.chromedriver().setup(); // System.setproperty
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Open application
		driver.get("https://www.officedepot.com/");
		// click on Credit cards link
		driver.findElement(By.xpath(
				"//div[@class='od-col od-col-gutter']//a[@class='od-menu-link'][normalize-space()='Credit Cards']"))
				.click();
		// click on button called - Apply now
		driver.findElement(By.xpath(
"//a[@href='https://www.officedepot.com/business-credit-account-apply?cm_sp=credit_promotions-_-BUSINESS-ACCOUNT_apply-now_-_-&promo_name=credit_promotions&promo_id=credit_promotions-BUSINESS-ACCOUNT-apply-now&promo_creative=BUSINESS-ACCOUNT_apply-now'][normalize-space()='Apply Now']")).click();
		// Handle winodws --1step : getwindows count.
		// List (allows duplicates and Set --doesn't allow dups -->
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println("windows count" + allwindows.size());
		// switch to new tab (tab2) and getURL
		// last - one way --convert as List
		/// 2nd way ---use Set with iterator () 
		Iterator<String> windows = allwindows.iterator(); // next
		String mainWindow = windows.next(); // main window.
		String newTab = windows.next();
		System.out.println("main window :" + mainWindow);
		System.out.println("new tab" + newTab);
		// switchTo new tab
		driver.switchTo().window(newTab);
		System.out.println("URl is:: " + driver.getCurrentUrl());
		driver.close();
		Thread.sleep(2000);
		// main window
		driver.switchTo().window(mainWindow);
		driver.close();

	}

}
