package capgeminiAssignmentsOnSelenium.Day9;

public class SauseKeywords {
	public static void main(String[] args) throws InterruptedException {
		sauseKeywordExecutors e = new sauseKeywordExecutors();
		e.executors("LAUNCH_BROWSER");
		Thread.sleep(1000);
		e.executors("OPEN_URL");
		Thread.sleep(1000);
		e.executors("USER_NAME");
		Thread.sleep(1000);
		e.executors("PASSWORD");
		Thread.sleep(1000);
		e.executors("LOGIN_BUTTON");
		Thread.sleep(3000);
		e.executors("CLOSE_BROWSER");
	}

}
