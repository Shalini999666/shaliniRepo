package com.selenium.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusShalini {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Users\\saish\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.redbus.com/");
       Thread.sleep(5000);
       driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Hyderabad");
       Thread.sleep(5000);
       driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Vijayawada");
       Thread.sleep(5000);
       driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td[6]")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-return-calendar icon']")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody/tr[7]/td[7]")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//button[@id='search_btn']")).click();
       Thread.sleep(40000);
      String name= driver.findElement(By.xpath("//ul[@class='bus-items']/div/li/div/div/div/div[1]/div[1]")).getText();
       System.out.println(name);
       String name1= driver.findElement(By.xpath("//ul[@class='bus-items']/div/li/div/div/div/div[1]/div[2]")).getText();
       System.out.println(name1);
       Thread.sleep(5000);
       
       driver.close();
       driver.quit();
	}

}