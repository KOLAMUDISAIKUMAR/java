package pageobjectmodel;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.framework.app.page.Homepage;
import framesworksinheritance.baseclass;
public class withpageobjectmodels extends baseclass {

		@BeforeMethod
	public void launchbrowser() {
		System.out.println("installbrowser");
		//launch browser
		openBrowsers("chromebrowser");
		}

@Test
public void verifygooglesearch() {
	Homepage homepage=new Homepage(driver);
	openapplication("https://www.google.com/");
     homepage.googlesearch("selenium");
 
}
@Test
public void loginfacebook() {
	Homepage homepage=new Homepage(driver);
	openapplication("https://www.facebook.com/");
     homepage.facebook("karthiksai056@gmail.com");
     homepage.facebook("Ksai9966@");

	
	
	
}
	//@AfterMethod
	//public void closebrowser() {
	//teradown();
		
		
		
	}



