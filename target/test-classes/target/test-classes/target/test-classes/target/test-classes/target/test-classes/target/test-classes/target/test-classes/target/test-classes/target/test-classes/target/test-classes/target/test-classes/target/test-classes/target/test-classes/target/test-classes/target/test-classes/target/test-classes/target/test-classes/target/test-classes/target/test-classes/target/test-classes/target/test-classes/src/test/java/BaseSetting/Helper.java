package BaseSetting;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseSetting.BaseSetting;
import Pages.LoginPage;

public class Helper extends BaseSetting{

	@Test
	public void LoginHelper() throws InterruptedException {
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		
		lp.login("wesley01@yopmail.com", "12345678");
		
		
        
	}

}
