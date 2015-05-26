package com.tutorialspoint.demo.hr.model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class iHrmsTest {
	private static final long TIMEOUT = 0;
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arijit Das\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://ihrms.myubiquesystems.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
		
		
		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.linkText("Candidate"));
		actions.moveToElement(mainMenu);

		WebElement subMenu = driver.findElement(By.xpath(".//*[@id='headerPan']/div[4]/ul/li[2]/ul/li[1]/a"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.id("canName")).sendKeys("Prabhakar");
		driver.findElement(By.id("txtLocation")).sendKeys("Bangalore");
		driver.findElement(By.id("txtLocation")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("txtLocation")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement clearButton = driver.findElement(By.xpath(".//*[@class='slimScrollDiv k-pane k-scrollable']/div/div/div/div[2]/div[17]/div/div/a"));
		// ((JavascriptExecutor) driver).executeScript( "arguments[0].scrollIntoView();", searchButton);
		((JavascriptExecutor) driver).executeScript( "arguments[0].scrollIntoView();", clearButton);
		clearButton.click();
		Thread.sleep(3000);
		
		/*driver.findElement(By.id("canName")).sendKeys("Prabhakar");
		driver.findElement(By.id("txtLocation")).sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@class='slimScrollDiv k-pane k-scrollable']/div/div/div/div[2]/div[17]/div/a")).click();
		Thread.sleep(3000);
		WebElement searchButton=driver.findElement(By.xpath(".//*[@class='slimScrollDiv k-pane k-scrollable']/div/div/div/div[2]/div[17]/div/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchButton);
		searchButton.click();
		Thread.sleep(10000);
		*/
		
		
		/*mainMenu=driver.findElement(By.linkText("Vacancy"));
		actions.moveToElement(mainMenu);
		WebElement subMenu1 = driver.findElement(By.xpath(".//*[@id='headerPan']/div[4]/ul/li[4]/ul/li[1]/a"));
		actions.moveToElement(subMenu1);
		actions.click().build().perform();*/
		/*driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);*/
		//Thread.sleep(3000);
		
		
		/*driver.findElement(By.id("canName")).sendKeys("Aakash Bhammarkar");
		
		driver.findElement(By.id("txtLocation")).sendKeys("XXX");
		
		driver.findElement(By.id("ddlAvailability")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");*/
	
	
		/*WebDriverWait wait = new WebDriverWait(driver,150);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnSearch")));
		*/
		
		
		/*WebElement e = driver.findElement(By.id("btnSearch"));
		e.click();*/
		
		/* WebElement checkBox = driver.findElement(By.id("chkMyVac"));
		 checkBox.click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("btnSearch")).click();
		 Thread.sleep(3000);*/
		 
		 /*WebElement typeWebElement = driver.findElement(By.xpath(".//*[@id='Company_chosen']/a/span"));
		   Select sellectType = new Select(typeWebElement);
		   sellectType.selectByVisibleText("Cognizant Technology Solution India Pvt. LTD.");
		   Thread.sleep(TIMEOUT);*/
		 
		 /*driver.findElement(By.xpath(".//*[@id='Company_chosen']/a")).click();
		 Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='Company_chosen']/a")));
		 dropdown.selectByVisibleText("Cognizant Technology Solution India Pvt. LTD.");*/
		 
		 
		/* driver.findElement(By.xpath(".//*[@id='Company_chosen']/a/div/b")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath(".//*[@id='Company_chosen']/div/div/input")).sendKeys("c");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(".//*[@id='Company_chosen']/div/ul/li[2]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("btnSearch")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("jqg_listVacancyView_1")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Python Developer")).click();
		 Thread.sleep(3000);*/
		 
		 
		 
		driver.findElement(By.linkText("Logout")).click();
		
	}
	

}
