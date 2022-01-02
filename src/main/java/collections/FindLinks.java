package collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLinks {
	
	public static void main(String[] args) {
		
		//open browser
		WebDriverManager.chromedriver().setup(); // driver		
		WebDriver driver = new ChromeDriver(); //object
		
		//open google
		driver.get("https://www.google.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		int count = list.size();
		
		System.out.println("count is" + count);
	
		for (int i = 0; i <count; i++) {
	
			if (!list.get(i).getText().isEmpty()) { // Not
				System.out.println(list.get(i).getText());
			}

		}
		
		
		
		
	}

}


