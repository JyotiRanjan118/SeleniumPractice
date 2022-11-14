package MyPracticeSelenium.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class MyBigBasketNavigation {

	public static WebDriver driver;

	@Test
	public void bigBasketTea() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");

		Thread.sleep(3000);
		selectLevel4Product("Beverages", "Tea", "Green Tea","Tata Tea");
	}

	public static void selectLevel4Product(String l1, String l2, String l3,String l4) throws InterruptedException {
		WebElement mainCat = driver.findElement(By.cssSelector(".hvr-drop .meganav-shop"));
		Actions act=new Actions(driver);
		act.moveToElement(mainCat).perform();

		act.moveToElement(driver.findElement(By.linkText(l1))).perform();
		Thread.sleep(1000);

		act.moveToElement(driver.findElement(By.linkText(l2))).perform();
		Thread.sleep(1000);

		act.moveToElement(driver.findElement(By.linkText(l3))).perform();
		Thread.sleep(1000);

		act.moveToElement(driver.findElement(By.linkText(l3))).click().build().perform();
		Thread.sleep(1500);

	}


}
