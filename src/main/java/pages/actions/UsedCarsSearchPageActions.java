package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.CarSearchPageLocators;
import pages.locators.UsedCarsSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {

    UsedCarsSearchPageLocators usedCarsSearchPageLocators = null;

    public UsedCarsSearchPageActions() {

        this.usedCarsSearchPageLocators = new UsedCarsSearchPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),usedCarsSearchPageLocators);
    }

    public void selectCarMake(String carBrand) {
        Select selectCarMaker = new Select(usedCarsSearchPageLocators.carMakeDropdown);
        selectCarMaker.selectByVisibleText(carBrand);
    }

    public void selectCarModel(String carModel) {
        Select selectCarMaker = new Select(usedCarsSearchPageLocators.carModelDropdown);
        selectCarMaker.selectByVisibleText(carModel);
    }

    public void selectLocation(String carLocation) {
        Select selectCarMaker = new Select(usedCarsSearchPageLocators.carLocationDropdown);
        selectCarMaker.selectByVisibleText(carLocation);
    }

    public void selectCarPrice(String carsPrice) {
        Select selectCarMaker = new Select(usedCarsSearchPageLocators.carsPriceDropdown);
        selectCarMaker.selectByVisibleText(carsPrice);
    }

    public void clickOnFindMyNextCarBtn() {
        usedCarsSearchPageLocators.findMyNextCarBtn.click();
    }

}

