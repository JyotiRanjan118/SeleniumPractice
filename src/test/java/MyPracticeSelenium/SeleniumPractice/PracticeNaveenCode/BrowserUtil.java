package MyPracticeSelenium.SeleniumPractice.PracticeNaveenCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.net.URL;

public class BrowserUtil {

	private WebDriver driver;

	public void init_driver(String browserName){
		System.out.println("browser name is : " + browserName);

		if(browserName.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox")){
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}
		else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else{
			System.out.println("please pass the right browser...." + browserName);
		}
	}

}
