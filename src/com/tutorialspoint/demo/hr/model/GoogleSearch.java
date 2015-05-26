package com.tutorialspoint.demo.hr.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearch {
	public WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arijit Das\\Desktop\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void TearDown(){
		driver.close();
		driver.quit();
		
	}
    @Test
    public void Search() throws InterruptedException{
    	
    	driver.findElement(By.name("q")).sendKeys("U");
    	Thread.sleep(2000);
    	driver.findElement(By.className("lsb")).click();
    	Thread.sleep(2000);
    	JavascriptExecutor scrolldown = (JavascriptExecutor)driver;
    	scrolldown.executeScript("scroll(0,950)");
    	Thread.sleep(2000);
    	JavascriptExecutor scrollup= (JavascriptExecutor)driver;
    	scrollup.executeScript("scroll(200,0)");
    	Thread.sleep(2000);
    	WebElement searchlink=driver.findElement(By.linkText("Wii U games, news, reviews, videos and cheats - GameSpot"));
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchlink);
    	searchlink.click();
    	
    
    	
    }
}
