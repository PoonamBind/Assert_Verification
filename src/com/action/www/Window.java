package com.action.www;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.co.in/");
		WebElement link = driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		
		Actions newwin = new Actions(driver);
		newwin.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(6000);
		
		Set<String> windows = driver.getWindowHandles();
		Collection<String> count = driver.getWindowHandles();
		System.out.println(count);
		System.out.println("Alphanumeric code of windows" + windows);
		for(String string:driver.getWindowHandles()){
			driver.switchTo().window(string);
			System.out.println("switch to next window"+string);
		}
		
		String message = driver.findElement(By.cssSelector("body > main > section > div.hero_home__wrap.ng-isolate-scope > div.hero_home__copy > h1")).getText();
		System.out.println("New Window");
		System.err.println(message);
	
		}

}
