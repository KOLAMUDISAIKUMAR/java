package hanldeiframes;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class switchiframefunctionss {
private static final String inputEle = null;

public static void main(String[] args) {
		// open browser --
WebDriverManager.chromedriver().setup(); // replace of system
WebDriver driver = new ChromeDriver();		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		// handle iframe // 4 different ways to handle iFrames
		// Method1 - iframe using Index
	driver.switchTo().frame(1); // click on Actions
driver.findElement(By.xpath("//a[normalize-space()='Actions']")).click();
		// Method2 - iframe using Id Or Name
		// driver.get("http://the-internet.herokuapp.com/tinymce");
driver.switchTo().frame("mce_0_ifr");		driver.findElement(By.xpath("//body[@id='tinymce']")).clear(); // Input
driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Hanle Iframe input ::");
		// Method3 - iframe using any property // webelement		WebElement inputEle = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
driver.switchTo().frame(inputEle);

// Input 
driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Handle Iframe using any Locator");
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
// Method - 4 - iframe using tagName.
		List<WebElement> iframeList = driver.findElements(By.tagName("iframe"));
		System.out.println(iframeList.size());
		// switch to frame using tagname and collection
		driver.switchTo().frame(iframeList.get(2));

		// click on No frames link.
		driver.findElement(By.xpath(	"//div[@class='fixedNav']//div[@class='subNav']//ul[@class='navList']//li//a[@href='overview-summary.html'][normalize-space()='No Frames']")).click();}}
