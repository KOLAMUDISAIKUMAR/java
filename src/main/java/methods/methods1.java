 package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class methods1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver method = new ChromeDriver();
		method.get("https://www.google.com/");
		System.out.println();
		
		String expectedtitle = "google";
		String actualltitle = method.getTitle();
		System.out.println(actualltitle);
		if (expectedtitle.equals(actualltitle)) {
			System.out.println("title is match"); 
		     }
		else
		     {
		    	 System.out.println("title is does not match");
		     }
			method.get("https://www.officedepot.com/");
		    method.findElement(By.xpath("//div[@class='od-col od-col-gutter']//a[@class='od-menu-link'][normalize-space()='Business Select']")).click();
		    String actualurl= method.getCurrentUrl();
		    System.out.println(actualurl);
				if (actualurl.contains("officedepot")) {
					System.out.println("url contains office depot");
					
				}else
		{
					System.out.println("url does not contains office depot");
					
		}
		}
	}