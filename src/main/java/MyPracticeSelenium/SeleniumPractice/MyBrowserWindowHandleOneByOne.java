package MyPracticeSelenium.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class MyBrowserWindowHandleOneByOne {

	static WebDriver driver;

	@Test
	public void browserWindowHandle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("a[href*='linkedin']")).click();

		Set<String> handles=driver.getWindowHandles();

		Iterator<String> it=handles.iterator();
		String parentWindowID = it.next();
		String childWindowID = it.next();

		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowID);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		//Facebook
		driver.findElement(By.cssSelector("a[href*='facebook']")).click();
		Thread.sleep(2000);
		Set<String> handles2=driver.getWindowHandles();

		Iterator<String> it2=handles2.iterator();
		parentWindowID = it2.next();
		childWindowID = it2.next();

		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();

		driver.switchTo().window(parentWindowID);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());







	}

}
