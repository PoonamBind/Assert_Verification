package com.abc.www;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Assert_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CAPTAIN\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://calculator.net");
		WebElement result = driver.findElement(By.xpath(".//*[@id='hl2']/li[7]/a"));
		System.out.println(result);
		Assert.assertEquals("Carbohydrate Calculator", result.getText());

		System.out.println("Result passed");
		
		System.out.println(driver.getTitle());
		Assert.assertEquals("Calculator.net: Free Online Calculators - Math, Health, Financial, Science", driver.getTitle());
		System.out.println("Result Passed");
	}	
}
