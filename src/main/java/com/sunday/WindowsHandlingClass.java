package com.sunday;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingClass {

	public static void main(String[] args) {
		// driver.switchTo().window(String url)
		// driver.switchTo().window(String title)
		// driver.switchTo().window(String windowsId)
		//to get the parent window we need to use the method getWindowHandle()

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\SeleniumTask\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		WebElement close = driver.findElement(By.className("popupCloseButton"));
		close.click();
		WebElement loginbtn = driver.findElement(By.id("loginsubmit"));
		loginbtn.click();
		String pid = driver.getWindowHandle();
		System.out.println(pid);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String v : windowHandles) {
			
			if(!pid.equals(v)) {
				driver.switchTo().window(v);
			}
			
		}
		WebElement ch = driver.findElement(By.xpath("//a[text()='Continue to NetBanking'][1]"));
		ch.click();
	}

}
