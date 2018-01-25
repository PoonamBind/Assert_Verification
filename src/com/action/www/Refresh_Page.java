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

public class Refresh_Page {

	public static void main(String[] args) {
		

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.navigate().to("https://www.google.co.in");
			WebElement webelement  = driver.findElement(By.cssSelector("#lst-ib"));
			Actions action = new Actions(driver);
			Actions multiaction = action.moveToElement(webelement)
					.click()
					.keyDown(webelement,Keys.SHIFT)
					.sendKeys(webelement,"world largest mountain")
					.keyUp(webelement,Keys.SHIFT);
			/*Actions builder =new Actions(driver);
			builder.sendKeys(Keys.chord(Keys.F5)).perform();
			 */			
			Action enterIncaps = multiaction.build();
			enterIncaps.perform();
			action.moveToElement(webelement).sendKeys(Keys.F5).perform();
			
			System.out.println("Refresh is done");

	}

}
