package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Status {

	private static final String ZCJjpVNEDwA016Fb_PM0A = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://www.fb.com");
		driver.navigate().to("https://www.fb.com/");
	    WebElement em=driver.findElement(By.xpath("//*[@id='email']"));
	    System.out.println(em.isDisplayed());
	    System.out.println(em.isEnabled());
	    em.sendKeys("saugat");
	    Thread.sleep(2000);
	    em.clear();
	    em.sendKeys("paudel");
		
		

	}

}
