package capgeminiAssignmentsOnSelenium.Day5;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day5_Assignment_Testcase2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./src/test/java/capgeminiAssignmentsOnSelenium/Day5/OrangeORM.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String BROWSER = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String URL = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String USERNAME = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String PASSWORD = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		WebDriver driver = null;
		if(BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if(BROWSER.equals("Edge")) {
			driver = new EdgeDriver();
		}
		if(BROWSER.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//goin to orange hrm login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		//username
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(USERNAME);
		Thread.sleep(2000);
		//password
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(PASSWORD);
		Thread.sleep(2000);
		//click on login button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
