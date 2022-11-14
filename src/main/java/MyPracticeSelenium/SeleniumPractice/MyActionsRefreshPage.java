package MyPracticeSelenium.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class MyActionsRefreshPage {

	@Test
	public void actionRefreshPage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naveenautomationlabs.com");
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		action.keyDown(Keys.COMMAND).sendKeys("r").keyUp(Keys.COMMAND).build().perform();
		action.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();
	}

}
