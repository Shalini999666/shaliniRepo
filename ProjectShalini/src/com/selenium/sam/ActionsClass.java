package com.selenium.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\saish\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            Actions action = new Actions(driver);
            driver.get("https://demoqa.com/automation-practice-form");
            WebElement firstname = driver.findElement(By.id("firstName"));
            action.click(firstname).sendKeys("siddhiInstitute").build().perform();
            Thread.sleep(5000);
            WebElement lastname =driver.findElement(By.id("lastName"));
            action.click(lastname).sendKeys("bhongir").build().perform();
            Thread.sleep(5000);
            WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
            action.click(email).sendKeys("saishalini648@gmail.com").build().perform();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7286071567");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("02101996");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='subjectsInput']")).click();
            Thread.sleep(3000);
           // driver.findElement(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline'][1]")).click();
          //  Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='uploadPicture']")).click();
            Thread.sleep(5000);
            
            
            
            
            
            
            
            
            
            driver.close();
            driver.quit();
	}

}
