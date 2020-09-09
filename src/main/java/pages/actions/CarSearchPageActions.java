package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarSearchPageActions {

    CarSearchPageLocators carSearchPageLocators = null;

    public CarSearchPageActions() {

        this.carSearchPageLocators = new CarSearchPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),carSearchPageLocators);
    }

    public void selectCarMake(String carBrand) {
        Select selectCarMaker = new Select(carSearchPageLocators.carMakeDropdown);
        selectCarMaker.selectByVisibleText(carBrand);
    }

    public void selectCarModel(String carModel) {
        Select selectCarMaker = new Select(carSearchPageLocators.carModelDropdown);
        selectCarMaker.selectByVisibleText(carModel);
    }

    public void selectLocation(String carLocation) {
        Select selectCarMaker = new Select(carSearchPageLocators.carLocationDropdown);
        selectCarMaker.selectByVisibleText(carLocation);
    }

    public void selectCarPrice(String carsPrice) {
        Select selectCarMaker = new Select(carSearchPageLocators.carsPriceDropdown);
        selectCarMaker.selectByVisibleText(carsPrice);
    }

    public void clickOnFindMyNextCarBtn() {
        carSearchPageLocators.findMyNextCarBtn.click();
    }
}
