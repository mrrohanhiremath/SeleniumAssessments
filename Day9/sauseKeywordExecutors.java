package capgeminiAssignmentsOnSelenium.Day9;

public class sauseKeywordExecutors {
	SauceKeywordImplementation s = new SauceKeywordImplementation();
	public void executors(String keyword) {
		if(keyword.equals("LAUNCH_BROWSER")) {
			s.launchbrowser();
		}
		//open
		else if(keyword.equals("OPEN_URL")) {
			s.openbrowser();
		}
		//username
		else if(keyword.equals("USER_NAME")) {
			s.username();
		}
		//password
		else if(keyword.equals("PASSWORD")) {
			s.password();
		}
		//login
		else if(keyword.equals("LOGIN_BUTTON")) {
			s.loginbtn();
		}
		//close browser
		else if(keyword.equals("CLOSE_BROWSER")) {
			s.closebrowser();
		}
		
	}

}
