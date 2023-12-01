package com.abcd;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridExc {
	
	RemoteWebDriver driver;
	@Test
	public  void sample() throws MalformedURLException {
		URL url = new URL("http://192.168.56.1:3735/grid/register/");
				DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(url, cap);
		driver.get("https://www.amazon.in/");
		
		
		
	}

}
