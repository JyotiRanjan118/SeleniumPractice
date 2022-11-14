package MyPracticeSelenium.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class MyActionDragAndDrop {

	static WebDriver driver;

	@Test
	public  void actionDragAndDrop() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/#display-grid");
		driver.switchTo().frame(0);
		List<WebElement> nums = driver.findElements(By.cssSelector("ol#selectable li"));

		Actions act=new Actions(driver);
		act.clickAndHold(nums.get(5)).moveToElement(nums.get(7)).release().perform();
		driver.switchTo().defaultContent();
		WebElement image = driver.findElement(By.cssSelector("img[title='Support the JS Foundation']"));
		act.moveToElement(image).click().perform();


	}

}
