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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import Pages.LandingPage;
import Pages.LoginPage;
import Pages.MyPlanPage;
import Pages.PlanPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

@Listeners(Listener.class)
public class BaseSetting {
    public static DesiredCapabilities capabilities;
	public static URL url;
	
	public static AndroidDriver<MobileElement> driver;
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
		//capabilities.setCapability("appPackage","com.beinsports.connect.apac");
		//capabilities.setCapability("appActivity","ui.SplashActivity");		
		//capabilities.setCapability("appPackage","sg.wesley");
		//capabilities.setCapability("appActivity","sg.wesley.SplashActivity");
		capabilities.setCapability("newCommandTimeout", 0);
		capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		capabilities.setCapability("BROWSER_NAME","Chrome");
		
		driver = new AndroidDriver<MobileElement>(url, capabilities);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.resetApp();
		
	}
    
    public void signIn() throws InterruptedException {
    	LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
    	LandingPage ld = PageFactory.initElements(driver, LandingPage.class);
    	
    	ld.clickLoginButton();
		lp.login("wesley02@yopmail.com", "12345678");
    }
    
    public void hidekeyboard() {
    	driver.hideKeyboard();
    }
    
    public void backButton() {
    	driver.navigate().back();
    }
    
    public void cleanMyPlan() throws InterruptedException {
    	PlanPage pp = PageFactory.initElements(driver, PlanPage.class);
    	MyPlanPage mpp = PageFactory.initElements(driver, MyPlanPage.class);
    	boolean doEmptyPlan = true;
    	System.out.println("start clean = "+(pp.emptyPlanIsExist()));
		if(pp.emptyPlanIsExist() == true) {
			
			while(doEmptyPlan == true) {
				pp.clickContentMyPlan();
				scrollAndClick("Stop");
				mpp.clickYesAndroidButton();
			
				mpp.clickBackButton();
				System.out.println("end clean = "+doEmptyPlan+"-"+pp.emptyPlanIsExist());
				Thread.sleep(3000);
				if(pp.emptyPlanIsExist()==false) {
					doEmptyPlan = true;
					System.out.println("Still cleaning");
				}else {
					doEmptyPlan = false;
					System.out.println("oke clean plan is done");
				}
				
			}
		}else {
			System.out.println("has cleared");
		}
		System.out.println("clean success");
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