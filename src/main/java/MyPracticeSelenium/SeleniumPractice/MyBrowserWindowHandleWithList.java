package MyPracticeSelenium.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MyBrowserWindowHandleWithList {

	static WebDriver driver;

	@Test
	public void browserWindowHandleWithList() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href*='linkedin']")).click();

		Set<String> handles=driver.getWindowHandles();

		//set to list
		List<String> handlesList=new ArrayList<>(handles);

		String parentID = handlesList.get(0);
		String childID = handlesList.get(1);

		driver.switchTo().window(childID);
		System.out.println("Child window url is : "+driver.getCurrentUrl());

		driver.close();

		driver.switchTo().window(parentID);
		System.out.println("Parent url window : "+driver.getCurrentUrl());
		System.out.println(("Parent window title: "+driver.getTitle()));

		driver.quit();

	}

}
