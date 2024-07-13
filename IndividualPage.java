package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class IndividualPage extends BaseClass {
	public IndividualPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		}
	public IndividualPage enter_Last_Name(String Lastname) throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Lastname);
	return this;
}
	public ViewIndividualpage click_save() {
	driver.findElement(By.xpath("//div[contains(@class,'slds-text-align_right')]//span[text()='Save']")).click();
	return new ViewIndividualpage(driver);
}
	
//	public NewIndividualpage clickRecentlyViewed_or_Individuals() throws InterruptedException {
//		WebElement more = driver.findElement(By.xpath("//span[contains(text(),'More')]"));
//		Actions Dropdown1 = new Actions(driver);
//		Dropdown1.moveToElement(more).click().build().perform();
//		Thread.sleep(2000);
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement individualslist = driver.findElement(By.xpath("//span[contains(text(),'Individuals')][1]"));
//		Actions Dropdown3 = new Actions(driver);
//		Dropdown3.moveToElement(more).click().build().perform();
//		return new NewIndividualpage();
//
//	}
}
