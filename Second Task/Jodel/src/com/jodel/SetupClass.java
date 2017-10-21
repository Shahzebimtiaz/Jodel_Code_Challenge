package com.jodel;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class SetupClass {
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException{
		File apk = new File("src");
		File fs = new File(apk,"Jodel_com.tellm.android.app.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo A2016a40");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "50");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath() );
        AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap); 
        return driver;
	}
}
