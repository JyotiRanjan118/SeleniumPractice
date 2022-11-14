package MyPracticeSelenium.SeleniumPractice.PracticeNaveenCode;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Created by jyonath2 on 08-07-2022 15:34
 */
public class AmazonTest {

    @Test
    public void amazonTest(){
        open("http://www.amazon.com");
        String title=title();
        System.out.println(title);
        if(title.contains("Amazon")){
            System.out.println("Correct title");
        }

        String url=WebDriverRunner.getWebDriver().getCurrentUrl();
        if(url.contains("amazon")){
            System.out.println("url is correct");
        }

    }
}
