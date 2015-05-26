package com.tutorialspoint.demo.hr.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ToolsQa {
	public WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arijit Das\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.toolsqa.com/");
		driver.manage().window().maximize();
	}
    @AfterClass
    public void TearDown(){
    	driver.close();
    	driver.quit();
    }
    
    @Test
    public void Test(){
    	String Title,Title1;
    	int Length,Length1;
    	Title=driver.getTitle();
    	Length=driver.getTitle().length();
    	Title1=driver.getCurrentUrl();
    	Length1=driver.getCurrentUrl().length();
    	System.out.println(Title+","+Length+","+Title1+","+Length1);
       	driver.navigate().refresh();
    	
    }
}
