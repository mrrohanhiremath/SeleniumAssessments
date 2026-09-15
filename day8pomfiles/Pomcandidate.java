package capgeminiAssignmentsOnSelenium.day8pomfiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomcandidate {
	WebDriver driver;
	public Pomcandidate(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//cabdidatelink
	@FindBy(xpath = "//a[text()='Candidates']")
	private WebElement candidate;
	
	public void getCandidate() {
		candidate.click();
	}
	//jobtitle
	@FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[1]")
	private WebElement jobtitle;
	public void getJobtitle(){
		jobtitle.click();
	}
	@FindBy(xpath = "//span[text()='Chief Executive Officer']")
	private WebElement ceo;
	public void getCeo() {
		ceo.click();
	}
	
	//vacancy
	@FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[2]")
	private WebElement cvacancy;
	public void getCvacancy() {
		cvacancy.click();
	}
	@FindBy(xpath = "//div[@role='option']//span[normalize-space()='Payroll Administrator']")
	private WebElement jaa;
	public void getJaa() {
		jaa.click();
	}
	//hiring manager
	@FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[3]")
	private WebElement manager;
	public void getManager() {
		manager.click();
	}
	//hrmgr
	@FindBy(xpath = "//div[@role='option']//span[normalize-space()='manda user']")
	private WebElement hrmgr;
	
	public void getHrmgr() {
		hrmgr.click();
	}
	//status
	@FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[4]")
	private WebElement status;
	public void getStatus() {
		status.click();
	}
	@FindBy(xpath = "//div[@role='option']//span[normalize-space()='Shortlisted']")
	private WebElement st;
	public void getSt() {
		st.click();;
	}
	//candidatename
	@FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
	private WebElement candidatename;
	public void getCandidatename(String value) {
		candidatename.sendKeys(value);
	}
	//from dATE
	@FindBy(xpath = "//input[@placeholder=\"From\"]")
	private WebElement from;
	//to
	@FindBy(xpath = "//input[@placeholder=\"To\"]")
	private WebElement to;
	public void getFrom(String value) {
		from.sendKeys(value);;
	}
	public void getTo(String value) {
		to.sendKeys(value);;
	}
	//submit
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement submit;
	public void getSubmit() {
		submit.click();;
	}
	//verify
	@FindBy(xpath = "//div[contains(text(),'rohan p hiremath')]")
	private WebElement records;
	public WebElement getRecords() {
		return records;
	}
	
	
	
	
	

}
