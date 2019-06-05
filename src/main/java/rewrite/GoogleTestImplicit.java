package rewrite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleTestImplicit {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "D:\\ITEA\\ChromeDriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("https://www.google.com");

        WebElement searchField = webDriver.findElement(By.cssSelector(".gLFyf"));
        searchField.sendKeys("ITEA HUB Lviv");
        searchField.submit();

        WebElement searchInputField = webDriver.findElement(By.className("search_qyery form-control ac_input"));
        searchInputField.click();
    }
}
