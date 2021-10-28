package com.selenium.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementClassMethods {
	// TODO Auto-generated method stub
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("shalini");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kolla");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("saishalini648@gamil.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@class ='custom-control-label']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("8008309845");
	
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("02oct2021");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class=' css-2b097c-container']")).sendKeys("computerscience");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='hobbiesWrapper']")).sendKeys("//div[@class='col-md-9 col-sm-12']");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("APHB.Colony");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		Thread.sleep(10000);
		
		
		
		

		driver.close();
		driver.quit();

	}

	
	}


