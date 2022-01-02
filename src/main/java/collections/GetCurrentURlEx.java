package collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCurrentURlEx {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); // calling driver
		WebDriver driver = new ChromeDriver();

		//get
		driver.get("https://www.officedepot.com/");
		
		//click on credit cards
		driver.findElement(By.linkText("Credit Cards")).click();
		
		//getcurrentURl
		String actualURL = driver.getCurrentUrl();
		
		System.out.println(actualURL);
		
		if (actualURL.contains("officedepot")) {
			
			System.out.println("URL contains Officedepot");
			
		}else {
			System.out.println("URL doesn't contains Officedepot");

		}
			
		
		//close
		driver.close(); //current session | Quit -close all the sessions opened by selenium
		
		
	}

}
