package com.tutorialspoint.demo.hr.model;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class MercuryTours {
	
	public WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arijit Das\\Desktop\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/");
	    driver.manage().window().maximize();
	    
	}
	
	
	@AfterTest
	public void TearDown(){
		driver.close();
		driver.quit();
		
	}

	@Test
	public void Test() throws InterruptedException {
		//---> Register
		/*driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Arijit");
		driver.findElement(By.name("lastName")).sendKeys("Das");
		driver.findElement(By.name("phone")).sendKeys("9051067614");
		driver.findElement(By.id("userName")).sendKeys("arijitdas1508@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("1/33 Sree Colony");
		driver.findElement(By.name("city")).sendKeys("Kolkata");
		driver.findElement(By.name("state")).sendKeys("West Bengal");
		driver.findElement(By.name("postalCode")).sendKeys("700092");
		Thread.sleep(3000);
		Select drpcountry= new Select(driver.findElement(By.name("country")));
		drpcountry.selectByVisibleText("INDIA");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("arijitdas1508");
		driver.findElement(By.name("password")).sendKeys("qwerty");
		driver.findElement(By.name("confirmPassword")).sendKeys("qwerty");
		driver.findElement(By.name("register")).click();
		driver.findElement(By.linkText("Home")).click();*/
		
		
		
		//---> End Of Register
		
		//---> Sign-In
		
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("arijitdas1508");
		driver.findElement(By.name("password")).sendKeys("qwerty");
		driver.findElement(By.name("login")).click();
		
		//---> End Of Sign-In
		
		//--->Booking Flights
		
		Select pssnger= new Select(driver.findElement(By.name("passCount")));
		pssnger.selectByValue("2");
		
		Select pssnger1= new Select(driver.findElement(By.name("fromPort")));
		pssnger1.selectByValue("London");
		
		Select pssnger3= new Select(driver.findElement(By.name("fromMonth")));
		pssnger3.selectByValue("5");
		
		Select pssnger4= new Select(driver.findElement(By.name("fromDay")));
		pssnger4.selectByValue("24");
		
		Select pssnger5= new Select(driver.findElement(By.name("toPort")));
		pssnger5.selectByValue("New York");
		
		Select pssnger6= new Select(driver.findElement(By.name("toMonth")));
		pssnger6.selectByValue("8");
		
		Select pssnger7= new Select(driver.findElement(By.name("toDay")));
		pssnger7.selectByVisibleText("15");
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
		
		
		Select pssnger8= new Select(driver.findElement(By.name("airline")));
		pssnger8.selectByVisibleText("Pangea Airlines");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("findFlights")).click();
		
		Thread.sleep(5000);
		
		//---> End Of Booking Flights
		
		//---> Selects Flights
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[9]/td[1]/input")).click();
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input")).click();
		
		Thread.sleep(5000);
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.name("reserveFlights")).click();
		
		//---> End Of Selects Flights
		
		//---> Billing
		
		driver.findElement(By.name("passFirst0")).sendKeys("Arijit");
		
		driver.findElement(By.name("passLast0")).sendKeys("Das");
		
		Select meal=new Select(driver.findElement(By.name("pass.0.meal")));
		meal.selectByVisibleText("Hindu");
		
		Select Card=new Select(driver.findElement(By.name("creditCard")));
		Card.selectByVisibleText("Visa");
		
		driver.findElement(By.name("creditnumber")).sendKeys("012041025");
		
		Select expdate=new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		expdate.selectByVisibleText("12");
		
		Select expyear=new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		expyear.selectByVisibleText("2010");
		
        driver.findElement(By.name("cc_frst_name")).sendKeys("Arijit");
		
		driver.findElement(By.name("cc_last_name")).sendKeys("Das");
		
		Thread.sleep(2000);
		
		JavascriptExecutor scroll1 = (JavascriptExecutor)driver;
		scroll1.executeScript("window.scrollBy(0,550)", "");
		
		
		driver.findElement(By.name("billAddress1")).clear();
		
		driver.findElement(By.name("billAddress1")).sendKeys("1/33 Sree Colony");
		
		driver.findElement(By.name("billCity")).clear();
		
		driver.findElement(By.name("billCity")).sendKeys("Kolkata");
		
		driver.findElement(By.name("billState")).clear();
		
		driver.findElement(By.name("billState")).sendKeys("West Bengal");
		
		driver.findElement(By.name("billZip")).clear();
		
		driver.findElement(By.name("billZip")).sendKeys("700092");
		
		Thread.sleep(5000);
		
		Select drpcountry1= new Select(driver.findElement(By.name("billCountry")));
		drpcountry1.selectByVisibleText("INDIA");
		System.out.println("WE selected INDIA");
		
		List CheckBoxList =  driver.findElements(By.name("ticketLess"));
		((WebElement) CheckBoxList.get(1)).click();
		Thread.sleep(3000);
		System.out.println("------------>");
		
		//driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).sendKeys(Keys.SPACE);
		
		//driver.findElement(By.xpath("//input[@type='checkbox'])[last()]")).click();
		
		/*WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/tr[14]/td[2]/input[@value='checkbox']")));
		
		//driver.findElement(By.xpath("/tr[14]/td[2]/input[@value='checkbox']")).click();
		java.util.List<WebElement> els = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for ( WebElement el : els ) {
		    if ( !el.isSelected() ) {
		        el.click();
		    }*/
		
		driver.findElement(By.name("buyFlights")).click();
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")).click();
		
		//---> End Of Billing
		
		
		
		
	}
		
		
		
		
	}

