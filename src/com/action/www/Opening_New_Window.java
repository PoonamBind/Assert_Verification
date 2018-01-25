package com.action.www;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Opening_New_Window {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.co.in/");
		
		//WebElement element  = driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		//Actions action = new Actions(driver);
		//Actions multiaction = action.keyDown(element,Keys.COMMAND).click();
	/*	Actions multiaction = action.moveToElement(element).contextClick(element).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER);
		Action enterIncaps = multiaction.build();
		enterIncaps.perform();
	*/
		/*WebElement link = driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		Actions newwin = new Actions(driver);
		newwin.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(6000);
		*/
		
	/*	//identify the link in the page, that you want to open in a new tab of your browser's instance
//		WebElement link = driver.findElement(By.cssSelector(linkLocator));
		WebElement link  = driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		//this action will click the WebElement with the link identified above, hold CONTROL Key (or COMMAND if you're using Mac), click the WebElement and relese the Keys.CONTROL (use Keys.COMMAND if you're using Mac).
		new Actions(driver).keyDown(Keys.COMMAND).click(link).keyUp(Keys.COMMAND).build().perform();
*/
		
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).sendKeys(selectLinkOpeninNewTab);
		
		/*Set<String> windows = driver.getWindowHandles();
		Collection<String> count = driver.getWindowHandles();
		System.out.println(count);
		System.out.println("Alphanumeric code of windows" + windows);
		for(String string:driver.getWindowHandles()){
			driver.switchTo().window(string);
			System.out.println("switch to next window"+string);
		}
*/
	}

}
