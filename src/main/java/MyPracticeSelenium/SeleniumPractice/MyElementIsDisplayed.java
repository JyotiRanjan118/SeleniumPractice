package MyPracticeSelenium.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyElementIsDisplayed {

	// webelemet + isDisplayed()--> boolean -- true/false

	static WebDriver driver;

	@Test
	public void elementIsDisplayed() {

		//

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		By searchField = By.id("twotabsearchtextbox");

		if(doEleIsDisplayed(searchField)){
			System.out.println("ele is displayed");
			doSendKeys(searchField, "macbook pro");
		}
		else{
			System.out.println("ele not displayed");
		}

//		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
//		if (flag) {
//			System.out.println("ele is displayed");
//		} else {
//			System.out.println("ele not displayed");
//		}
		


	}
	
	public static boolean doEleIsDisplayed(By locator){
		return getElement(locator).isDisplayed();
	}

	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator,String value){
		getElement(locator).sendKeys(value);

	}

}
