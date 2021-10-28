package com.selenium.sam;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieClassMethods {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie ck : cookies) {
			System.out.println(ck.getName()+"---------"+ck.getValue());
			Thread.sleep(10000);
		}
		driver.close();
		driver.quit();

	}
	//C:\Users\saish\Downloads\chromedriver_win32\chromedriver.exe

	
}
