package Com.Google.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Com.Google.qa.Util.TestUtil;

public class TestBase extends TestUtil {
	public static WebDriver driver;
	public static Properties props;
	
	public TestBase() {
		try {
		props=new Properties();
		
			FileInputStream ip=new FileInputStream("C:\\Users\\nmegh\\eclipse-workspace\\FirstMavenProject\\src\\main\\java\\Com\\Kite\\qa\\config\\config.properties");
		    props.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public static void initialization() {
		//ChromeOptions option=new ChromeOptions();
		//option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get(props.getProperty("url"));
	}

}
