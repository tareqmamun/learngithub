package appiumlearning;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MeedLogin {
	
	static AppiumDriver<MobileElement> driver;
	
	
	public static void main(String[]args) {
		try {
			openMeed();
			
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public static void openMeed() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus 5T");
		cap.setCapability("udid", "755b6215");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		
		cap.setCapability("appPackage", "com.uat.meedbankingclub");
		cap.setCapability("appActivity", "com.uat.meedbankingclub.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Meed Application Started");
		
//		MobileElement two = driver.findElement(By.id("com.oneplus.calculator:id/digit_2"));
//		two.click();
//		
//		MobileElement plus = driver.findElement(By.id("com.oneplus.calculator:id/op_add"));
//		plus.click();
//		
//		MobileElement eight = driver.findElement(By.id("com.oneplus.calculator:id/digit_8"));
//		eight.click();
//		
//		MobileElement equals = driver.findElement(By.id("com.oneplus.calculator:id/eq"));
//		equals.click();
//		
//		MobileElement result = driver.findElement(By.id("com.oneplus.calculator:id/result"));
//		String results = result.getText();
//		if(results.equals("10")) {
//		    System.out.println("Result is "+ results);
//		    System.out.println("\n Test passed");
//		}
		
	}
	

}
