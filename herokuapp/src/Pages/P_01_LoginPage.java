package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P_01_LoginPage {
 WebDriver driver;
	public P_01_LoginPage(WebDriver driver) {
		this.driver = driver;
		
		
	}
	
	public WebElement elementalSelenium() {
		
		return driver.findElement(By.xpath("//a[@target=\"_blank\"]"));
	}
    
public WebElement flashError() {
		
		return driver.findElement(By.id("flash"));
	}

public WebElement loginButton() {
	
	return driver.findElement(By.cssSelector("button[type='submit']"));
}
}
