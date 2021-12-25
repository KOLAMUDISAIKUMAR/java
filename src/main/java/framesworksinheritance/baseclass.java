package framesworksinheritance;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public WebDriver driver = null;

	public void openBrowsers(String browser) {
		if (browser.equalsIgnoreCase("chromebrowser")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefoxbrowser")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edgebrowser")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
	}

	public void wait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}

	public void switchframe(int index) {
		driver.switchTo().frame(index);
	}

	public void alert(String alert) {
		Alert ala = driver.switchTo().alert();
		String text = ala.getText();
		ala.accept();
	}

	public void explicitywait() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void alert() {
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		alert.accept();
	}

	public void handlewindows(int index) {
		Set<String> allwindows = driver.getWindowHandles();
		// windowscount and allwindows id
		System.out.println("windowscount:" + allwindows.size());
		// switch too child window
		List<String> windows = new ArrayList<String>(allwindows);
		driver.switchTo().window(windows.get(index));
	}

	public void screenshot() throws Exception {
		TakesScreenshot capture = ((TakesScreenshot) driver);
		File source = capture.getScreenshotAs(OutputType.FILE);
		String path = "C:\\eclipse-workspace\\java\\src\\test\\resources\\screenshot";
		File destFile = new File(path + "\\screenshots.png");
		FileUtils.copyFile(source, destFile);
	}

	public void title() {
		String expectedtitle = "opensource-demo";
		String actualltitle = driver.getTitle();
		System.out.println(actualltitle);
		if (expectedtitle.equals(actualltitle)) {
			System.out.println("title is match");
		}
	}

	public void currenturl(CharSequence index) {
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		if (actualurl.contains(index))
			;
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void teradown() {

		driver.close();
	}

	public void openapplication(CharSequence url) {

		driver.get((String) url);
	}

	public void minimize() {
		driver.manage().window().minimize();
	}

	public void back() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void hover() {
		WebElement mensection = driver.findElement(By.xpath(
				"//nav[@class='top-nav']//ul//li[@class='mega-menu hasChildren']//a[@href='verticals']//span[contains(text(),'Verticals')]"));
		Actions action = new Actions(driver);
		action.moveToElement(mensection).perform();

	}

}
