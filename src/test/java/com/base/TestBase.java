package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.exception.BrowserNotSupportedException;

public class TestBase {
	
	public static WebDriver driver;
	Properties prop;
	String browser;
	
	public TestBase()
	{
		prop=new Properties();
		try {
			prop.load(new FileInputStream("config//config.properties"));
			browser=prop.getProperty("browser");
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
				driver=new ChromeDriver();
			}
			
			else if(browser.equalsIgnoreCase("ff"))
			{
				System.setProperty("webdriver.gecko.driver", "driver//geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			else if(browser.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver", "driver//IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			
			}
			else
			{
				throw new BrowserNotSupportedException("Application does not support "+browser);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrowserNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void init()
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

}
