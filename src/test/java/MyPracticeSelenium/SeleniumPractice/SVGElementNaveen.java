package MyPracticeSelenium.SeleniumPractice;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElementNaveen {
	
	@Test
	public void SVGElement() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(5000);
		String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']/*[name()='g']/*[name()='path']";
		
		List<WebElement> statesList = driver.findElements(By.xpath(svgXpath));
		
		Actions act = new Actions(driver);
		
		for(WebElement e : statesList) {
			
			act.moveToElement(e).perform();
			
			String name = e.getAttribute("name");
			System.out.println(name);
				if(name.equals("Delaware")) {
					e.click();
					break;
				}
		}
	}

}
