package com.selenium.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClassMethods {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.co.in/");
		chrome.findElement(By.xpath("//a[text()='Gmail']")).click();
	    Thread.sleep(5000);
		//chrome.navigate().forward();
		chrome.close();
		chrome.quit();
		

	}

}
