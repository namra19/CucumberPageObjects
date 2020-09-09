package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {

    @FindBy(how= How.ID, using="makes")
    public WebElement carMakeDropdown;

    @FindBy(how= How.ID, using="models")
    public WebElement carModelDropdown;

    @FindBy(how= How.ID, using="locations")
    public WebElement carLocationDropdown;

    @FindBy(how= How.ID, using="priceTo")
    public WebElement carsPriceDropdown;

    @FindBy(how= How.ID, using="search-submit")
    public WebElement findMyNextCarBtn;
}
