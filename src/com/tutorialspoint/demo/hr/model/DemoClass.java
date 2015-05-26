package com.tutorialspoint.demo.hr.model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoClass {
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arijit Das\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://ihrms.myubiquesystems.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	
	@Test
	public void Login() throws InterruptedException{
		driver.findElement(By.id("Username")).sendKeys("arijit.das@ubiquesystems.co.in");
		driver.findElement(By.id("Password")).sendKeys("password");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	
	

}
