package com.sel.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoPrac {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/Jenish/Desktop/MySELENIUMFiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		WebElement signup = driver.findElement(By.xpath("//a[@class='login']"));
		signup.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("jenish@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='passwd']"));
		pass.sendKeys("Qwerty123");

		WebElement signin = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		signin.click();

		Actions ac = new Actions(driver);
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		ac.moveToElement(women).build().perform();
		
		WebElement tshirt = driver.findElement(By.xpath("//a[@title='T-shirts']"));
		tshirt.click();

		WebElement quickview = driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']"));
		quickview.click();
		
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame);
		
		WebElement addtocart = driver.findElement(By.xpath("//p[@id='add_to_cart']"));
		addtocart.click();
		
		
		
		
		
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkout.click();
		
		
		
		
		
		
		WebElement check = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		check.click();

		WebElement process = driver.findElement(By.xpath("//button[@name='processAddress']"));
		process.click();

		WebElement carrier = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		carrier.click();

		WebElement box = driver.findElement(By.xpath("//input[@name='cgv']"));
		box.click();

		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		payment.click();
		

		WebElement confirm = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		confirm.click();
		
	}
}
