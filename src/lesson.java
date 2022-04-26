import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Assert;

public class lesson {

	public static void main(String[] args) {

	//	System.setProperty(null, null)
		String driverPath = "C:\\geckodriver.exe"; 
		System.setProperty("webdriver.gecko.driver",driverPath);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("tittle is"+ title);
		if (title.equals("Google")) {
			System.out.println("correct tittle");}
			else {
				
				System.out.println("incorrect");
			}
				
		

		

	} 

}
