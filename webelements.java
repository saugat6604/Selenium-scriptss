package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.fb.com");
		String title =driver.getTitle();
		System.out.println("title is"+""+title);
		String current =driver.getCurrentUrl();
		System.out.println("title is"+""+current);
		WebElement Urum=driver.findElement(By.id("email"));
		System.out.println(Urum.getAttribute("id"));
		System.out.println(Urum.getTagName());
		driver.close();

	}

}
