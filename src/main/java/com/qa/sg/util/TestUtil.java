package com.qa.sg.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.sg.base.TestBase;

public class TestUtil extends TestBase {

	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	

public static void takeScreenshotAtEndOfTest() {

	// to take screenshot 
	File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String currentDir=System.getProperty("user.dir");
//	FileUtils.copyFile(scr, new File(currentDir +"/screenshots/" + System.currentTimeMillis() + ".png") );
	try {
		FileUtils.copyFile(scr, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
	
	
	
	
	
	
	
	
	
	
}
