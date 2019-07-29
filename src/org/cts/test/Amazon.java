package org.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Day1\\SeleniumPrograms\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		List<WebElement> li = driver.findElements(By.xpath("//span[contains(text(),'4GB')]"));
		List<WebElement> li1=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (int i = 0; i < li.size(); i++) {
			
			String text = li.get(i).getText();
			if(text.equals("Honor 8C (Blue, 4GB RAM, 32GB Storage)"))
				
			{
				li.get(i).click();
			}
			
			System.out.println(text);
			for(int j=i;j<i+1;j++)
			{
				
				String text2 = li1.get(j).getText();
				System.out.println(text2);
			}
		}
	}
}
