package com.abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeDriver_test {
	
	public WebDriver driver;
	
	@Test
	public void m1test()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

}
