package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Setting Browser Driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Targeted Application
		driver.get("https://www.saucedemo.com");
		
		//********************Login Testing
		
		//For login - User Name input
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		//For login - Password input
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		//For login - Click Login
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		//********************Add to Cart Testing
		
		//Choosing item for Add to Cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(2000);
		
		//Navigating to Cart Processing Page
		driver.navigate().to("https://www.saucedemo.com/cart.html");
		
		//Order Confirmation
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		
		//Filling personal details to Confirm Order
		driver.findElement(By.id("first-name")).sendKeys("S M Asif Hossain");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("Ruksat Khan Shayoni");
		Thread.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("1215");
		Thread.sleep(2000);
		
		//Order Confirmation Button hitting
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		
		//Closing the Driver
		Thread.sleep(2000);
		driver.close();

	}

}
