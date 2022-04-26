import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handledropdowns {
	
	public static void main(String[] args) throws InterruptedException {
		
		String driverPath =  "C:\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions act = new Actions(driver);
		
		WebElement ele= driver.findElement(By.xpath("//label[@for=\"fromCity\"]"));
		act.doubleClick(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()=\"Mumbai, India\"]")).click();
		WebElement ele1= driver.findElement(By.xpath("//label[@for=\"toCity\"]"));
		act.doubleClick(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()=\"Delhi, India\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("primaryBtn font24 latoBold widgetSearchBtn")).click();
		
		
		
		
	}

}
