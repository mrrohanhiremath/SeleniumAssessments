package capgeminiAssignmentsOnSelenium.Day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_Assignment_TestCase1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.facebook.com");
		//textfields
		List<WebElement> text = d.findElements(By.tagName("input"));
		System.out.println(text.size());
		for(WebElement ele : text) {
			System.out.println(ele.getText());
			System.out.println(ele.getSize());
		}
		Thread.sleep(3000);
		d.quit();
	}

}
