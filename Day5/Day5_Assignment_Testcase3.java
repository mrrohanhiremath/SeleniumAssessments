package capgeminiAssignmentsOnSelenium.Day5;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day5_Assignment_Testcase3 {
	public static void main(String[] args) throws IOException, ParseException, InterruptedException {
		FileReader fir = new FileReader("./src/test/java/capgeminiAssignmentsOnSelenium/Day5/demoqspidersdata.json");
		JSONParser jsonparser = new JSONParser();
		Object obj = jsonparser.parse(fir);
		JSONObject json=(JSONObject)obj;
		String BROWSER = json.get("browser").toString();
		String URL = json.get("url").toString();
		String USERNAME = json.get("email").toString();
		String PASSWORD = json.get("password").toString();
		
		WebDriver driver = null;
		if(BROWSER.equals("Chrome")) {
			driver= new ChromeDriver();
		}
		if(BROWSER.equals("Edge")) {
			driver = new EdgeDriver();
		}
		if(BROWSER.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//launch qspiders demo
		driver.get(URL);
		Thread.sleep(2000);
		//email
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(USERNAME);
		Thread.sleep(2000);
		//password
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(PASSWORD);
		Thread.sleep(2000);
		//click on login button 
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
