package rewrite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\ITEA\\ChromeDriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.google.com/gmail");

        WebElement emailField = webDriver.findElement(By.xpath("//input[@type = 'email']"));
        emailField.sendKeys("bla@gmil.com");
        webDriver.findElement(By.id("identifierNext")).click();

        WebDriverWait webDriverWait = new WebDriverWait(webDriver,10);
        WebElement passwordField = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type = 'password']")));

        passwordField.sendKeys("fkljndfv");

        webDriver.findElement(By.id("passwordNext")).click();
    }
}
