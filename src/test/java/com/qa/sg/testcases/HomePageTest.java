package com.qa.sg.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.sg.base.TestBase;
import com.qa.sg.pages.HomePage;

public class HomePageTest extends TestBase {

	HomePage homepage;
	
	
	public HomePageTest()
	{
		super();
	}

	
   @BeforeMethod()
   public void setup()
  {
	Initialisation();
	homepage = new HomePage();
	
  }
	

  @Test(priority=1)
  public void LogoTest()
  {
	 Assert.assertTrue(homepage.VerifyLogo());
  } 

  @Test(priority=2)
  public void TitleTest()
  {
	 String Title= homepage.VerifyHomePageTitle();
	 Assert.assertEquals(Title,"Sakha Global - Technabling Human Endeavors");
  } 
 
  @Test(priority=3) 
  public void HeaderLinkTest()
  {
	Assert.assertTrue(homepage.VerifyAboutLink());
	Assert.assertTrue(homepage.VerifySolutionLink());
	Assert.assertTrue(homepage.VerifyPegaCoELink());
	Assert.assertTrue(homepage.VerifyCaseStudiestLink());
	Assert.assertTrue(homepage.VerifyLife_SakhaLink());
	Assert.assertTrue(homepage.VerifyJoinUsLink());
	Assert.assertTrue(homepage.VerifyInsightsLink());
  } 
 
  
  @Test(priority=4) 
  public void AboutPageTitleTest() 
  {
    String AboutTitle = homepage.VerifyAboutPageTitle();
    Assert.assertEquals(AboutTitle, "About | Sakha Global");	
  }  
  
  @Test(priority=5) 
  public void SolutionPageTitleTest() 
  {
    String SolTitle = homepage.VerifySolutionPageTitle();
    Assert.assertEquals(SolTitle, "Solutions | Sakha Global");	
  }  
  
  @Test(priority=6) 
  public void PegaPageTitleTest() 
  {
    String PegaTitle = homepage.VerifyPegaCoEPageTitle();
    Assert.assertEquals(PegaTitle, "Pega CoE | Sakha Global");	
  }  

  @Test(priority=7) 
  public void CaseStudyPageTitleTest() 
  {
    String CaseStudyTitle = homepage.VerifyCaseStudiesPageTitle();
    Assert.assertEquals(CaseStudyTitle, "Case Studies | Sakha Global");	
  }  
  
  @Test(priority=8) 
  public void Life_SakhaPageTitleTest() 
  {
    String Life_SakhaTitle = homepage.VerifyLife_SakhaPageTitle();
    Assert.assertEquals(Life_SakhaTitle, "Life @ Sakha | Sakha Global");	
  }  

  @Test(priority=9) 
  public void JoinUsPageTitleTest() 
  {
    String JoinUsTitle = homepage.VerifyJoinUsPageTitle();
    Assert.assertEquals(JoinUsTitle, "Join Us | Sakha Global");	
  }  
 
  @Test(priority=10) 
  public void InsightPageTitleTest() 
  {
    String InsightTitle = homepage.VerifyInsightPageTitle();
    Assert.assertEquals(InsightTitle, "Insight | Sakha Global");	
  }  
  
   @AfterMethod()
   public void tearup()
   {
	 driver.quit();
   }

	
	
	
}
