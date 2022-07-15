package codeAssessment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Scenario_Two {

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
		
		// save info capability
		dc.setCapability("noReset", "true");
		dc.setCapability("fullReset", "false");
				
		//Server Details
		URL server=new URL("http://127.0.0.1:4723/wd/hub");
				
		//AppiumDriver Object creation
		AppiumDriver mobileObj=new AppiumDriver(server,dc);
		
		/*
		Given: Mike go to shopping cart by clicking top cart icon
		When: Mike click checkout button from shopping cart page
		And: Mike select checkout as guest from shopping cart page
		Then: Mike input all the details in checkout billing details page and click continue
		And: Mike select "Next Day Air" as shipping method and click continue
		And: Mike select "Check/Money Order" as payment method and click continue
		And: Mike click next button on payment information page
		Then: Mike click confirm button to place the order
		And: Verify order place successfully with popup message "Your order has been successfully processed!"
		*/
		
		//NopStation App is opening
		System.out.println("NopStation Cart App is Opening");
		
		//Given: Mike go to shopping cart by clicking top cart icon
		Thread.sleep(3000);
		WebElement addToCart=mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/counterIcon"));
		addToCart.click();
		
		//When: Mike click checkout button from shopping cart page
		Thread.sleep(3000);
		WebElement checktOutBtn=mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut"));
		checktOutBtn.click();
		
		//And: Mike select checkout as guest from shopping cart page
		Thread.sleep(3000);
		WebElement AsGuest=mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout"));
		AsGuest.click();
		
		/*
		//Then: Mike input all the details in checkout billing details page and click continue
		Thread.sleep(2000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName")).sendKeys("hamid");
		mobileObj.navigate().back();
		
		Thread.sleep(2000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName")).sendKeys("Saymon");
		mobileObj.navigate().back();
		
		Thread.sleep(2000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail")).sendKeys("hamidsaymon9@gmail.com");
		mobileObj.navigate().back();
		
		Thread.sleep(2000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/countrySpinner")).click();
		
		Thread.sleep(2000);
		mobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
		
		Thread.sleep(2000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/stateSpinner")).click();
		
		Thread.sleep(2000);
		mobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
		
		Thread.sleep(2000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName")).sendKeys("Demobd");
		mobileObj.navigate().back();
		
		Thread.sleep(2000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etCity")).sendKeys("Duke");
		mobileObj.navigate().back();
		
		Thread.sleep(2000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress")).sendKeys("Abc Street");
		mobileObj.navigate().back();
		
		Thread.sleep(2000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress2")).sendKeys("Def Street");
		mobileObj.navigate().back();
		
		Thread.sleep(2000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode")).sendKeys("2341");
		mobileObj.navigate().back();
		
		Thread.sleep(2000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etPhone")).sendKeys("01700503956");
		mobileObj.navigate().back();
		
		Thread.sleep(2000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etFax")).sendKeys("011 44 (161) 999 8888");
		mobileObj.navigate().back();
		
		Thread.sleep(2000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue")).click();
	
		 */
		
		//Continue btn
		Thread.sleep(3000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue")).click();
		//And: Mike select "Next Day Air" as shipping method and click continue
		Thread.sleep(4000);
		mobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial/android.widget.RelativeLayout[4]")).click();
		
		Thread.sleep(4000);
		mobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")).click();
		
		//And: Mike select "Check/Money Order" as payment method and click continue
		Thread.sleep(4000);
		mobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial/android.widget.RelativeLayout[3]")).click();

		Thread.sleep(4000);
		mobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")).click();
		
		//And: Mike click next button on payment information page
		Thread.sleep(7000);
		mobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")).click();
		
		
		//Then: Mike click confirm button to place the order
		//And: Verify order place successfully with popup message "Your order has been successfully processed!"
		Thread.sleep(4000);
		mobileObj.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/checkoutButton")).click();
		
	
	}

}
