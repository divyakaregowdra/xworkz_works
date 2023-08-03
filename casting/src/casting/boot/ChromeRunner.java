package casting.boot;

import casting.app.Browser;
import casting.app.Chrome;
import casting.app.Firefox;
import casting.app.util.BrowserUtil;

public class ChromeRunner {
	public static void main(String[] args) {
		Browser browser=new Browser();
		System.out.println("browser.browserUsedFor");
		Chrome chrome=new Chrome();
		System.out.println(chrome.shape);
		Firefox firefox=new Firefox();
		System.out.println("firefox.fireFoxVersion");
		
		BrowserUtil browserUtil=new BrowserUtil();
	
		browserUtil.browserUtil(browser);
		browserUtil.browserUtil(chrome);
		browserUtil.browserUtil(firefox);

		
		
		
	}

}
