package rewrite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GmailTestErrorText2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ITEA\\ChromeDriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/gmail");

        WebElement emailField = webDriver.findElement(By.xpath("//input[@type = 'email']"));
        emailField.sendKeys("ddsf@gmail.com");

        webDriver.findElement(By.id("identifierNext")).click();

        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 2);
        WebElement emailFieldNew = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type = 'email']/../../../..//span/..")));
        String errorText = emailFieldNew.getText();

        System.out.println(errorText);

    }
}
