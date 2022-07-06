package com.sel.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotelApp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/Users/Jenish/Desktop/MySELENIUMFiles/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	
	WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	username.sendKeys("jennnnnn");
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("qwerty");
	WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
	login.click();
	
	WebElement location = driver.findElement(By.name("location"));
	Select s = new Select(location);
	s.selectByVisibleText("London");
	
	WebElement Noofrooms = driver.findElement(By.name("room_nos"));
	Select s1 = new Select(Noofrooms);
	s1.selectByVisibleText("2 - Two");
	
	WebElement CheckIn = driver.findElement(By.name("datepick_in"));
	CheckIn.sendKeys("03/10/2021");
	
	WebElement CheckOut = driver.findElement(By.name("datepick_out"));
	CheckOut.sendKeys("04/10/2021");
	
	WebElement Adult = driver.findElement(By.name("adult_room"));
	Select s4 = new Select(Adult);
	s4.selectByVisibleText("2 - Two");
	
	WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
	submit.click();
	
	WebElement select = driver.findElement(By.xpath("//input[@name='radiobutton_1']"));
	select.click();
	
	WebElement sub = driver.findElement(By.xpath("//input[@type='submit']"));
	sub.click();
	
	WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
	fname.sendKeys("Jenish");
	WebElement sname = driver.findElement(By.xpath("//input[@name='last_name']"));
	sname.sendKeys("Vijayakumar");
	WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
	address.sendKeys("No.429, SIS Danube, Jeyachandran Nagar, pallikaranai, Chennai=600100");
	WebElement cc = driver.findElement(By.xpath("//input[@name='cc_num']"));
	cc.sendKeys("1234123412341234");
	
	WebElement card = driver.findElement(By.name("cc_type"));
	Select s5 = new Select(card);
	s5.selectByVisibleText("VISA");
	
	WebElement expmonth = driver.findElement(By.name("cc_exp_month"));
	Select s6 = new Select(expmonth);
	s6.selectByVisibleText("October");
	
	WebElement expyear = driver.findElement(By.name("cc_exp_year"));
	Select s7 = new Select(expyear);
	s7.selectByIndex(12);
	
	WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	cvv.sendKeys("789");
	
	WebElement book = driver.findElement(By.xpath("//input[@type='button']"));
	book.click();

	
}
}
