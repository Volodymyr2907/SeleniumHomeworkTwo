package rewrite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhpTravelsLoginPage {


    private By emailAddressField = By.xpath("//input[@type = 'email']");
    private By passwordAddressField = By.xpath("//input[@type = 'password']");
    private By loginButton = By.cssSelector(".loginbtn");

    private final WebDriver driver;

    PhpTravelsLoginPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void typeUsername(String email) {
        driver.findElement(emailAddressField).sendKeys(email);
    }

    public void typePassword(String password) {
        driver.findElement(passwordAddressField).sendKeys(password);
    }

    public void submitlogin() {
        driver.findElement(loginButton).click();
    }

}
