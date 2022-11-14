package MyPracticeSelenium.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyAmazonFooterText {

	static WebDriver driver;

	@Test
	public void getAmazonFooter() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		System.out.println(getHeaderValue("Careers"));

		//label[text()='Phone Number']/parent::div//input
		
	}
	
	public static String getHeaderValue(String footerLinkText) {		
		String header = driver
				.findElement(By.xpath("//a[text()='"+footerLinkText+"']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
						.getText();
		return header;
	}
	
	
	
	

}
