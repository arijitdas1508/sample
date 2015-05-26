package com.tutorialspoint.demo.hr.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;

public class IhrmsNew {
	
	public WebDriver driver;
	
	@BeforeTest
	public void openBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arijit Das\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://ihrms.myubiquesystems.com/");
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public void CloseBrowser(){
		
		driver.close();
		driver.quit();
	}
	@Test
	public void Test(){
		
	}

}
