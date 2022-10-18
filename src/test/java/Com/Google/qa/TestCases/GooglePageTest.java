package Com.Google.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Google.qa.base.TestBase;
import Com.Google.qa.pages.GooglePage;

public class GooglePageTest extends TestBase {
	GooglePage page;
	
	public GooglePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		page=new GooglePage();
	}
	
	@Test
	public void searchText() {
		try {
			page.validateSearchBar("COVID-19");
			
		
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
/*	@AfterMethod
	public void Teardown() {
		driver.quit();
	} */

}
