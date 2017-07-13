package com.demo.program;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenGmail {
@Test
	public void gmailTest()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
	}

}
