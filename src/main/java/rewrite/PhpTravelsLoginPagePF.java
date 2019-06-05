package rewrite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpTravelsLoginPagePF {

    @FindBy(xpath = "//input[@type = 'email']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@type = 'password']")
    private WebElement password;

    @FindBy(css = ".loginbtn")
    private WebElement loginButton;


    PhpTravelsLoginPagePF(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void typeUsername(String email) {
        emailAddress.sendKeys(email);
    }

    public void typePassword(String password) {
        this.password.sendKeys(password);
    }

    public void submitlogin() {
        loginButton.click();

    }
}
