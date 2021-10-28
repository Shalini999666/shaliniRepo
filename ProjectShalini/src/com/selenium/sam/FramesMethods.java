package com.selenium.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FramesMethods {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	   driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_button_form");
	   driver.switchTo().frame("iframeResult");
	   driver.findElement(By.xpath("//input[@ID='fname']")).sendKeys("kolla");
	   driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Shalini");
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		driver.close();
		driver.quit();
		
		
	

	}

}
