package SeleniumSession;

public class ultaBeautyTest {

	public static void main(String[] args) {
		//String browserName = "Chrome";
		
		//by creating object we can access all the methods in browserutil class
		BrowserUtil ulta = new BrowserUtil();
		ulta.initalizeDriver("Chrome");
		ulta.lunchUrl("https://ulta.com");
		
		
		String purl = ulta.getPageUrl();
		if( purl.contains(" ulta Beauty")) {
			System.out.println("The url is right");
		}
		else {
			System.out.println("This url is not right");
		}
		ulta.gettitle();
		ulta.closeBrowser();
		}
		

}
