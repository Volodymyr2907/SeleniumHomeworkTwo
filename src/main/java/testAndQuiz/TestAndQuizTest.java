package testAndQuiz;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.accessibility.AccessibleRelation;
import java.util.concurrent.TimeUnit;


public class TestAndQuizTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vyastrubchak\\IdeaProjects\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        Actions actions = new Actions(webDriver);
        webDriver.get("https://www.testandquiz.com/selenium/testing.html");
        webDriver.manage().window().maximize();

        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        TestAndQuizDescribePage testAndQuizDescribePage = new TestAndQuizDescribePage(webDriver, actions);

        testAndQuizDescribePage.tapOnLink();

        webDriver.navigate().back();

        testAndQuizDescribePage.enterText("ddfd");

        testAndQuizDescribePage.tapSubmit();

        testAndQuizDescribePage.chooseRadioButton();

        testAndQuizDescribePage.chooseCheckBox();

        testAndQuizDescribePage.chooseFromDropDown("Manual Testing");

        testAndQuizDescribePage.doubleClickButton();

        Alert alert = webDriver.switchTo().alert();
        alert.accept();

        testAndQuizDescribePage.tapAlertBoxButton();
        alert.accept();

        testAndQuizDescribePage.tapConfirmBoxButton();
        webDriver.switchTo().alert().dismiss();

        testAndQuizDescribePage.performDragAndDrop();


    }
}
