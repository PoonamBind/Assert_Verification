package com.iframe.www;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe_Example_2 {

	public static void main(String[] args) throws InterruptedException {
		// hold and release 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\chromedriver.exe");
			WebDriver	driver=new ChromeDriver();
			driver.navigate().to("http://google.com");
			Thread.sleep(2000);
			Actions oaction = new Actions(driver);
			oaction.sendKeys(Keys.F5).perform();
			WebElement element = driver.findElement(By.cssSelector("#gbwa > div.gb_Mc > a"));
			Actions oaction1 = new Actions(driver);
			oaction.clickAndHold(element).release().build().perform();
			System.out.println("\nResult passed");
		
		

	}

}
