package com.DemoTest.Tests;

import com.DemoTest.Pages.WebDemoPage;

//import org.json.JSONObject;
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
  public static final String value = "Google";

  public static void main(String[] args) throws Exception {


  System.out.println("\nStarting Headless Automation Script.....");

  /*
  JSONObject obj = new JSONObject();
  obj.put("executable","https://gist.githubusercontent.com/iflanagan/5af7ff6027ff9d0f3dbb3bea55d670b9/raw/17c4c6a908080af704478f17f5ef750d575cbcdb/preruntest.sh");
  obj.put("background","false");

   */


  DesiredCapabilities caps = new DesiredCapabilities();
  /* caps.setCapability("tunnelIdentifier", "HeadlessTunnelId"); */
  caps.setCapability("platform", "Linux");
  caps.setCapability("browser", "chrome");
  caps.setCapability("version", "latest");
 //  caps.setCapability("prerun", obj);

  System.out.println("\nSet capabiliities now create the driver.");

  WebDriver driver = new RemoteWebDriver(new URL(URL), caps);


  driver.get("https://www.google.com/");

  
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
