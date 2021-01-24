package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P_03_DropDownList {
	WebDriver driver;
	public P_03_DropDownList(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement dropDown() {
		
		return driver.findElement(By.id("dropdown"));
	}
}
