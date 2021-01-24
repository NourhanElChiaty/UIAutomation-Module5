package herokuapp;

import org.testng.annotations.Test;

import Pages.P_02_checkBoxes;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class T_03_CheckBoxes {
	WebDriver driver;
  @Test
  public void checkBox() {
	  P_02_checkBoxes checkBox = new P_02_checkBoxes(driver);
	  WebElement check =checkBox.getCheckBox();
	
	  assertEquals(check.isSelected(),true );
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  String chromePath = System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromePath);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
