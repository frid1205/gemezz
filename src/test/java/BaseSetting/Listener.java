/**
 * 
 */
package BaseSetting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


/**
 * @author fendyridwan
 *
 */
public class Listener implements ITestListener{
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;

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
		 //System.out.println("where will you out>"+context.getPassedTests().getAllMethods());
	 	try {
			File src = new File("testResultGemezz.xlsx");
			
			fis = new FileInputStream(src);
 		
	 		wb = new XSSFWorkbook(fis);
	 		
	 		sheet = wb.getSheetAt(0);
	     
		    int lastrownumber = sheet.getLastRowNum();
			int testResult = 8;
			String getCaseNameonExcel;
			String passResultFromContext = context.getPassedTests().getAllMethods().toString();
			String failResultFromContext = context.getFailedTests().getAllMethods().toString();
			String skipResultFromContext = context.getSkippedTests().getAllMethods().toString();
			
			String aa;
			for(int countRow = 1;countRow<=lastrownumber;countRow++){
				XSSFRow row = sheet.getRow(countRow);
				
				getCaseNameonExcel = row.getCell(1).toString();
				
				/*System.out.println(countRow+" = "+getCaseNameonExcel);
				if(countRow==21) {
					System.out.println("masuk");
				}*/
				if(getCaseNameonExcel.length()<4||getCaseNameonExcel.isEmpty()||getCaseNameonExcel.equals(""))
				{
					row.getCell(testResult).setCellValue("-");
					
					aa = "-kosong-";
				}else
				if(passResultFromContext.contains(getCaseNameonExcel)) 
				{
					row.getCell(testResult).setCellValue("PASS");
					//row.getCell(9).setCellValue("-");
					aa = "PASS";
				}
				else 
				if(failResultFromContext.contains(getCaseNameonExcel)) 
				{
					row.getCell(testResult).setCellValue("FAIL");
					//row.createCell(7).setCellValue("http://3.1.15.19/view/SaltMedia/job/SaltMediaCMS1/ws/screenshot/"+getCaseNameonExcel+".jpg");
					//row.getCell(9).setCellValue("http://3.1.15.19/view/SaltMedia/job/SaltMediaCMS1/ws/screenshot/"+getCaseNameonExcel+".jpg");
					//row.createCell(8).setCellValue(context.getFailedButWithinSuccessPercentageTests().toString());
					aa = "Fail";
				}
				else 
				if(skipResultFromContext.contains(getCaseNameonExcel)) 
				{
					row.getCell(testResult).setCellValue("skip");
					//row.getCell(9).setCellValue("-");
					aa = "Skip";
				}
				else {
					row.getCell(testResult).setCellValue("-");
					//row.getCell(9).setCellValue("-");
					aa = "-";
				}
				
				//System.out.println(getCaseNameonExcel+"--"+aa);
			}
			FileOutputStream fout = new FileOutputStream(src);
			wb.write(fout);
	        fis.close();
	        fout.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
