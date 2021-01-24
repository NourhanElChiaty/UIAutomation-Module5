package herokuapp;

import org.testng.annotations.Test;

import Pages.P_01_LoginPage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class T_01_TextBoxes_Buttons {
	WebDriver driver;
	
	
  @Test
  public void GetUrL() {
	  P_01_LoginPage loginPage = new P_01_LoginPage(driver);
	  String link = loginPage.elementalSelenium().getAttribute("href");
	 // link.getText();
	  //link.getAttribute("href");
	  assertEquals(link, "http://elementalselenium.com/");
	  		
  }
  
  @Test
  public void GetColor() throws InterruptedException {
	  P_01_LoginPage loginPage = new P_01_LoginPage(driver);
	  loginPage.loginButton().click();
	  
	  Thread.sleep(2000);
	  String color = loginPage.flashError().getCssValue("background-color");
	 // link.getText();
	  //link.getAttribute("href");
	  System.out.println(color);
	  assertEquals(color, "rgba(198, 15, 19, 1)");
	  		
  }
  @Test
  public void validUserName() throws InterruptedException {
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  String chromePath = System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromePath);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://the-internet.herokuapp.com/login");
	  

  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
