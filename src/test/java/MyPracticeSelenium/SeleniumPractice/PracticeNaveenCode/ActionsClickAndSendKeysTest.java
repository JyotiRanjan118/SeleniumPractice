package MyPracticeSelenium.SeleniumPractice.PracticeNaveenCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



/**
 * Created by jyonath2 on 25-06-2022 16:20
 */
public class ActionsClickAndSendKeysTest {

    By emailId = By.id("input-email");
    By password = By.id("input-password");
    By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");

    static WebDriver driver;
    @Test
    public void openCartLogin() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");


        Actions actions=new Actions(driver);

        doActionsSendKeys(emailId, "jyotiranjan118@gmail.com");
        doActionsSendKeys(password, "nathJRN@313");
        doActionsClick(loginBtn);

    }
    public static void doActionsSendKeys(By locator, String value) {
        Actions actions=new Actions(driver);
        actions.sendKeys(getElement(locator),value).build().perform();
    }

    public static void doActionsClick(By locator) {
        Actions actions=new Actions(driver);
       actions.click(getElement(locator)).build().perform();
    }

    public static WebElement getElement(By locator) {
       return driver.findElement(locator);
    }
}
