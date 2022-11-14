package MyPracticeSelenium.SeleniumPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class MyElementsSectionLinks {

	@Test
	public void elementSelectionLinks(){

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By rightSecsLinks =By.cssSelector("list-group-item");
		ElementUtil elementUtil=new ElementUtil(driver);
		ArrayList<String> textList=elementUtil.getElementsTextList(rightSecsLinks);
		System.out.println(textList);
		if(textList.contains("Order History")){
			System.out.println("PASS");
		}

	}
	
	

}
