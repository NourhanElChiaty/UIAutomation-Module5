package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P_02_checkBoxes {
  WebDriver driver;
	public P_02_checkBoxes(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement getCheckBox() {
		return driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
	}
  
}
