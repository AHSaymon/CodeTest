package codeAssessment;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Scenario_One {

	public static void main(String[] args) throws Exception {
		
		// DesiredCapabilities Object creation
		DesiredCapabilities dc=new DesiredCapabilities();
		
		//Mobile Details
		dc.setCapability("deviceName", "OPPO A71 (2018)");
		dc.setCapability("udid", "f863c29");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "7.1.1");
		
		// Application Details
		dc.setCapability("appPackage", "com.nopstation.nopcommerce.nopstationcart");
		dc.setCapability("appActivity", "com.bs.ecommerce.main.SplashScreenActivity");
		
		//Server Details
		URL server=new URL("http://127.0.0.1:4723/wd/hub");
		
		//AppiumDriver Object creation
		AppiumDriver mobileObj=new AppiumDriver(server,dc);
		
		/*
		Given: Mike on home page after opening nopCart mobile app
		When: Mike click "electronics" from our categories list from home page
		And: Mike click to "Nokia Lumia 1020" product details page
		Then: Mike select size "Large" from product details page
		And: Mike click plus button to increase Qty by "2"
		Then: Mike click add to cart button to add the product in his cart
		*/
		
		// Given: Mike on home page after opening nopCart mobile app
		
		//NopStation App is opening
		System.out.println("NopStation Cart App is Opening");
	
		Thread.sleep(5000);
		// Accept btn clicked
		WebElement acceptBtn= mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAccept"));
		acceptBtn.click();
		
		//When: Mike click "electronics" from our categories list from home page
		Thread.sleep(3000);
		WebElement categoryBtn= mobileObj.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Category']/android.widget.FrameLayout/android.widget.ImageView"));
		categoryBtn.click();
		
		Thread.sleep(3000);
		WebElement electronics=mobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[7]"));
		electronics.click();
	
		Thread.sleep(3000);
		WebElement searchbtn=mobileObj.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Search']/android.widget.FrameLayout/android.widget.ImageView"));
		searchbtn.click();
		
		Thread.sleep(3000);
		WebElement searchtxt=mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/search_src_text"));
		searchtxt.sendKeys("Nokia Lumia 1020");
		
		Robot rb=new Robot();
		rb.delay(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		// And: Mike click to "Nokia Lumia 1020" product details page
		Thread.sleep(3000);
		WebElement nokia=mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/ivProductThumb"));
		nokia.click();
		
		// And: Mike click plus button to increase Qty by "2"
		
		// Quantity Increase:
		Thread.sleep(3000);
		WebElement qtn=mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnPlus"));
		qtn.click();
		
		/*
		Thread.sleep(3000);
		WebElement size=mobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.TextView[3]"));
		size.click();
		*/
		
		// Then: Mike click add to cart button to add the product in his cart
		Thread.sleep(3000);
		WebElement addTocard=mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart"));
		addTocard.click();
		
		
	}

}
