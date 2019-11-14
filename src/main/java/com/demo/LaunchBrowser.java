package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\browser Exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
	}

}
