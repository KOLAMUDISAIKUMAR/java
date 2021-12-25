package loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ifloop {
	public static void main(String[] args) {
		
		String browser="edge";
		if (browser=="chrome") {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.co.in/");
			
		}
		else if (browser=="edge") {
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.google.co.in");
		}
		else if (browser=="firefox") {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.co.in");
		}
		
		else {
			System.out.println("browser does not exist");
		}
	}
} 