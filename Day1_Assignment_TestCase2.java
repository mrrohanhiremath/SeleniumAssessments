package capgeminiAssignmentsOnSelenium;

import java.time.Duration;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Assignment_TestCase2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.myntra.com/");
		//finding searchbar
		WebElement searchBar = d.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		Thread.sleep(3000);
		//send item name
		searchBar.sendKeys("Exotica perfume",Keys.ENTER);
		//products's wishlist
		WebElement product = d.findElement(By.xpath("(//h4[text()=\"Exotica Gold Eau De Parfum\"]/../../..)//span[@class=\"product-wishlistFlex product-actionsButton product-wishlist \"]"));
		//complete product id
		WebElement p = d.findElement(By.xpath("//li[@id=\"22732618\"]"));
		String pid=p.getDomProperty("id");
		Thread.sleep(3000);
		//click on product wishlist product will go to wishlist 
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].click()",product);
		Thread.sleep(80000);
		//find wishlist
		WebElement wishlist = d.findElement(By.xpath("//span[text()=\"Wishlist\"]"));
		wishlist.click();
		//find out added product n take id of that product
		WebElement wish = d.findElement(By.xpath("//a[@target=\"_blank\"]"));
		String wishid = wish.getDomProperty("pathname");
		//comapre both id
		System.out.println(wishid);
		System.out.println(pid);
		if(wishid.contains(pid)) {
			System.out.println("product is added to wishlist");
		}
		else {
			System.out.println("product is not added");
		}
	}
}
