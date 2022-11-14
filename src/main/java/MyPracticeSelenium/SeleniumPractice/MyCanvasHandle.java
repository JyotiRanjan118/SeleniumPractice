package MyPracticeSelenium.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyCanvasHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.online-calculator.com/html5/online-calculator/index.php?v=10");
		
		WebElement canvas=driver.findElement(By.id("canvas"));
		Actions act = new Actions(driver);

		Thread.sleep(2000);
		act.moveByOffset(600,430).click().build().perform();
		Thread.sleep(2000);
		act.moveByOffset(300,170).click().build().perform();

	}

}
