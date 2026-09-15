package capgeminiAssignmentsOnSelenium.DAY8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import day8PomFiles.PomLogin;
import day8PomFiles.Pomcandidate;

public class Day8_Assignmnet_Testcase1 {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException  {
		FileInputStream fis = new FileInputStream("./src/test/java/capgeminiAssignmentsOnSelenium/DAY8/day8.properties");
		Properties p = new Properties();
		p.load(fis);
		//properties file
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
		//excelfile
		FileInputStream fis1 = new FileInputStream("./src/test/java/capgeminiAssignmentsOnSelenium/DAY8/day8.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String FirstName = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String MiddleName = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String Lastname = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String Email = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		//String PhoneNumber = wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		String CName = wb.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
		
		WebDriver driver = null;
		if(BROWSER.equals("chrome")) {
			driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		//login
		PomLogin p1 =new PomLogin(driver);
		p1.getUn(USERNAME);
		p1.getPwd(PASSWORD);
		p1.getLgbutton();
		//click on recruiter
		p1.getRecruitmrnt();
		//click on add
		p1.getAddbutton();
		//firstname
		p1.getFname(FirstName);
		//middlename
		p1.getMname(MiddleName);
		//lastname
		p1.getLname(Lastname);
		//email
		p1.getEmail(Email);
		//phno
		//p1.getPhno(PhoneNumber);
		//vacancy
		p1.getVacancy().click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//resume
		p1.getResume("C:\\Users\\rohan\\Downloads\\Rohan Hiremath's resume (2).pdf");
		//calender
		//p1.getCalender().clear();
		//p1.getCalender("2026-02-09");
		//save
		p1.getSave();
		
		
		
		
		//candidate page
		Pomcandidate p2= new Pomcandidate(driver);
		p2.getCandidate();
		//jobtitle
		p2.getJobtitle();
		//select ceo
		p2.getCeo();
		//vacancy
		p2.getCvacancy();
		//jaa
		p2.getJaa();
//		//manageer
		p2.getManager();
//		//hiring mgr
		Thread.sleep(3000);
		p2.getHrmgr();
		//status
		p2.getStatus();
		p2.getSt();
		//candidatename
		p2.getCandidatename("rohan");
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//from n to
		p2.getFrom("2026-16-09");
		p2.getTo("2026-22-09");
		//submit
		p2.getSubmit();
		
		//verify
//		WebElement myrecord = p2.getRecords();
//		if(myrecord.isDisplayed()) {
//			System.out.println("candidate is added");
//		}
//		else {
//			System.out.println("candidate not found");
//		}
		//quit	
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
