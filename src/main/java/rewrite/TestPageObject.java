package rewrite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPageObject {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ITEA\\ChromeDriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.phptravels.net/login");

        PhpTravelsLoginPage loginPage = new PhpTravelsLoginPage(webDriver);

        loginPage.typeUsername("dsfgdfg");
        loginPage.typePassword("gffg");
        loginPage.submitlogin();


        System.out.println("finish test");


    }
}
