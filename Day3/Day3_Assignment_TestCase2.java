package capgeminiAssignmentsOnSelenium.Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Assignment_TestCase2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		Thread.sleep(2000);
		
		//dom attribute before clicking on date
		WebElement Date = d.findElement(By.xpath("//input[@placeholder=\"Select A Date\"]"));
		System.out.println(Date.getDomAttribute("value"));
		
		//click on select date
		d.findElement(By.xpath("//input[@placeholder=\"Select A Date\"]")).click();
		Thread.sleep(2000);
		//navigate to next month
		d.findElement(By.xpath("//button[@aria-label=\"Next Month\"]")).click();
		Thread.sleep(2000);
		//select valid date
		d.findElement(By.xpath("//div[@class=\"react-datepicker__day react-datepicker__day--014\"]")).click();
		Thread.sleep(2000);
		
		//verify the date
		String Dmattr = Date.getDomAttribute("value");
		System.out.println(Dmattr);
		if(Dmattr.contains("14/10/2026")) {
			System.out.println("Date is displayed correctly");
		}
		else {
			System.out.println("Date is displayed wrongly");
		}
		Thread.sleep(3000);
		d.quit();
		
	}

}
