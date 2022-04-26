 import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.Verify;

public class LocatorLessons {

	public static void main(String[] args) {
		String driverPath = "C:\\geckodriver.exe"; 
		System.setProperty("webdriver.gecko.driver",driverPath );
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&UsingSSL=1&siteid=0&co_partnerId=2&pageType=2556586&regUrl=https%3A%2F%2Fsignup.ebay.com%2Fpa%2Fcrte%3Fusage%3D2943");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(By.id("userid")).sendKeys("bensonmathew27@gmail.com");
		driver.findElement(By.id("signin-continue-btn")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("pass")).sendKeys("Bullshit123#");
		driver.findElement(By.id("sgnBt")).click();
		//Select select = new 
		//1 . xpath
		
//		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("benson");
//		driver.findElement(By.xpath("//*[@id=\'lastname\']")).sendKeys("Varghese Mathew");
//		driver.findElement(By.xpath("//*[@id=\'Email\']")).sendKeys("bensonmathew27@gmail.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
//		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Bullshit123");
//		//driver.findElement(By.xpath("//a[text() = 'User Agreement']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
//		driver.findElement(By.xpath("//*[@id=\'EMAIL_REG_FORM_SUBMIT\']")).click();
		
		//2. name
		
		// driver.findElement(By.name("firstname")).sendKeys("benson");
		
		//3. id
		 
		// driver.findElement(By.id("firstname")).sendKeys("benson");
		 //4 cssselector
	//	 driver.findElement(By.cssSelector("#firstname")).sendKeys("benson");
		// 5 LinkText
		 
		// driver.findElement(By.linkText("User Agreement")).click();
		 // 6. PartialLinkList - similar to be used as Linktext, but if the link is too many words".  But still use the linktext
		 //7 . Class name : also used when class tag is used, it can be a link or anything. But not advised to use the 
		 //same as classname could be duplicated
		System.out.println("login");
		
	}

}
