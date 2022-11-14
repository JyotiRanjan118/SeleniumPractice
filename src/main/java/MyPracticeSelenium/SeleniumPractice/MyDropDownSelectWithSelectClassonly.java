package MyPracticeSelenium.SeleniumPractice;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import java.util.List;

public class MyDropDownSelectWithSelectClassonly {

	static WebDriver driver;

	@Test
	public void dropDownSelectWithSelectClassOnly() throws InterruptedException {

		// dropdown - select tag
		// use Select class from selenium

		open("https://www.orangehrm.com/orangehrm-30-day-trial/");
		sleep(2000);

		$(By.id("Form_getForm_Country")).scrollIntoView(true);

		Select select = new Select($(By.id("Form_getForm_Country")));
		select.selectByValue("India");


		/*By countryOptions = By.xpath("//select[@id='Form_submitForm_Country']/option");
		doSelectValueFromDropDown(countryOptions,"India");*/


	}
	
	public static void doSelectValueFromDropDown(By locator, String value) {
		List<WebElement> optionList=driver.findElements(locator);

		for(WebElement e : optionList){
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)){
				e.click();
				break;
			}
		}
	}
	
	
	public static void doSelectValueUsingOptions(By locator, String value) {
		Select select = new Select(driver.findElement(locator));
		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	

}
