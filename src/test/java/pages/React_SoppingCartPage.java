package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class React_SoppingCartPage {
    public React_SoppingCartPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath ="//*[@id=\"root\"]/div/main/main/div/div/p")
    public List<WebElement> urunler;
}
