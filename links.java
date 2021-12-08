package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.fb.com");
		//driver.findElement(By.linkText("Create a Page")).click();
		// driver.findElement(By.partialLinkText("Create a")).click();
        //driver.close(); // parent window
        //driver.quit();// parent and child window
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("well");
	}

}

