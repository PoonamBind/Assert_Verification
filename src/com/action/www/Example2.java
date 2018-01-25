package com.action.www;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Example2 {

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.navigate().to("https://www.google.co.in/");
			WebElement searchbox  = driver.findElement(By.cssSelector("#lst-ib"));
			Actions action = new Actions(driver);
		 	Actions multiaction = action.moveToElement(searchbox).keyDown(searchbox,Keys.SHIFT).sendKeys(searchbox,"india");
			Action enterIncaps = multiaction.build();
			enterIncaps.perform();
			System.out.println("Action performed result is printed  ");
			
	}

}
