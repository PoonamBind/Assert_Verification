package com.action.www;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1 {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		try{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
			//WebElement drag = driver.findElement(By.cssSelector("#draggable"));
			//WebElement drop = driver.findElement(By.cssSelector("#droppable"));
			WebElement drag = driver.findElement(By.xpath(".//*[@id='draggable'] "));
			WebElement drop = driver.findElement(By.xpath(".//*[@id='droppable'] "));
			Actions action = new Actions(driver);
			action.dragAndDrop(drag, drop).perform();
			System.out.println("Action performed  ");
		}
		catch(Exception e){
			
		}
		finally {
			/*if(driver!=null)
			driver.close();	
*/		}
		
		
	}

}
