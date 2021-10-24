package com.edu.Git_Project_For_GitHub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Lauching Browser");
		
	}
	
	@Test
	public void doLogin()
	{
		System.out.println("Executing Login Test");
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("vairajp@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("abcd");
		driver.findElement(By.name("login")).click();
		System.out.println("Logging into facebook account");
	}
	
	@AfterTest
	public void QuitDriver()
	{
		if(driver!=null)
		{
			driver.close();
		}
	}

}
