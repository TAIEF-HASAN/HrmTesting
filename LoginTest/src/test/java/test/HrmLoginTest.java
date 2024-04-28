package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://120.50.27.34:801/");
		
		driver.findElement(By.name("userName")).sendKeys("Taief");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
