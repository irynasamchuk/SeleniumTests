import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleTranslatePage {
    @FindBy(xpath = "//*[@id=\"sugg-item-en\"]")
    WebElement englishButton;

    @FindBy(xpath = "//*[@id=\"source\"]")
    WebElement textArea;

    @FindBy(className = "result tlid-copy-target")
    WebElement resultTranslation;

    @FindBy(className = "goog-inline-block jfk-button jfk-button-standard jfk-button-collapse-right jfk-button-checked jfk-button-clear-outline")
    WebElement ukraineButoon;


    public void clickOnTheEnglishButton() {
        englishButton.click();
    }

    public void enterText(String text) {
        textArea.click();
        textArea.sendKeys(text);
    }

    public void checkTranslation(String text){
        Assert.assertEquals("яблуко", resultTranslation );
    }
}

