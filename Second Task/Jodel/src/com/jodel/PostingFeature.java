package com.jodel;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class PostingFeature extends SetupClass{
public static void main(String[] args) throws MalformedURLException, InterruptedException{
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Allow location']").click();
		Thread.sleep(2000);
		driver.findElementById("com.tellm.android.app:id/add_post_button").click();
		driver.findElementById("com.tellm.android.app:id/order_by_replies").click();
		Thread.sleep(2000);
		driver.findElementById("com.tellm.android.app:id/create_post_edit_text").sendKeys("Automated Testing Jodel Xd");
		driver.findElementById("com.tellm.android.app:id/toolbar_send").click();
		Thread.sleep(4000);
		driver.pressKeyCode(AndroidKeyCode.BACK);
	}
}