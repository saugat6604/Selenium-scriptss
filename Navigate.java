package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://www.fb.com");
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.linkText("फोटो")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("you are back");
		
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println("you are forwrd");
		
		driver.navigate().refresh();
		System.out.println("refreshed"); 
		//*[@id="V2UIWKGQUiMOs_F_f_7qGA"]/a/div/img
		
	}

}
