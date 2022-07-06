 package com.sel.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoPracLogin{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/Jenish/Desktop/MySELENIUMFiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement signup = driver.findElement(By.xpath("//a[@class='login']"));
		signup.click();
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("//input[@name='email_create']"));
		email.sendKeys("jenish@gmail.com");
		WebElement create = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		create.click();
		Thread.sleep(1000);
		WebElement mr = driver.findElement(By.xpath("//input[@value='1']"));
		mr.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		firstname.sendKeys("Jenish");
		WebElement surname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		surname.sendKeys("Vijayakumar");
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Qwerty123");
		WebElement day = driver.findElement(By.id("days"));
		Select s = new Select(day);
		s.selectByValue("24");
		WebElement month = driver.findElement(By.name("months"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("October ");
		WebElement year = driver.findElement(By.id("years"));
		Select s2 = new Select(year);
		s2.selectByIndex(26);
		WebElement fname = driver.findElement(By.xpath("//input[@id='firstname']"));
		fname.sendKeys("Jenish");
		WebElement sname = driver.findElement(By.xpath("//input[@id='lastname']"));
		sname.sendKeys("Vijayakumar");
		WebElement ad = driver.findElement(By.xpath("//input[@id='address1']"));
		ad.sendKeys("22 chipping house road");
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("sheffield");
		WebElement state = driver.findElement(By.name("id_state"));
		Select s3 = new Select(state);
		s3.selectByVisibleText("Alabama");
		WebElement postcode = driver.findElement(By.xpath("//input[@name='postcode']"));
		postcode.sendKeys("00000");
		WebElement ph = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		ph.sendKeys("07459331463");
		WebElement alias = driver.findElement(By.xpath("//input[@name='alias']"));
		alias.sendKeys("commercialstreet");
		WebElement register = driver.findElement(By.xpath("//button[@name='submitAccount']"));
		register.click();
}
}
