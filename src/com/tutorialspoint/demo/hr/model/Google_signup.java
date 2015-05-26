package com.tutorialspoint.demo.hr.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Google_signup {
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arijit Das\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.co.in");
		driver.manage().window().maximize();
		

}
	@AfterClass
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	
	@Test
	public void Signup() throws InterruptedException{
		
		driver.findElement(By.id("gb_70")).click();
		driver.findElement(By.id("link-signup")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Arijit");
		driver.findElement(By.id("LastName")).sendKeys("Das");
		//Thread.sleep(3000);
		driver.findElement(By.id("GmailAddress")).sendKeys("arijit.das26561145811554");
		//Thread.sleep(3000);
		driver.findElement(By.id("Passwd")).sendKeys("ubiquesystems");
		driver.findElement(By.id("PasswdAgain")).sendKeys("ubiquesystems");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]")).click();
		driver.findElement(By.xpath(".//*[@id=':8']/div")).click();
		driver.findElement(By.id("BirthDay")).sendKeys("15");
		driver.findElement(By.id("BirthYear")).sendKeys("1992");
		driver.findElement(By.xpath(".//*[@id='Gender']/div[1]")).click();
		driver.findElement(By.xpath(".//*[@id=':f']/div")).click();
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("7278626188");
		
		WebElement checkBox1=driver.findElement(By.id("SkipCaptcha"));
		checkBox1.click();
		
		WebElement checkBox = driver.findElement(By.xpath(".//*[@id='TermsOfService']"));
		 checkBox.click();
		 Thread.sleep(3000);
		 
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,250)", "");
		 driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();
		 Thread.sleep(10000);
		
		/* driver.findElement(By.xpath(".//*[@id='next-button']")).click();
		 driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[3]/div[2]/div/div[1]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();*/
		 System.out.println("User is Succesfully Register");
		 Thread.sleep(3000);
		 
		
	}
	
	
	
	
	
	
	}
