package capgeminiAssignmentsOnSelenium.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Assignment_Testcase2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.facebook.com/");
		//create button
		WebElement Create = d.findElement(By.xpath("//span[text()='Create new account']"));
		//create button location
		Point CreateLoc = Create.getLocation();
		System.out.println("Create button Location : "+CreateLoc);
		System.out.println("-----------DOM Attribute ANd DOM property Before Entering Email------");
		//Email Field
		WebElement EmailField = d.findElement(By.xpath("//input[@id='_R_1h6kqsqppb6amH1_']"));
		System.out.println(EmailField.getDomAttribute("value"));
		System.out.println(EmailField.getDomProperty("value"));
		//Passing Emailid to EmailField
		Thread.sleep(3000);
		EmailField.sendKeys("rohan@gmail.com");
		System.out.println("-----------DOM Attribute ANd DOM property After Entering Email------");
		System.out.println(EmailField.getDomAttribute("value"));
		System.out.println(EmailField.getDomProperty("value"));
		//To click on create account button
		Create.click();
		Thread.sleep(2000);
		//submit button size
		WebElement submit = d.findElement(By.xpath("//span[text()='Submit']/ancestor::div[@class='x3nfvp2 x1n2onr6 xh8yej3']"));
		System.out.println("Size of submit button : "+submit.getSize());
		//submit button css property
		System.out.println("------------------Css Property of Submit button-----------");
		System.out.println("Font family is : "+submit.getCssValue("font-family"));
		System.out.println("Display is : "+submit.getCssValue("display"));
		System.out.println("Position is : "+submit.getCssValue("position"));
		System.out.println("Width is : "+submit.getCssValue("width"));
		Thread.sleep(3000);
		d.quit();
	}

}
