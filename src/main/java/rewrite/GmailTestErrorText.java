package rewrite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GmailTestErrorText {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ITEA\\ChromeDriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("https://www.google.com/gmail");

        WebElement emailField = webDriver.findElement(By.xpath("//input[@type = 'email']"));
        emailField.sendKeys("dfg@gmil.com");
        webDriver.findElement(By.id("identifierNext")).click();

        String errorText = webDriver.findElement(By.xpath("//input[@type = 'email']/../../../..//span/..")).getText();

        System.out.println(errorText);

    }


}
