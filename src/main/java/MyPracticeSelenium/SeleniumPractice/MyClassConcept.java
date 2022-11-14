package MyPracticeSelenium.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClassConcept {

	static WebDriver driver;

	@Test
	public  void myClassConcept() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector(".form-control.private-form__control.login-email")).sendKeys("test@gmail.com");
		
		//InvalidSelectorException: Compound class names not permitted
		
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("test@gmail.com");

		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("test@gmail.com");

		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");

		//driver.findElement(By.cssSelector("input.login-email")).sendKeys("test@gmail.com");

		
	}

}
