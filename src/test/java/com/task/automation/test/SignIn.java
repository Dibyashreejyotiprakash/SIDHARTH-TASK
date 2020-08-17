package com.task.automation.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.task.automation.core.BaseTestCase;
import com.task.automation.core.ConfigurationManager;
import com.task.automation.pages.SignInPage;
import com.task.automation.pages.TaskPage;
import com.task.automation.util.ExtentReport;
import com.task.automation.util.JsonUtil;
import com.task.automation.util.RobotUtility;
import com.task.automation.util.ScreenshotUtility;
//import java.awt.Point;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

public class SignIn extends BaseTestCase {
	

	@Test(description="Validate Login with correct credentials",groups= "Login")
	public void verifyLoginWithIncorrectC() throws IOException, Exception {
		ExtentReport.extentlog = ExtentReport.extentreport.startTest("TC_validateLogin",
				"Verify Login with valid credentials");
		
		SignInPage signip = new SignInPage(driver);
		signip.signIn();
//		signip.USERNAME.sendKeys("Luk");
//		Thread.sleep(5000);
//		signip.password.sendKeys("Skywalker");
//		Thread.sleep(5000);
//		signip.submit.click();
//		Thread.sleep(5000);
//		assertEquals(signip.errorMessage.isDisplayed(), true);
	}
	@Test(description="Validate Login with correct credentials",groups= "Login")
	public void verifyLoginWithIncorrectCFailed() throws IOException, Exception {
		ExtentReport.extentlog = ExtentReport.extentreport.startTest("TC_validateLogin",
				"Verify Login with valid credentials");
		
		SignInPage signip = new SignInPage(driver);
		signip.signIn();
		signip.USERNAME.sendKeys("Luk");
		Thread.sleep(5000);
		signip.password.sendKeys("Skywalker");
		Thread.sleep(5000);
		signip.submit.click();
		Thread.sleep(5000);
		assertEquals(signip.errorMessage.isDisplayed(), true);
	}
//	@Test(description = "Verify Login with valid credentials",priority=3,groups= {"SmokeTest","RegressionTest","User_BusinessComponent"})
//	public void TC_validateLogin() throws Exception 
//	{
//		ExtentReport.extentlog = ExtentReport.extentreport.startTest("TC_validateLogin",
//				"Verify Login with valid credentials");
//	
//			SignInPage signInPage = new SignInPage(driver);
//		
//		signInPage.signIn();
//		//signInPage.username.sendKeys("Luke");
//		Thread.sleep(5000);
//		//signInPage.clearUsername();
//		signInPage.username.sendKeys(SignInPage.getTestData("username"));
//		signInPage.password.sendKeys(SignInPage.getTestData("password"));
//		signInPage.submit.click();
//		Thread.sleep(5000);
//		String url = driver.getCurrentUrl();
//		String title = driver.getTitle();
//		String userfield = signInPage.greetingsmsg.getText();
//		assertEquals(userfield,"Hello Luke");
//		assertEquals(url,SignInPage.getTestData("loginConfirmation"));
//		System.out.println(url + "@@@@@@" + title + "*********" + userfield);
//		String id = signInPage.greetingsmsg.getAttribute("ng-click");
//		//signInPage.loginUser("Luke","Skywalker");
////		Thread.sleep(5000);
////		driver.navigate().refresh();
////		Thread.sleep(5000);
////		driver.navigate().back();
////		Thread.sleep(5000);
////		driver.navigate().forward();
//		//signInPage.logout.click();
//		//assertEquals(, t;rue)
//	}
//	
//	@Test(description = "Verify Login with valid credentials",priority=3,groups="smoke")
//	public void TC_CreateUser() throws Exception 
//	{
//		ExtentReport.extentlog = ExtentReport.extentreport.startTest("TC_validateLogin",
//				"Verify Login with valid credentials");
//	
//			SignInPage signInPage = new SignInPage(driver);
//		
//		signInPage.signIn();
//		signInPage.loginUser("Luke","Skywalker");
//		signInPage.createUser.click();
//		Thread.sleep(3000);
////		signInPage.FirstNameUser.sendKeys("TestOne");
////		signInPage.LastNameUser.sendKeys("TestTwo");
////		signInPage.StartDateUser.sendKeys("1988-06-15");
////		signInPage.EmailUser.sendKeys("Training@gmail.com");
////		signInPage.AddButtonUser.click();
//		assertEquals(signInPage.logout.isDisplayed(), true);
//		driver.navigate().refresh();
//		driver.navigate().to("https://google.com");
//		Select technology = new Select(driver.findElement(By.xpath("//select[@id='effectTypes']")));
//		technology.selectByVisibleText("Drop");
//		technology.selectByIndex(4);
//		driver.getCurrentUrl();
//		driver.getTitle();
//		driver.getPageSource();
//		signInPage.username.getText();
//		signInPage.errorInvalidUsernameOrPassword.getAttribute("name");
//		Thread.sleep(5000);
//	}
//	
//
//	@Test(description = "Verify Login error message with invalid username",priority=2,groups="RegressionTest")
//	public void TC_validateInvalidUsernameErrMsg() throws Exception 
//	{
//		ExtentReport.extentlog = ExtentReport.extentreport.startTest("TC_validateInvalidUsernameErrMsg",
//				"Verify Login error message with invalid username");
//	
//			SignInPage signInPage = new SignInPage(driver);
//		
//		signInPage.signIn();
//		signInPage.loginUser("test", "ress");
//		//TaskPage taskpage = new TaskPage(driver);
////		signInPage.username.sendKeys(SignInPage.getTestData("invalidusername"));
////		signInPage.password.sendKeys(SignInPage.getTestData("password"));
////		signInPage.submit.click();
////		Thread.sleep(3000);
//		Assert.assertEquals(signInPage.errorMessage.isDisplayed(), true);
//	}
//	@Test
//	public void pracTestSelCom() throws InterruptedException {
//		SignInPage signInPage = new SignInPage(driver);
//		driver.get("https://google.com");
//		driver.navigate().to("http://google.com");
//		driver.navigate().forward();
//		driver.navigate().back();
//		driver.navigate().refresh();
//		Select country = new Select(signInPage.submit);
//		country.selectByVisibleText("Appliances"); // using selectByVisibleText() method
//		country.selectByValue("MX"); 
//		country.selectByIndex(9);
//		String text = signInPage.submit.getAttribute("text");
//		driver.switchTo().alert().accept();//handle web popups
//		driver.switchTo().alert().dismiss();//handle web popups 
//		driver.switchTo().frame(1);//go to frame number one
//		driver.getTitle();//to fetch title of the webpage
//		driver.getCurrentUrl();//to getch the current url of the page
//		signInPage.buttonSignIn.clear();//to clear text 
//		String currenttab=driver.getWindowHandle();
//		//perform somae action
//		driver.switchTo().window(currenttab);
//		driver.close();//close current browser window
//		//how to handle web popus/ pop ups/
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().getText();
//		driver.switchTo().alert().sendKeys("test");
//		driver.switchTo().frame(1).findElement(By.id("name")).sendKeys("Test");
//		driver.switchTo().defaultContent();
//		//
//		String parentwindow = driver.getWindowHandle();
//		driver.findElement(By.id("")).click();
//		Set<String> windows = driver.getWindowHandles();
//		for (String whandles:windows) {
//			if (!whandles.equalsIgnoreCase(parentwindow))
//			{
//				driver.switchTo().window(parentwindow);
//			}
//				
//		}
//		//wait
//		Thread.sleep(500);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement web = driver.findElement(By.name("Testing Controls "));
//		WebDriverWait wait = new WebDriverWait(driver,300);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Testing Controls ")));
//		wait.until(ExpectedConditions.visibilityOf(web));
//		//wait for a certain condition to appear
//		Wait waitfluent = new FluentWait(driver)
//		.withTimeout(Duration.ofSeconds(30))
//		.pollingEvery(Duration.ofSeconds(10));
//		boolean bol = signInPage.AddButtonUser.isEnabled();
//		boolean bol1 = signInPage.chatBotFrom.isSelected();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollby(0,1000");
//		
//
//		
//	}
//	
//	@Test(description = "Verify Login error message with invalid password",priority=1,groups="RegressionTest")
//	public void TC_validateInvalidPasswordErrMsg() throws Exception 
//	{
//		ExtentReport.extentlog = ExtentReport.extentreport.startTest("TC_validateInvalidPasswordErrMsg",
//				"Verify Login error message with invalid password");
//	
//			SignInPage signInPage = new SignInPage(driver);
//		
//		signInPage.signIn();
//		Thread.sleep(5000);
//		//TaskPage taskpage = new TaskPage(driver);
//		//signInPage.username.sendKeys(SignInPage.getTestData("username"));
//		//signInPage.password.sendKeys(SignInPage.getTestData("invalidpassword"));
//		signInPage.username.sendKeys("Luk");
//		signInPage.password.sendKeys("SkyWalker");
//		signInPage.submit.click();
//		Thread.sleep(3000);
//		Assert.assertEquals(signInPage.errorMessage.isDisplayed(), true);
//	}
//
//   @Test
//   public static void practicegrp3ui() throws AWTException {
//	   ConfigurationManager configurationManager=new ConfigurationManager();
//	   System.setProperty("webdriver.firefox.driver",configurationManager.properties.getProperty("firefox.driver.path"));
//	   DesiredCapabilities dsr = new DesiredCapabilities();
//	   dsr.setAcceptInsecureCerts(true);
//	   FirefoxOptions firefoxOptions = new FirefoxOptions();
//	   firefoxOptions.addPreference("permissions.default.microphone", 1);
//   	   firefoxOptions.addPreference("permissions.default.camera", 1);
//   	   firefoxOptions.setAcceptInsecureCerts(false);
//	   firefoxOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//	   WebDriver driver = new FirefoxDriver(firefoxOptions);
//	   WebDriver driverch = new ChromeDriver();
//	   driver.get("https://cafetownsend-angular-rails.herokuapp.com/login");
//	   driver.navigate().to("https://cafetownsend-angular-rails.herokuapp.com/login");
//	   driver.navigate().refresh();
//	   driver.navigate().back();
//	   driver.navigate().forward();
//	   driver.findElement(By.id("countriesSingle")).click();
//	   driver.findElements(By.id("user"));
//	   Select slc = new Select(driver.findElement(By.id("countriesSingle")));
//	   slc.selectByIndex(2);
//	   slc.selectByVisibleText("China");
//	   slc.selectByValue("china");
//	   driver.getPageSource();
//	   driver.findElement(By.id("countriesSingle")).getAttribute("class");
//	   driver.switchTo().alert().accept();
//	   driver.switchTo().alert().dismiss();
//	   String popuptext = driver.switchTo().alert().getText();
//	   driver.switchTo().alert().sendKeys("TestMsg");
//	   driver.switchTo().frame("iframe1");
//	   WebElement framew = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
//	   driver.switchTo().frame(framew);
//	   driver.switchTo().defaultContent();
//	   String parent = driver.getWindowHandle();
//	   Set<String> getwindh = driver.getWindowHandles();
//	   for (String whd:getwindh) {
//		   if (!(whd==parent)) {
//			   driver.switchTo().window(whd);
//		   }
//	   }
//	   driver.close();
//	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//	   WebDriverWait waitw = new WebDriverWait(driver,60000);
//	   waitw.until(ExpectedConditions.presenceOfElementLocated(By.name("login")));
//	   waitw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@name='iframe_a']")));
//	   Wait wait = new FluentWait(driver)
//			   .withTimeout(Duration.ofSeconds(600))
//			   .pollingEvery(Duration.ofSeconds(60))
//			   .ignoring(Exception.class);
//	   
//	   SignInPage signInPage = new SignInPage(driver);
//	   signInPage.buttonSignIn.isEnabled();
//	   //4th class
//	   driver.manage().window().maximize();
//	   driver.manage().window().setSize(new Dimension(1024, 768));
//	   Dimension size = driver.manage().window().getSize();
//	   int width1 = size.getWidth();
//	   int height1 = size.getHeight();
//	  WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
//	  WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
//	  Actions builder = new Actions(driver);//actions is a class-it has all the methods
//	  builder.dragAndDrop(source, destination);
//	  Action  actio = builder//action is an interface
//      .dragAndDrop(source,destination)
//	  .click()
//	  .keyDown("login-textbox")
//	  .sendKeys("login-textbox", "hello")
//	  .keyUp("login-textbox")
//	  .doubleClick()
//	  .contextClick()
//	  .build();
//	  builder.perform();
//	  
//	  Robot robo = new Robot();
//	  robo.keyPress(KeyEvent.VK_ENTER);
//	  
//	  driver.manage().getCookies(); 
//	  driver.manage().getCookieNamed("APISID");
//	  driver.manage().deleteCookieNamed("APISID");
//	  driver.manage().deleteAllCookies(); 
//	  Cookie cookie1 = new Cookie("test2", "cookie2");
//	  driver.manage().addCookie(cookie1);   
//	   
//   }
//   @Test
//   public static void weguipractice() throws InterruptedException, AWTException, WebDriverException, IOException {
//	   System.setProperty("webdriver.chrome.driver","path of driver exe for chrome");
//	   ChromeOptions chromeOptions = new ChromeOptions();
//	   chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//	   chromeOptions.addArguments("");
//	   WebDriver driver = new ChromeDriver(chromeOptions);
//	   driver.get("https://www.google.com");
//	   driver.navigate().to("https://www.google.com");
//	   
//	   driver.navigate().back();
//	   driver.navigate().forward();
//	   driver.navigate().refresh();
//	   SignInPage sip = new SignInPage(driver);
//	   sip.USERNAME.sendKeys("Luke");
//	   sip.USERNAME.clear();
//	   sip.USERNAME.sendKeys("Luke");
//	   sip.password.sendKeys("Skywalker");
//	   sip.loginButtonClick();
//	   
//	   Select slc = new Select(driver.findElement(By.id("countriesSingle")));
//	   slc.selectByIndex(4);
//	   slc.selectByVisibleText("India");
//	   slc.selectByValue("usa");
//	   slc.getAllSelectedOptions();
//	   driver.getPageSource();
//	   
//	   driver.switchTo().alert().accept();
//	   driver.switchTo().alert().dismiss();
//	   String popuptext = driver.switchTo().alert().getText();
//	   driver.switchTo().alert().sendKeys("TestMsg");
//	   
//	   driver.switchTo().frame(5);
//	   driver.switchTo().frame("Iframe");
//	   WebElement framew = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
//	   driver.switchTo().frame(framew);
//	   driver.switchTo().defaultContent();
//	   
//	   String parent = driver.getWindowHandle();
//	   driver.findElement(By.xpath("//a[contains(text(),'Opens in a new window')]")).click();
//	   Set<String> getwindh = driver.getWindowHandles();
//	   for (String whd:getwindh) {
//		   if (!(whd==parent)) {
//			   driver.switchTo().window(whd);
//			   driver.close();
//		   }
//	   }
//	   
//	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//	   
//	   WebDriverWait waitw = new WebDriverWait(driver,60);
//	   waitw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='greetings']")));
//	   waitw.until(ExpectedConditions.visibilityOf(sip.EmailUser));
//	   
//	   Wait wait = new FluentWait(driver)
//			   .withTimeout(Duration.ofSeconds(120))
//			   .pollingEvery(Duration.ofSeconds(20))
//			   .ignoring(Exception.class);
//	  
//	 if (driver.findElement(By.xpath("//a[@id='bAdd']")).isEnabled()==true) {
//		 System.out.println("Create button is Enabled");}
//		 else {
//			 System.out.println("Create button is Not Enabled");
//		 }
//	 driver.manage().window().maximize();
//	int height = driver.manage().window().getSize().getHeight();
//	int width =  driver.manage().window().getSize().getWidth();
//	Dimension dms = new Dimension(111,111);
//	driver.manage().window().setSize(dms);
//	int x = driver.manage().window().getPosition().getX();
//	Point pnt = new Point(11,11);
//	driver.manage().window().setPosition(pnt);
//	
//	Robot robo = new Robot();
//    robo.keyPress(KeyEvent.VK_0);
//   
//    WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
//	  WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
//	  
//	  Actions builder = new Actions(driver);//actions is a class-it has all the methods
//	  builder.dragAndDrop(source, destination);
//	  
//	  Action  actio = builder//action is an interface
//      .dragAndDrop(source,destination)
//	  .click()
//	  .keyDown("login-textbox")
//	  .sendKeys("login-textbox", "hello")
//	  .keyUp("login-textbox")
//	  .doubleClick()
//	  .contextClick()
//	  .build();
//	  builder.perform();
//   
//	driver.manage().deleteAllCookies();
//	driver.manage().deleteCookieNamed("_CafeTownsend-Angular-Rails_session");
//	Set<Cookie> cookies = driver.manage().getCookies();
//	Cookie cookie = driver.manage().getCookieNamed("_CafeTownsend-Angular-Rails_session");
//	Cookie cookie1 = new Cookie("test2", "cookie2");
//	driver.manage().addCookie(cookie1);
//	
//	TakesScreenshot screenShot =(TakesScreenshot)driver;
//	FileHandler.copy(screenShot.getScreenshotAs(OutputType.FILE),new File("path/to/destination/folder/screenshot.png"));
//   
//	
//	JavascriptExecutor jscrp = (JavascriptExecutor) driver;
//	jscrp.executeScript("return document.URL");
//	
//	
//	 //  chromeOptions.setProxy("");
//	    //chromeOptions.addPreference("permissions.default.microphone", 1);
//	    DesiredCapabilities caps = new DesiredCapabilities(); 
//	    caps.setCapability("browserName", "firefox"); 
//	    caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//	    
//	    
//	    WebDriver driver1 = new FirefoxDriver();
//	    WebDriver driver2 = new InternetExplorerDriver();
//	   
//   }
	
}
