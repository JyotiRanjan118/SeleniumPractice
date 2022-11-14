package MyPracticeSelenium.SeleniumPractice.PracticeNaveenCode;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class AuthPopUpConcept {

	static WebDriver driver;

	@Test
	public void authenticationPopUp(){

		String username = "admin";
		String password = "admin";

		Selenide.open("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
	}

}
