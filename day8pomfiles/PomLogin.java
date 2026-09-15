package capgeminiAssignmentsOnSelenium.day8pomfiles;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogin {
	WebDriver driver;
	public PomLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//username
	@FindBy(xpath = "//input[@name=\"username\"]")
	private WebElement un;
	//password
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement pwd;
	//login button
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement lgbutton;
	//recuterlink
	@FindBy(xpath = "//span[text()='Recruitment']")
	private WebElement recruitmrnt;
	//addbutton
	@FindBy(xpath = "(//button[@type=\"button\"])[5]")
	private WebElement addbutton;
	//firstname
	@FindBy(xpath = "//input[@name=\"firstName\"]")
	private WebElement fname;
	//middlename
	@FindBy(xpath = "//input[@name=\"middleName\"]")
	private WebElement mname;
	//lastname
	@FindBy(xpath = "//input[@name=\"lastName\"]")
	private WebElement lname;
	//email
	@FindBy(xpath = "(//input[@placeholder=\"Type here\"])[1]")
	private WebElement email;
	//phonen
	@FindBy(xpath = "(//input[@placeholder=\"Type here\"])[2]")
	private WebElement phno;
	//vacnacy
	@FindBy(xpath = "//div[@class=\"oxd-select-text--after\"]")
	private WebElement vacancy;
	//resume
	@FindBy(xpath = "//input[@type=\"file\"]")
	private WebElement resume;
	//calender
	@FindBy(xpath = "//input[@placeholder=\"yyyy-dd-mm\"]")
	private WebElement calender;
	//submit
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement save;
	
	
	public void getSave() {
		save.click();
	}
	public WebElement getCalender() {
		return calender;
	}
	public void getCalender(String value) {
		calender.sendKeys(value);
	}
	public void getResume(String value) {
		resume.sendKeys(value);
	}
	public WebElement getVacancy() {
		return vacancy;
	}
	public void getRecruitmrnt() {
		recruitmrnt.click();
	}
	public void getAddbutton() {
		addbutton.click();
	}
	public void getLgbutton() {
		lgbutton.click();
	}
	public void getUn(String value) {
		un.sendKeys(value);
	}
	public void getPwd(String value) {
		pwd.sendKeys(value);
	}
	public void getFname(String value) {
		fname.sendKeys(value);;
	}
	public void getMname(String value) {
		mname.sendKeys(value);;
	}
	public void getLname(String value) {
		lname.sendKeys(value);;
	}
	public void getEmail(String value) {
		email.sendKeys(value);;
	}
	public void getPhno(String value) {
		phno.sendKeys(value);;
	}

}
