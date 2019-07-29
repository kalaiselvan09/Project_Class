package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4getText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Day1\\SeleniumPrograms\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		//size of the window
		Dimension d=new Dimension(500,500);
		driver.manage().window().setSize(d);
		
		//position of the window
		Point p=new Point(250,250);
		driver.manage().window().setPosition(p);
			
		
		//wait for 3000 sec 
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
