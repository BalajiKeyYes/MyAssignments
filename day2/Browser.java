package week1.day2;

public class Browser {

	private String launchBrowser(String browserName) {

		System.out.println("Browser launched successfully");
		return browserName;
	}

	private void loadUrl() {
		System.out.println("Application url loaded successfully");

	}

	private void EdgeBrowser() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String app = null;
		Browser browserType = new Browser();
		browserType.launchBrowser(app);
		browserType.loadUrl();
		browserType.EdgeBrowser();
	}

}
