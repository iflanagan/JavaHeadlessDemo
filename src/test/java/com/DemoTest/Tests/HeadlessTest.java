package com.DemoTest.Tests;

import com.DemoTest.Pages.WebDemoPage;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.URL;


import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;


public class HeadlessTest {

public static final String USERNAME = "<sauce_username>";
public static final String ACCESS_KEY = "<sauce_access_key>";
public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.us-east-1.saucelabs.com/wd/hub"; // ondemand.us-east-1.saucelabs.com/wd/hub
//public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@@ondemand.saucelabs.com:443/wd/hub"; 
public static final String value = "Banking Services: Checking, Savings, Mortgage | Regions";

public static void main(String[] args) throws Exception {

  DesiredCapabilities caps = DesiredCapabilities.chrome();
  caps.setCapability("platform", "Linux");
  caps.setCapability("browser", "chrome");
  caps.setCapability("version", "latest");

  WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
 

  driver.get("https://www.regions.com/");
  //System.out.println("title of page is: " + driver.getTitle());
  
  String currenttile = driver.getTitle();
  
  System.out.println("Current Title is: " +currenttile);
  
 
  if (currenttile.equals(value))
  {
	  
	  System.out.println("title test passed");
  }
  else
  {
	  
	  System.out.println("title test failed");
	  
  }
 

  driver.quit();
}
}
