package capgeminiAssignmentsOnSelenium.Day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Day2_Assignment_Testcase3 {
	private static final String Outtype = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d =new ChromeDriver ();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//navigate to demoWebShop
		d.get("https://demowebshop.tricentis.com/");
		WebElement addCart = d.findElement(By.xpath("//a[normalize-space(text())='14.1-inch Laptop']/ancestor::div[@class='product-item']/descendant::div[@class='buttons']"));
		
		//get size of addcart button
		System.out.println("Size of add cart button : "+addCart.getSize());
		Thread.sleep(3000);
		//click on add cart
		addCart.click();
		Thread.sleep(6000);
		
		// going to shopping cart link
		WebElement cartLink = d.findElement(By.xpath("//span[text()='Shopping cart']"));
		cartLink.click();
		
		//To check weather radiobutton is selected or not
		WebElement rb = d.findElement(By.xpath("//input[@type=\"checkbox\"and@name=\"removefromcart\"]"));
		System.out.println("Checking the status of CheckBox : "+rb.isSelected());
		//Radio button rect details
		System.out.println("----------Rect details---------");
		System.out.println("X value : "+rb.getRect().getX());
		System.out.println("y value : "+rb.getRect().getY());
		System.out.println("Height : "+rb.getRect().getHeight());
		System.out.println("Width : " +rb.getRect().getWidth());
		
		
		System.out.println("------------Before clicking on add coupon--------");
		//verify alert message is displayed before clicking on add coupon
		try {
			WebElement msg = d.findElement(By.xpath("//div[@class='message']"));
			
		}catch(NoSuchElementException e){
			System.out.println("alert messege is not displayed");
		}
		
		
		System.out.println("----------After clicking on add coupon-------");
		//click on add coupon
		WebElement addcoupon = d.findElement(By.xpath("//input[@type='submit'and@class='button-2 apply-discount-coupon-code-button']"));
		Thread.sleep(3000);
		addcoupon.click();
		//verify alert message is displayed or not
		WebElement msg = d.findElement(By.xpath("//div[@class='message']"));
		System.out.println("Is displayed : "+msg.isDisplayed());
		
		//Take Screenshot of webElement
		WebElement img = d.findElement(By.xpath("(//img[@title=\"Show details for 14.1-inch Laptop\"])[2]"));
		File src = img.getScreenshotAs(OutputType.FILE);
		File dest = new File(".//Ss/laptop.png");
		FileHandler.copy(src, dest);
		System.out.println("---------------Took screenshot---------------");
		Thread.sleep(3000);
		d.quit();
	}

}
