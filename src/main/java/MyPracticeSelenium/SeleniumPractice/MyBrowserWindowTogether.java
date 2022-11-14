package MyPracticeSelenium.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class MyBrowserWindowTogether {

	static WebDriver driver;

	@Test
	public void browserWindowTogether() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		String parentWindowId = driver.getWindowHandle();
		
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("a[href*='linkedin']")).click();
		driver.findElement(By.cssSelector("a[href*='facebook']")).click();
		driver.findElement(By.cssSelector("a[href*='twitter']")).click();
		driver.findElement(By.cssSelector("a[href*='youtube']")).click();

		Set<String> handles=driver.getWindowHandles();

		Iterator<String> it=handles.iterator();

		while (it.hasNext()){
			String windowID=it.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getCurrentUrl());

			if(!windowID.equals(parentWindowId)){
				driver.close();
			}
			Thread.sleep(2000);
		}

		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window title : "+parentWindowId);

		driver.quit();
	}

}
