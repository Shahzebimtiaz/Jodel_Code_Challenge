package com.jodel;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

public class CustomSettings extends SetupClass {

public static void main(String[] args) throws MalformedURLException, InterruptedException{
		System.out.println("Enabling Battery saving ");
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Allow location']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='MY KARMA']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='More']").click();
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width/2;
		int starty = (int)(height*0.80);
		int endy = (int)(height*0.20);
		driver.swipe(x, starty, x, endy, 500);
		driver.findElementByXPath("//android.widget.TextView[@text='Settings']").click();
		driver.findElementByXPath("//android.widget.Switch[@text='OFF']").click();
		for(int i =0; i<3; i++)
		{
			driver.pressKeyCode(AndroidKeyCode.BACK);
		}
	}
}
