package com.selenium.sam;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnit {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
       // WebDriver driver = new HtmlUnitDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saish\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        System.out.println(driver.getTitle());
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\screenshots\\shalini.png");
        FileUtils.copyFile(sourceFile, dest);
        
        
        
        
        Thread.sleep(5000);
        driver.close();
        driver.quit();
	}

}
