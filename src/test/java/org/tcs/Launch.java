package org.tcs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.runtime.Timeout;
import junit.framework.Assert;

public class Launch {
	static WebDriver driver;

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hema Ekambaram\\eclipse-workspace\\Cucumber2\\Driver\\chromedriver.exe");
		new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		// 1
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[1]")).click();

		driver.findElement(By.id("email")).sendKeys("Hema");

		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Append" + "Meena");

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_TAB);

		WebElement defaulttxt = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
		String string = defaulttxt.getAttribute("value");
		System.out.println(string);

		driver.findElement(By.name("username")).clear();

		WebElement edit = driver.findElement(By.xpath("(//input[@type=\"text\"])[5]"));

		// 2

	}

}
