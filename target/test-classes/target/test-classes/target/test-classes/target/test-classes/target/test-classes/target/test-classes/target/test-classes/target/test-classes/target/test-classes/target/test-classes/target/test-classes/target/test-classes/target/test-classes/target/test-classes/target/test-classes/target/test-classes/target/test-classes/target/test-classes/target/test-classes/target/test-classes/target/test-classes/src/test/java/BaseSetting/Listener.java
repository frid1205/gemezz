/**
 * 
 */
package BaseSetting;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


/**
 * @author fendyridwan
 *
 */
public class Listener implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("-----------="+result.getName()+"=------------");
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("--Pass--");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		BaseSetting ba = new BaseSetting();
		try {
			FileUtils.copyFile(ba.getscreenshot(), new File("screenshot/"+result.getName()+".jpg"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(result.getThrowable().getMessage());
		System.out.println("--Fail--");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
