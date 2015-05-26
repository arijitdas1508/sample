package com.tutorialspoint.demo.hr.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tools_qa {
	public WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arijit Das\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		  
		driver.get("http://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void CloseBrowser(){
		
		driver.close();
		driver.quit();
	}
	
	@Test
	public void Test() throws InterruptedException{
		
		//String s;
		WebElement link= driver.findElement(By.linkText("Link Test"));
		
		link.click();
		System.out.println(link.toString());
		/*Actions newTab = new Actions(driver);
		newTab.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(link).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(3000);*/
		driver.navigate().back();
		/*JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("scroll(0,900)");*/
		Thread.sleep(10000);
		WebElement s1=driver.findElement(By.tagName("Button"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",s1);
		//s=s1.toString();
		System.out.println(s1.toString());
		
		WebElement partiallinktxt=driver.findElement(By.partialLinkText("Partial"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",partiallinktxt);
		
		partiallinktxt.click();
		System.out.println(partiallinktxt.toString());
		driver.navigate().back();
		
	}

}
