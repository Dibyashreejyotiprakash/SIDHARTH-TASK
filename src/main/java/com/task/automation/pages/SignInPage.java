package com.task.automation.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.task.automation.util.JsonUtil;
import com.task.automation.util.ScreenshotUtility;

public class SignInPage {

	WebDriver driver;
	WebDriverWait wait;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 60);
	}

	public void launchPage() {
		
		driver.manage().deleteAllCookies();
		driver.get("https://cafetownsend-angular-rails.herokuapp.com/");
		//driver.get("http://test$_@gmail.com:test123@localhost:3001/signin");
		driver.manage().window().maximize();
		
		//waitForPageToLoad(logo);
	}
	
	public void waitForPageToLoad(){
		//explicit wait need with condition
		wait.until(ExpectedConditions.visibilityOf(logo));
	}
	
	public void waitForPageToLoad(WebElement webele){
		//explicit wait need with condition
		wait.until(ExpectedConditions.visibilityOf(webele));
	}
	
	//p[@class='error-message ng-binding' and @ng-show='showMessage']
	
	@FindBy(xpath="//input[@ng-model='user.name']")
	public WebElement USERNAME;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@ng-model='user.name']")
	public WebElement username;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath="//p[@ng-click='logout()']")
	public WebElement logout;
	
	@FindBy(xpath="//p[contains(text(),'Invalid')]")
	public WebElement errorMessage;
	
	@FindBy(xpath="//p[@id='greetings']")
	public WebElement greetingsmsg;
	
	@FindBy(xpath="//div[@class='main-view-wrapper main-view-wrapper-loggedIn']")
	public WebElement logo;
	//div[@class='style__logo_div__24RfS']//img
	
	@FindBy(xpath="//input[@placeholder='Email']")
	public WebElement textboxUsername;

	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement textboxPassword;

	@FindBy(xpath="//span[contains(text(),'Sign in')]")
	public WebElement buttonSignIn;

	@FindBy(xpath="//span[contains(.,\"Email is required\")]")
	public WebElement errorEmailIsRequired;
	
	@FindBy(xpath="//span[contains(.,\"Password is required\")]")
	public WebElement errorPasswordIsRequired;
	
	@FindBy(xpath="//span[contains(text(),'Network error. Failed to connect with server')]")
	public WebElement errorInvalidUsernameOrPassword;
	
	@FindBy(xpath="//*[@class=\"style__errorMessage__1xJlO\"]/span[text()=\"You are not authorized user. Please contact administrator.\"]")
	public WebElement errorUnathorisedUser;

	@FindBy(xpath="//div[contains(@class,'botMinimiseCloseImg')]")
	public WebElement closeAvaChat;
	
	//div[@class='style__botMinimiseCloseImg__3D1eg']//img
	
	@FindBy(xpath="//div[@style='touch-action: none; transform: translate(0px, 0px);']")
	public WebElement chatBotFrom;
	
	@FindBy(xpath="//div[8]//div[16]")
	public WebElement chatBotTo;
	
	@FindBy (xpath="//a[@ng-click='createEmployee()']")
	public WebElement createUser;
	
	@FindBy (xpath="//input[@ng-model='selectedEmployee.firstName']")
	public WebElement FirstNameUser;
	
	@FindBy (xpath="//input[@ng-model='selectedEmployee.lastName']")
	public WebElement LastNameUser;
	
	@FindBy (xpath="//input[@ng-model='selectedEmployee.startDate']")
	public WebElement StartDateUser;
	
	@FindBy (xpath="//input[@ng-model='selectedEmployee.email']")
	public WebElement EmailUser;
	
	@FindBy (xpath="//button[@ng-show='isCreateForm']")
	public WebElement AddButtonUser;
	
	public void clearUsername() throws InterruptedException {
		SignInPage signInPage = new SignInPage(driver);
		signInPage.USERNAME.clear();
		Thread.sleep(5000);
	}
	
	public void signIn () throws Exception, IOException {
		SignInPage signInPage = new SignInPage(driver);
		signInPage.launchPage();
		//Thread.sleep(3000);
	}
	
	public void loginUser(String user, String password) throws InterruptedException {
		SignInPage signInPage = new SignInPage(driver);
		signInPage.username.clear();
		signInPage.username.sendKeys(user);
		signInPage.password.sendKeys(password);
		signInPage.submit.click();
		Thread.sleep(3000);
	}

	
	public void loginButtonClick() throws InterruptedException {
		SignInPage signInPage = new SignInPage(driver);
		signInPage.submit.click();
		Thread.sleep(3000);
	}
	
	public static boolean isDialogPresent(WebDriver driver) {
        try {
            driver.getTitle();
            return false;
        } catch (UnhandledAlertException e) {
            // Modal dialog showed
            return true;
        }
    }
	public void login() throws IOException, Exception {
		SignInPage signInPage = new SignInPage(driver);
		signInPage.signIn();
		Thread.sleep(3000);
		//TaskPage taskpage = new TaskPage(driver);
		signInPage.username.sendKeys(SignInPage.getTestData("username"));
		signInPage.password.sendKeys(SignInPage.getTestData("password"));
		signInPage.submit.click();
		Thread.sleep(3000);
	}
	public static String getTestData(String input) throws IOException, ParseException {
		String testdata;
	//	return  testdata = JsonUtil.getData().get(input).toString();
		return testdata = (String) JsonUtil.getJsonData().get(input);
	}

}
