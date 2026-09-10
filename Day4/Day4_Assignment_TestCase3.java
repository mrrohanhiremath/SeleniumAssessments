package capgeminiAssignmentsOnSelenium.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day4_Assignment_TestCase3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.bigbasket.com/pb/boss/");
		Thread.sleep(3000);
		//find search button
		WebElement search = d.findElement(By.xpath("(//input[@type=\"text\"and @placeholder=\"Search for Products...\"])[2]"));
		Thread.sleep(2000);
		//send item name in search
		search.sendKeys("apple",Keys.ENTER);
		Thread.sleep(3000);
		//find add cart
		WebElement cart = d.findElement(By.xpath("//h3[normalize-space(text())='Apple - Royal Gala Economy']/../../../..//button[@pattern=\"outline\"]"));
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(cart));
		//scroll
		WebElement nextele = d.findElement(By.xpath("//h3[normalize-space()='Apple - Red Delicious']"));
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView(false)",nextele);
		//click on cart
		cart.click();
		//verification
		WebElement pop = d.findElement(By.xpath("//p[normalize-space()='An item has been added to your basket successfully']"));
		String text = pop.getText();
		System.out.println(text);
		if(text.contains("An item has been added to your basket successfully")) {
			System.out.println("item is added to basket");
		}
		else {
			System.out.println("item is not added to basket");
		}
		Thread.sleep(3000);
		d.quit();
	}


}
