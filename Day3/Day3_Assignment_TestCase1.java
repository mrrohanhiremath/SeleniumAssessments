package capgeminiAssignmentsOnSelenium.Day3;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day3_Assignment_TestCase1 {
	public static void main(String[] args) throws InterruptedException {
		//avoiding notification popup
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver d = new ChromeDriver(option);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.easemytrip.com/");
		//click on onway
		d.findElement(By.xpath("//li[@id=\"oway\"]")).click();
		Thread.sleep(2000);
		//click on from 
		d.findElement(By.xpath("//p[@id=\"pff\"]")).click();
		Thread.sleep(2000);
		//form address
		WebElement from = d.findElement(By.xpath("//input[@id=\"a_FromSector_show\"]"));
		from.sendKeys("Banglore");
		Thread.sleep(2000);
		//click on suggestion
		d.findElement(By.xpath("//span[@id=\"spnMysuru\"]")).click();
		Thread.sleep(2000);
		
		//to address
		WebElement to = d.findElement(By.xpath("//input[@id=\"a_Editbox13_show\"]"));
		to.sendKeys("Mumbai");
		Thread.sleep(2000);
		//click on suggestion
		d.findElement(By.xpath("//span[@id=\"spnShirdi\"]")).click();
		Thread.sleep(2000);
		//click on date
		d.findElement(By.xpath("//li[@id=\"trd_5_18/09/2026\"]")).click();
		Thread.sleep(2000);
		//click on travel class
		d.findElement(By.xpath("//span[@class=\"ftn14\" and @id=\"spnTraveller\"]")).click();
		Thread.sleep(2000);
		//adult +2
		d.findElement(By.xpath("//button[@id=\"add\" and @class=\"add plus_box1\"]")).click();
		Thread.sleep(2000);
		//click on economy
		d.findElement(By.xpath("//span[@id=\"spanEconomy\"]")).click();
		Thread.sleep(2000);
		//click on search
		d.findElement(By.xpath("//input[@class=\"srchBtnSe\"]")).click();
		Thread.sleep(2000);
		//flight result page
		String result = d.getTitle();
		Thread.sleep(2000);
		if(result.contains("EaseMyTrip.com Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com")) {
			System.out.println("Flight result page is displayed");
		}
		else {
			System.out.println("Fligt result page is not displayed");
		}
		Thread.sleep(2000);
		d.quit();
		

	}

}
