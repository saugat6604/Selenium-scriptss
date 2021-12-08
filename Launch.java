package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://www.fb.com");
		WebElement Urum= driver.findElement(By.id("email"));
		Urum.sendKeys("saugatpaudel.com");
		
		driver.findElement(By.name("pass")).sendKeys("test");
		driver.findElement(By.name("login")).click();
	}

}

