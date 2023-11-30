package com.abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mysql.jdbc.Driver;

public class parameter_test {
	
	public WebDriver driver;
	public void test()
	{
		 String BROWSER = System.getProperty("browser");
		 String URL = System.getProperty("url");
		 System.out.println(BROWSER);
		 System.out.println(URL);
		 
		 if(BROWSER.equalsIgnoreCase("chrome"))
		 {
			 
			 driver = new ChromeDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("edge"))
		 {
			 driver = new EdgeDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("Firefox"))
		 {
			 driver = new FirefoxDriver();
		 }
		 else 
		 {
			 driver = new ChromeDriver();
		 }
	}

}
