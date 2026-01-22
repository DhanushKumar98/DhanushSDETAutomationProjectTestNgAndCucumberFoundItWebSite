package com.roughtWorkOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Base.BaseClass;

public class FounditWorkOutSelenium extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/rio/sign-out");
		WebElement clickonPassowrd = driver.findElement(By.xpath("//div[@class='loginWith']"));
		//explicitWaitElementToBeClickable(clickonPassowrd, 10);
		clickonPassowrd.click();
		driver.findElement(By.cssSelector("#signInName")).sendKeys("dhanushkumark.n1998@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Sachin@1998");
		
		
		
		driver.findElement(By.cssSelector("#signInbtn")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".profile_avatar.relative.flex.items-center.justify-center.rounded-full.bg-white")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='View Profile']")).click();
		
		
		
		
	}

}
