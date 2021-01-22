package com.sele.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginage {
	@Test
	public void log() {
		System.getProperty("webdriver.chrome.driver", "//Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 driver.close();  
	
	}

}
