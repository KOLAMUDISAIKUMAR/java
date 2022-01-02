package iframes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframesexe {

public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
driver.switchTo().frame("packageListFrame");
driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
Thread.sleep(2000);

// Switch to 2nd IFrame using frame index
driver.switchTo().frame("packageFrame");
driver.findElement(By.linkText("ChromeDriver")).click();


// Switch to 3rd IFrame using frame String name
driver.switchTo().frame("classFrame");
driver.findElement(By.linkText("NO FRAMES")).click();


//Method: 2
// Switch to 1st IFrame using frameElement
//WebElement Packages=driver.findElement(By.xpath("//li[2]"));
//driver.switchTo().frame("Package");

}

}