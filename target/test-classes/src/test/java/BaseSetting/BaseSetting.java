package BaseSetting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.google.common.collect.ImmutableMap;

import Pages.HomePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

@Listeners(Listener.class)
public class BaseSetting {
    public static DesiredCapabilities capabilities;
	public static URL url;
	
	public static AndroidDriver<WebElement> driver;
	public static WebElement element;
	public static TouchAction t;
    public static SoftAssert sa;
    
    @BeforeSuite
	public void deleteScreenShot() throws IOException
	{
		File dir = new File("ScreenShot");
		File[] listFiles = dir.listFiles();
	
		if(dir.length() >0) {
			for(File file : listFiles){
				file.getName();
				file.delete();
			}
			dir.delete();
		}
	}

    @BeforeSuite
	@Parameters ({"env","loc","port","udid","devicename","runningon"})
	public void a_SetUpAppium(String env, String loc, String port, String udid, String devicename, String runningon) throws MalformedURLException, FileNotFoundException 
	{
		//System.setOut(new PrintStream(new FileOutputStream("foxandroid output.txt")));
		System.out.println("Running on "+devicename);
		
		final String URL_STRING;
		if(runningon.equals("aws")) {
			URL_STRING = "http://127.0.0.1:4723/wd/hub";
		}else {
			URL_STRING = "http://127.0.0.1:"+port+"/wd/hub";
		}
		
		url = new URL(URL_STRING);
		String appPath = "path";

		//set capabilities
		capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, devicename);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability(MobileCapabilityType.VERSION, "10");
		capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		capabilities.setCapability("chromedriverExecutable", System.getProperty("user.dir")+"/driver/chromedriver_ver86_mac");
		capabilities.setCapability("newCommandTimeout", 0);
		capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		capabilities.setCapability("BROWSER_NAME","Chrome");
		
		driver = new AndroidDriver<WebElement>(url, capabilities);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.resetApp();
		
	}
    
    @BeforeMethod
    public void beforeTest() throws InterruptedException {
    	driver.get("http://ltc.la.gemezz.mobi");
		Thread.sleep(10000);
		//driver.get("http://jazz.slypee.pk");
    }
    
    public void login() throws InterruptedException {
    	System.out.println("-> login");
    	Thread.sleep(5000);
    	
    	HomePage hp = new HomePage(driver);
    	
    	hp.clickTribarButton();
    	
    	hp.clickSubcribeButton();
    	
    	hp.typeMsisdn();
    	hp.submitMsisdn();
    	Thread.sleep(3000);
    	
    	hp.typePin();
    	hp.submitPin();
    	Thread.sleep(10000);
    	
    }
    
    public void tap(int x, int y) {
    	/*
    	WebElement el1 = driver.findElementByXPath("");
    	
    	  TouchAction action = new TouchAction(driver);
    	  action.press(el0).moveTo(el1).release();
    	  
    	WebElement el0 = driver.findElement(By.xpath("//div[@id=\"st-trigger-effects\"]/button"));

    	 AndroidTouchAction touch = new AndroidTouchAction (driver);
    	  touch.tap (TapOptions.tapOptions ()
    	      .withElement (ElementOption.element(el0)))
    	    .perform ();
    	size = driver.manage().window().getSize();
    	System.out.println("size - "+size);
    	System.out.println("height - "+size.getHeight());
    	System.out.println("width - "+size.getWidth());
    	*/
    	//70,310
    	TouchAction action = new TouchAction(driver);
    	action.press(PointOption.point(x,y)) // x and y is the co-ordinate where you want to click.
    	.release()
    	.perform();
    	

    	/*
    	WebElement expandList = 
    		       driver.findElementByXPath("//div[@id=\"st-trigger-effects\"]/button");
    	//new Actions(driver).clickAndHold(expandList).perform();
    		    TouchActions t = new TouchActions(driver);
    		    t.singleTap(expandList);
    		    t.perform();
    	*/
    	
    }
    
    public void scrollDownIntoElement(String el) {
    	//Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.xpath(el));

        //This will scroll the page till the element is found	
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
    
    public void hidekeyboard() {
    	driver.hideKeyboard();
    }
    
    public void backButton() {
    	driver.navigate().back();
    }
    
  //get driver of this class for screenshot
  	public File getscreenshot() throws IOException
  	{
  		File des = driver.getScreenshotAs(OutputType.FILE);
  		return des;
  	}
    
    public void scrollAndClick(String visibleText) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
    }
   
    public boolean findTextContains(String visibleText) {
    	
    	if(driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").getSize().getWidth() > 0) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public String getDay() {
    	Date now = new Date();
    	SimpleDateFormat simpleDateformat = new SimpleDateFormat("E");
    	simpleDateformat = new SimpleDateFormat("EEEE");
    	return  simpleDateformat.format(now);
    			
    }
    
    public long getCurrentTime() {
    	return System.currentTimeMillis();
    }
       
    @AfterClass
  	public void resetApplicationState() throws InterruptedException {
  		driver.resetApp();
  	}
    
    @AfterSuite
	public void quitDriver() {
		driver.quit();
	}
}