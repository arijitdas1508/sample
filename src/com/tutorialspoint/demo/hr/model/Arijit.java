package com.tutorialspoint.demo.hr.model;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class Arijit {

	public WebDriver driver;
	
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arijit Das\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		//FirefoxProfile profile = new FirefoxProfile();
		//profile.setEnableNativeEvents(true);
		//WebDriver driver = new FirefoxDriver(profile);
		//ProfilesIni profile = new ProfilesIni();
		 
		//FirefoxProfile myprofile = profile.getProfile("Arijits");
		 
		//WebDriver driver = new FirefoxDriver(myprofile);
		
		driver.manage().window().maximize();
		System.out.println("Window Maximize");
		driver.get("http://ihrms.myubiquesystems.com");
		System.out.println("Site Open");
		driver.quit();
		System.out.println("End Test");
		
	}

}
