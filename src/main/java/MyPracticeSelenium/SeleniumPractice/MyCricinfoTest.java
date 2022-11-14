package MyPracticeSelenium.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class MyCricinfoTest {

	static WebDriver driver;

	@Test
	public void myCricInfoTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		List<WebElement> list = driver.findElements(By.xpath(
				"//table[@id='tablepress-1']//td[text()='windows']/preceding-sibling::td/input[@type='checkbox']"));

		for(WebElement e: list){
			e.click();
			Thread.sleep(1000);
		}

	}

}
