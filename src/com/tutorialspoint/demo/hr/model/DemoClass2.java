package com.tutorialspoint.demo.hr.model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoClass2 {
	public WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arijit Das\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		
		
	}
	@AfterClass
	public void TearDown(){
		driver.close();
		driver.quit();
		
	}
	
	@Test
	public void Test() throws InterruptedException{
		driver.findElement(By.id("email")).sendKeys("forloveorix@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("tushardas12");
		driver.findElement(By.id("u_0_n")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("userNavigationLabel")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.className("uiLinkButtonInput")).click();
		driver.findElement(By.id("u_0_37")).sendKeys("Md Shahnawaz");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_37")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//System.out.println("------------------------>>>>>>>>>>>>--------------");
		//driver.findElement(By.xpath(".//*[starts-with(@id,'js_')]/div[3]/div[1]/textarea")).sendKeys("Hello");
		//driver.findElement(By.xpath(".//*[starts-with(@id,'js_')]/div[3]/div[1]/textarea")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[starts-with(@id,'js_')]/div[3]/div[2]/div[3]/a/i")).click();
		Thread.sleep(5000);
		
		
		
		
		
	}
	

}
