package capgeminiAssignmentsOnSelenium.Day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceKeywordImplementation {
	WebDriver driver;
	//launch
	public void launchbrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	//open
	public void openbrowser() {
		driver.get("https://www.saucedemo.com/");
	}
	//username
	public void username() {
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("standard_user");
	}
	//password
	public void password() {
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("secret_sauce");
	}
	//login button
	public void loginbtn() {
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	}
	//close browser
	public void closebrowser() {
		driver.quit();
	}

}
