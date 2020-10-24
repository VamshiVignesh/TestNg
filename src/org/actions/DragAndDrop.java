package org.actions;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Manju\\Selenium\\AllTask\\Day5\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.homedepot.com/c/site_map");
	driver.manage().window().maximize();
	
	WebElement all=driver.findElement(By.xpath("//a[text()='All Departments']"));
	Actions a=new Actions(driver);
	a.moveToElement(all).perform();
	driver.findElement(By.xpath("//a[@title=\"Heating & Cooling\"]")).click();
	
	driver.findElement(By.xpath("//a[text()='Air Conditioners']")).click();
	
	driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']")).click();
	
	
}
}
