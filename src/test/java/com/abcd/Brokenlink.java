package com.abcd;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	 List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int	Size =	alllinks.size();
		 List<WebElement> arlink = new ArrayList<WebElement>();
		for(int i=0;i<=Size;i++)
		{
			if(alllinks.get(i).getAttribute("href")!=null && (!alllinks.get(i).getAttribute("href").contains("javascript")));
			{
				arlink.add(alllinks.get(i));
			}
		}
		System.out.println("activelinks"+arlink.size());
		for(int i=0;i<=Size;i++)
		{
			HttpURLConnection connection = (HttpURLConnection) URL(alllinks.get(i).getAttribute("href").openconnet
			
		}
	}

}
