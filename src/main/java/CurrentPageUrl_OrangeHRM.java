import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentPageUrl_OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");	
		
        WebDriver driver = new ChromeDriver();
		
		String baseurl = "https://opensource-demo.orangehrmlive.com/";
		
		driver.get(baseurl);
		
		  //enter a valid login user name
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    //enter a valid login password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//click on login button
		driver.findElement(By.id("btnLogin")).click();
		
		
       //get current page url
		String url = driver.getCurrentUrl();

		System.out.println("Current page url : "+url);
		
		
		driver.quit();

	}

}
