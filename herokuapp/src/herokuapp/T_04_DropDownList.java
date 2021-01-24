package herokuapp;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.P_02_checkBoxes;
import Pages.P_03_DropDownList;

public class T_04_DropDownList {
	WebDriver driver;
	  @Test
	  public void dropdown_first_method() throws InterruptedException {
		  driver.findElement(By.xpath("//option[@value=\"2\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//option[text()='Option 1']")).click();
		  Thread.sleep(2000);
		  driver.findElements(By.xpath("//select[@id=\"dropdown\"]/option")).get(1).click();
		  Thread.sleep(2000);
		  /*
		  P_02_checkBoxes checkBox = new P_02_checkBoxes(driver);
		  WebElement check =checkBox.getCheckBox();
		
		  assertEquals(check.isSelected(),true );
		  
		  */
	  }
	  @Test
	  public void dropdown_second_method() throws InterruptedException {
		  Select select = new Select(driver.findElement(By.id("dropdown")));
		  select.selectByValue("2");
		  Thread.sleep(2000);
		  select.selectByVisibleText("Option 1");
		  Thread.sleep(2000);
		  select.selectByIndex(1);
		  Thread.sleep(2000);
		//  select.getOptions().get(0).isEnabled();
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  String chromePath = System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", chromePath);
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }

}
