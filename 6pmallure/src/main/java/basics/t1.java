package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class t1 {

	@Test
	@Description("Testing login functionality")
	@Feature(" login feature testing")
	@Severity(SeverityLevel.CRITICAL)
	public void f() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//id=user
		ob.findElementById("user").sendKeys("Dhivyakarthi123");
		
		//name=pass
		ob.findElementByName("pass").sendKeys("12345");
		
		//classname=btn_log
		
		ob.findElementByClassName("btn_log").click();
		
		Thread.sleep(3000);
		
		ob.quit();
	}
}
