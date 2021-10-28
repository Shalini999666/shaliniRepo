package com.selenium.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InternetExplorer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        // System.setProperty("webdriver.ie.driver", "C:\\Users\\saish\\Downloads\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe");
        // WebDriver driver = new InternetExplorerDriver();
         //driver.get("https://demoqa.com/automation-practice-form");
         WebDriverManager.chromedriver().version("95.0.4638.54").setup();
         WebDriver chrome = new ChromeDriver();
		 WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new FirefoxDriver();
         chrome.get("https://www.google.com/");
         
         
         Thread.sleep(5000);
         chrome.close();
         chrome.quit();
	}

}
