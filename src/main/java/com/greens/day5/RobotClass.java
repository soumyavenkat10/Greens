package com.greens.day5;

import javax.sound.midi.SysexMessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\chromedriver.exe");
	WebDriver driver=new  ChromeDriver();
	
	driver.get("https://www.google.com/");
	WebElement gmailbtn = driver.findElement(By.xpath("//a[text()='Gmail']"));
}
}
