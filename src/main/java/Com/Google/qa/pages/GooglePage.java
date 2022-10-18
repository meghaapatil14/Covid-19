package Com.Google.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Google.qa.base.TestBase;

public class GooglePage extends TestBase{
	
	public GooglePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class=\"gLFyf gsfi\"]")
	WebElement GoogleSearchBar;
	
	
	@FindBy(xpath="//span[contains(text(),'covid-19')]")
	WebElement text;
	
	
	@FindBy(xpath="//div[@class=\"hdtb-mitem hdtb-msel\"]")
	WebElement news;
	
	public String validateSearchBar(String search) throws InterruptedException {
		boolean status=GoogleSearchBar.isDisplayed();
		System.out.println(status);
		GoogleSearchBar.sendKeys(search);
		Thread.sleep(2000);
		text.click();
		Thread.sleep(2000);
		news.click();
		Thread.sleep(2000);
		
		return search;
	}

}
