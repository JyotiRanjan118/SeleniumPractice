package MyPracticeSelenium.SeleniumPractice.PracticeNaveenCode;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MyBrowserWindowHandleWithList {


	@Test
	public void windowHandlesList() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");// parent window

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();

		Set<String> handlesList=driver.getWindowHandles();

		List<String> handleList=new ArrayList<>(handlesList);

		String parentWindowId=handleList.get(0);
		System.out.println("parent window id: " + parentWindowId);

		String childWindowId=handleList.get(1);
		System.out.println("child window id: " + childWindowId);

		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.close();

		Selenide.sleep(2000);
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.quit();



	}

}
