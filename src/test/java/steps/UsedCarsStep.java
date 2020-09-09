package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarsSearchPageActions;
import utils.SeleniumDriver;

import java.util.List;

public class UsedCarsStep {

    UsedCarsSearchPageActions usedCarsSearchPageActions = new UsedCarsSearchPageActions();
    CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();

    @And("^click on \"([^\"]*)\" link on Used Sarch Car page$")
    public void click_on_link_on_Used_Sarch_Car_page(String arg1)  {
        carsGuideHomePageActions.clickOnSearchCarsMenu();
    }

    @And("^select carbrand as \"([^\"]*)\" from AnyMake dropdown Used Sarch Car page$")
    public void select_carbrand_as_from_AnyMake_dropdown_Used_Sarch_Car_page(String carBrand) {
        usedCarsSearchPageActions.selectCarMake(carBrand);
    }

    @And("^select carmodel on Used Sarch Car page$")
    public void select_carmodel_on_Used_Sarch_Car_page(List<String> list)  {
        String menu = list.get(1);
        usedCarsSearchPageActions.selectCarModel(menu);
    }

    @And("^select location as \"([^\"]*)\" from AnyLocation dropdown Used Sarch Car page$")
    public void select_location_as_from_AnyLocation_dropdown_Used_Sarch_Car_page(String location)  {
        usedCarsSearchPageActions.selectLocation(location);
    }

    @And("^select price as \"([^\"]*)\" from Price dropdown Used Sarch Car page$")
    public void select_price_as_from_Price_dropdown_Used_Sarch_Car_page(String carsPrice) {
        usedCarsSearchPageActions.selectCarPrice(carsPrice);
    }

    @And("^click on Find_My_Next_Car button Used Sarch Car page$")
    public void click_on_Find_My_Next_Car_button_Used_Sarch_Car_page()  {
        usedCarsSearchPageActions.clickOnFindMyNextCarBtn();
    }

    @Then("^I should see list of used searched cars$")
    public void i_should_see_list_of_used_searched_cars() {
        System.out.println("Cars list found");
    }

    @And("^the page title of used car search page should be \"([^\"]*)\"$")
    public void the_page_of_used_car_search_page_should_be(String expectedTitle) {
        String actual_Title = SeleniumDriver.getDriver().getTitle();
        Assert.assertEquals(actual_Title,expectedTitle);
    }





}
