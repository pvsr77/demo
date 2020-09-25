package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		WebDriver driver  = null;
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
		
		   driver = new ChromeDriver();
			
	       driver.get("http://www.amazon.in");
		
	       driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("oppo mobile phone under 10000");
	       
	       driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	
	
	
	
	}

}
