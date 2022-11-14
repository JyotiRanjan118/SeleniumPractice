package MyPracticeSelenium.SeleniumPractice.PracticeNaveenCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class BrowserWindowHandle {

	@Test
	public void browserHandles(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();

		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowId=it.next();
		System.out.println("parent window id is : " + parentWindowId);

		String childWindowId=it.next();
		System.out.println("child window id is : " + childWindowId);

		driver.switchTo().window(childWindowId);
		System.out.println("child window title is: " + driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is: " + driver.getTitle());

		driver.quit();

	}

}
