package com.selenium.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowClassMethods {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		String source = driver.getPageSource();
		System.out.println(source);
		
		
		
		driver.close();
		driver.quit();
		
		
	

		
		
	}

}
