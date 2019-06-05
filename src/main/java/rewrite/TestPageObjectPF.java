package rewrite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPageObjectPF {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ITEA\\ChromeDriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.phptravels.net/login");

        PhpTravelsLoginPagePF loginPage = new PhpTravelsLoginPagePF(webDriver);

        loginPage.typeUsername("dsfgdfg");
        loginPage.typePassword("gffg");
        loginPage.submitlogin();


        System.out.println("finish test");


    }
}
