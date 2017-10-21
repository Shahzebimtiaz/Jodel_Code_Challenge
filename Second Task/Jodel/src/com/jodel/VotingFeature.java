package com.jodel;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class VotingFeature extends SetupClass{

	public static void main(String[] args) throws MalformedURLException{
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Allow location']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='close']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='0']").click();
		driver.pressKeyCode(AndroidKeyCode.BACK);
	}
}
