package week1.day3;

public class Browser {
	public String launchBrowser(String browserName) {
		return browserName;
	}
	public void launchBrowser1(String browserName) {
		System.out.println("Browser Launched Successfully");
	}
	
	public void loadUrl() {
		System.out.println("Application URL loaded successfully");
		
	}
	
	public static void main(String[] args) {
		Browser browserInfo = new Browser();
		System.out.println(browserInfo.launchBrowser("Chrome"));
		browserInfo.loadUrl();
		

	}

}
