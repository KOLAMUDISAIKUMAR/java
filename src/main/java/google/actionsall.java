 
	package google;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class actionsall {

		public static void main(String[] args) throws Exception {
			
			WebDriverManager.chromedriver().setup();
			WebDriver ebay = new ChromeDriver();
			ebay.get("https://www.ebay.com/");
			/*
			Actions action = new Actions(ebay);
			action.moveToElement(ebay.findElement(By.xpath("//i[contains(@data-sp,'m570.l2919' )]"))).build().perform();
			action.clickAndHold();
		    */
			ebay.findElement(By.xpath("//i[contains(@data-sp,'m570.l2919' )]")).click();
			ebay.findElement(By.xpath("//a[contains(@id,'create-account-link')]")).click();
			ebay.navigate().back();
			
			ebay.navigate().refresh();
			ebay.navigate().back();
			//ebay.findElement(By.xpath("//a[contains(@_sp,'m570.l47137')]")).click();
			//ebay.navigate().back();
			//Thread.sleep(3000);
			ebay.findElement(By.xpath("//a[contains(@_sp,'m570.l3188')]")).click();
			ebay.navigate().back();
	        ebay.manage().window().maximize();
			ebay.findElement(By.xpath("//i[1][contains(@id,'gh-shop-ei')]")).click();
			//Thread.sleep(3000);
			ebay.findElement(By.xpath("//a[normalize-space()='Collectibles & art']")).click();
			ebay.navigate().back();
			ebay.findElement(By.xpath("//a[contains(@_sp,'m570.l1545')]")).click();
			//Thread.sleep(3000);
			ebay.findElement(By.xpath("//a[contains(@data-marko,'{\"onclick\":\"handleClick s0-0-45 false\"}')]")).click();
			ebay.findElement(By.xpath(" //input[contains(@id,'gh-ac')]")).sendKeys("mobiles");
			ebay.findElement(By.xpath("//input[contains(@id,'gh-btn')]")).click();
			//Thread.sleep(3000);
			ebay.findElement(By.xpath("//a[7]//span[1]")).click();
			ebay.findElement(By.xpath("//img[@alt='Mint Apple iPhone 12 mini - Black - 64GB (Unlocked) .MG8F3LL/A . Grade A+. ']")).click();
			ebay.close();
			ebay.quit();
			
			
		}
	
}
