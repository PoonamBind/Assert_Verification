package com.iframe.www;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_Example {

	public static void main(String[] args) {
		WebDriver driver = null;
		try{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			driver.navigate().to("http://toolsqa.com/iframe-practice-page/");
			WebElement iframe = driver.findElement(By.cssSelector("#IF2"));
			driver.switchTo().frame(iframe);
			String msg = driver.findElement(By.cssSelector("#post-9 > div > div:nth-child(1) > h5")).getText();
			System.out.print(msg);//iframe message printed
			
			Assert.assertEquals("Unique & Clean", msg);
			System.out.println("\nResult passed");
			//Switch to main website
			driver.switchTo().defaultContent();
			String msg2 = driver.findElement(By.cssSelector("#primary-menu > li.menu-item.menu-item-type-custom.menu-item-object-custom.menu-item-has-children.menu-item-25855.has-children > a")).getText();//main website any content css selector 
			System.out.println("move to main website  "+msg2);
		}
		catch(Exception e){
			
		}
		finally {
			if(driver!=null)
			driver.close();	
		}
		
		
	}

}
