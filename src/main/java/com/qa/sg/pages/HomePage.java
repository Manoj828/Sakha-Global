package com.qa.sg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sg.base.TestBase;
import com.qa.sg.util.TestUtil;

public class HomePage extends TestBase{

	//Page Factory - Object repo
	@FindBy(xpath="//a[@class='fusion-logo-link']/img") 
	WebElement logo; 
	 
	@FindBy(xpath="//span[contains(text(),'Home')]") // List of Elements available in Home Page
	WebElement HomeLink;
	
	@FindBy(xpath="//span[contains(text(),'About')]") 
	WebElement AboutLink;
	
	@FindBy(xpath="//span[contains(text(),'Solutions')]") 
	WebElement SolutionLink;
	
	@FindBy(xpath="//span[contains(text(),'Pega CoE')]") 
	WebElement PegaCoELink;
	
	@FindBy(xpath="//span[contains(text(),'Case Studies')]") 
	WebElement CaseStudiestLink;
	
	@FindBy(xpath="//span[contains(text(),'Life @ Sakha')]") 
	WebElement Life_SakhaLink;
	
	@FindBy(xpath="//span[contains(text(),'Join Us')]") 
	WebElement JoinUsLink;
	
	@FindBy(xpath="//span[contains(text(),'Insight')]") 
	WebElement InsightLink;
	
	
	//Initializing the Page Objects:
	public HomePage(){ 
	PageFactory.initElements(driver, this);
	}
	
		
	//Actions:
	public boolean VerifyLogo()
	{
		return logo.isDisplayed();
	}

	public boolean  VerifyAboutLink() 	// methods for header links	of homepage
	{
		return AboutLink.isDisplayed();
		
	}
	
	public boolean VerifySolutionLink()
	{
		return SolutionLink.isDisplayed();
	}
	
	public boolean VerifyPegaCoELink()
	{
		return PegaCoELink.isDisplayed();
	}
	
	public boolean VerifyCaseStudiestLink()
	{
		return CaseStudiestLink.isDisplayed();
	}
	
	public boolean VerifyLife_SakhaLink()
	{
		return Life_SakhaLink.isDisplayed();
	}
	
	public boolean VerifyJoinUsLink()
	{
		return JoinUsLink.isDisplayed();
	}
	
	public boolean VerifyInsightsLink()
	{
		return InsightLink.isDisplayed();
	}
	
	
	public String VerifyHomePageTitle()
	{
	  String HomePageTitle = driver.getTitle(); 	
	  return HomePageTitle;
	}
	
	public String VerifyAboutPageTitle()
	{
	  AboutLink.click();
	  String  AboutpageTitle = driver.getTitle();	
	  return AboutpageTitle;
	}
	
	public String VerifySolutionPageTitle()
	{
		SolutionLink.click();
	  String SolutionPageTitle = driver.getTitle();	
	  return SolutionPageTitle;
	}
	
	public String VerifyPegaCoEPageTitle()
	{ 
	  PegaCoELink.click();
	  String PegaCoEPageTitle =driver.getTitle();	
	  return PegaCoEPageTitle;
	}
	
	public String VerifyCaseStudiesPageTitle()
	{
	  CaseStudiestLink.click();
	  String CaseStudiesPageTitle =driver.getTitle();	
	  return CaseStudiesPageTitle;
	}
	
	public String VerifyLife_SakhaPageTitle()
	{ 
	  Life_SakhaLink.click();	
	  String Life_SakhaPageageTitle =driver.getTitle();	
	  return Life_SakhaPageageTitle;
	}
	
	public String VerifyJoinUsPageTitle()
	{ 
		JoinUsLink.click();	
	  String JoinUspageTitle =driver.getTitle();	
	  return JoinUspageTitle;
	}
	
	public String VerifyInsightPageTitle()
	{ 
		InsightLink.click();	
	  String InsightLinkpageTitle =driver.getTitle();	
	  return InsightLinkpageTitle;
	}
	
}
