package testAndQuiz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TestAndQuizDescribePage {


    @FindBy(linkText = "This is a link")
    private WebElement link;

    @FindBy(id = "fname")
    private WebElement textBox;

    @FindBy(id = "idOfButton")
    private WebElement buttonSubmit;

    @FindBy(css = "input[id='male']")
    private WebElement radioButton;

    @FindBy(className = "Automation")
    private WebElement checkBox;

    @FindBy(id = "testingDropdown")
    private WebElement dropDown;

    @FindBy(id = "dblClkBtn")
    private WebElement doubleClickButton;

    @FindBy(xpath = "//div[11]/div/p/button")
    private WebElement alertBoxButton;

    @FindBy(xpath = "//div[12]/div/p[1]/button")
    private WebElement confirmBoxButton;

    @FindBy(id = "sourceImage")
    private WebElement imageJavaPoint;

    @FindBy(id = "targetDiv")
    private WebElement boxForImage;

    private final Actions actions;

    TestAndQuizDescribePage(WebDriver webDriver, Actions actions) {
        this.actions = actions;
        PageFactory.initElements(webDriver, this);
    }

    public void tapOnLink() {
        link.click();
    }

    public void enterText(String textBox) {
        this.textBox.sendKeys(textBox);
    }

    public void tapSubmit() {
        buttonSubmit.click();
    }

    public void chooseRadioButton() {
        radioButton.click();
    }

    public void chooseCheckBox() {
        checkBox.click();
    }

    public void chooseFromDropDown(String text) {
        Select drop = new Select(dropDown);
        drop.selectByVisibleText(text);
    }

    public void doubleClickButton() {
        actions.doubleClick(doubleClickButton).perform();
    }

    public void tapAlertBoxButton() {
        alertBoxButton.click();
    }

    public void tapConfirmBoxButton() {
        confirmBoxButton.click();
    }

    public void performDragAndDrop() {
        actions.dragAndDrop(imageJavaPoint, boxForImage).build().perform();
    }


}

