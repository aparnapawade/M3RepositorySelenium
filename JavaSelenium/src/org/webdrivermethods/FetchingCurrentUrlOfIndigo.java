package org.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingCurrentUrlOfIndigo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/?utm_source=google&utm_medium=cpc&utm_campaign=search_campaign_brand_domestic_google_bau_upto15off_15Nov2024&cid=Search|Brand|P|Domestic|Google_BAU|UpTo15Off|15Nov2024|280704506&s_kwcid=AL!12293!3!724379120331!b!!g!!indigo&gad_source=1&gclid=EAIaIQobChMIrv6I9MacigMVFtgWBR1KHCkQEAAYASAAEgIxXvD_BwE");
        String url = driver.getCurrentUrl();
        System.out.println(url);
	}

}
