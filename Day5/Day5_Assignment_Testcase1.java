package capgeminiAssignmentsOnSelenium.Day5;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day5_Assignment_Testcase1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./src/test/java/capgeminiAssignmentsOnSelenium/Day5/day5Commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("email");
		String PASSWORD = p.getProperty("password");
		
		WebDriver driver = null;
		if(BROWSER.equals("Chrome")) {
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
		//going to demowebshop
		driver.get(URL);
		Thread.sleep(2000);
		//click on login link
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		//email textfield
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(USERNAME);
		Thread.sleep(2000);
		//password textfield
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(PASSWORD);
		Thread.sleep(2000);
		//login button
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
