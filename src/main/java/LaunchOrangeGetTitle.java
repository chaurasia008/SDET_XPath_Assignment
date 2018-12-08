import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchOrangeGetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");	
		
        WebDriver driver = new ChromeDriver();
		
		String baseurl = "https://opensource-demo.orangehrmlive.com/";
		
		driver.get(baseurl);

		String ttl = driver.getTitle();

		System.out.println("Title: "+ttl);
		
		
		driver.quit();
	}
}
