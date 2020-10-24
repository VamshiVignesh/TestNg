package org.actions;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Manju\\Selenium\\AllTask\\Day5\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/index.html");
	driver.manage().window().maximize();
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	
	File src=tk.getScreenshotAs(OutputType.FILE);
	
	System.out.println(src);
}
}
