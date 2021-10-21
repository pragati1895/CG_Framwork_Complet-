package com.cg.NotaFramworkPart;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	WebDriver driver;
	public  void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PLENDGHA\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	public void Failed() throws IOException {
	File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File f2= new File("C:/AutomationSelenium/Screenshot/FailScreenshot/pragati.jpg");
	
	FileUtils.copyFile(f1, f2);
		
	}
	}

