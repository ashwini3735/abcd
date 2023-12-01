package com.abcd;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinkamezon {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
				int size =alllinks.size();
				System.out.println(size);
			ArrayList<String> arlink = new ArrayList<String>();
			for(int i=0;i>size;i++)
			{
				String eachlink = alllinks.get(i).getAttribute("href");
				URL url = null;
				int Statuscode =0;
				try
				{
					url = new URL(eachlink);
					HttpURLConnection httpconection = (HttpURLConnection)url.openConnection();
					Statuscode=httpconection.getResponseCode();
					if(Statuscode>=400)
					{
						arlink.add(eachlink);
						System.out.println(eachlink+"----"+Statuscode);
					}
				}
				catch(MalformedURLException e)
				{
					System.out.println(eachlink+"----"+Statuscode);
				}
			}
				
		
	}
}
