package capgeminiAssignmentsOnSelenium.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Assignment_TestCase1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//navigating to facebook
		d.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//finding create account and clicking on it
		d.findElement(By.xpath("//span[text()='Create new account']")).click();
		WebElement FirstName = d.findElement(By.xpath("//input[@id='_R_1cl2p4jikacppb6amH1_']"));
		//FirstName Location
		int FN = FirstName.getLocation().getY();
		System.out.println(FN);
		WebElement SurName = d.findElement(By.xpath("//input[@id='_R_1kl2p4jikacppb6amH1_']"));
		//Second Name Location
		int SN = SurName.getLocation().getY();
		System.out.println(SN);
		//Validation
		if(FN == SN) {
			System.out.println("Both are on same line");
		}
		else {
			System.out.println("Both are Not in same Line");
		}
		Thread.sleep(3000);
		d.quit();
	}

}
