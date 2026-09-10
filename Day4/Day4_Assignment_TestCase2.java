package capgeminiAssignmentsOnSelenium.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_Assignment_TestCase2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.zomato.com/bangalore/restaurants");
		Thread.sleep(3000);
		//click on login
		d.findElement(By.xpath("//button[normalize-space(text())=\"Log in\"]")).click();
		//finding frame
		WebElement frame = d.findElement(By.xpath("//iframe[@id=\"auth-login-ui\"]"));
		//switch to frame
		d.switchTo().frame(frame);
		//phone number
		d.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("1233456");
		//switch to main page
		d.switchTo().defaultContent();
		Thread.sleep(3000);
		//search dom attribute to verify
		WebElement search = d.findElement(By.xpath("//input[@placeholder=\"Search for restaurant, cuisine or a dish\"]"));
		String dma = search.getDomAttribute("placeholder");
		System.out.println(dma);
		//validation
		if(dma.contains("Search for restaurant, cuisine or a dish")) {
			System.out.println("we are in main page");
		}
		else {
			System.out.println("we are not in main page");
		}
		Thread.sleep(3000);
		d.quit();
		
	}



}
