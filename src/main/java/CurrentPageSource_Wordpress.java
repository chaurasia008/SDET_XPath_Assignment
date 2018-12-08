import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentPageSource_Wordpress {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");	
		
        WebDriver driver = new ChromeDriver();
		
		String baseurl = "http://demosite.center/wordpress/wp-login.php";
		
		driver.get(baseurl);
		
		  //enter a valid login user name
	    driver.findElement(By.id("user_login")).sendKeys("Admin");
	    //enter a valid login password
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		//click on login button
		driver.findElement(By.id("wp-submit")).click();
		
		
       //get current page source
		String ttl = driver.getPageSource();

		System.out.println("Page Source: "+ttl);
		
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		
		driver.quit();

	}
}
