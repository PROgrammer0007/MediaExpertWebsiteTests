package framework.selenium.pages.mediaExpert;

import framework.selenium.base.elements.Button;
import framework.selenium.base.elements.InputCheckbox;
import framework.selenium.base.elements.InputTextBox;
import framework.selenium.base.elements.Link;
import org.openqa.selenium.By;

import java.util.List;

public class ItemPage {

    Link checkAvailabilityInStoreLink;

    InputTextBox checkAvailabilityField;

    Button checkAvailabilityButton;
    Button pickUpInAnHourButton;
    Button nextButton;

    InputCheckbox showStoreWithThisItem;
    InputCheckbox warratyInput1;


    public ItemPage(){
        checkAvailabilityInStoreLink = new Link(By.xpath("//div//a[@data-product-id='2514200']//span"));
        checkAvailabilityField = new InputTextBox(By.xpath("//input[@class='c-posList_searchInput a-form_input']"));
        checkAvailabilityButton = new Button(By.xpath("//button[@class='c-posList_searchSubmit c-btn is-tertiary is-small']"));
        pickUpInAnHourButton = new Button(By.xpath("//div[@class='c-posList_posElementGroup is-action']"));
        showStoreWithThisItem = new InputCheckbox(By.xpath("//div[@class='c-posList_productsAvailable']"));
        warratyInput1 = new InputCheckbox(By.xpath("//label//span[@class='is-customRadio']"));
        nextButton = new Button(By.xpath("//a[@class='c-btn is-tertiary']"));
    }

    public ItemPage clickCheckAvailabilityInStore() {
        checkAvailabilityInStoreLink.clickOnLink();
        return this;
    }

    public void sendNameTown(String nameTown){
        checkAvailabilityField.sendText(nameTown);
    }

    public void checkAvailability(){
        checkAvailabilityButton.clickOnElement();

    }

    public void selectStoreWithThisItem(boolean trueOrFalse){
        showStoreWithThisItem.checkUncheckCheckbox(trueOrFalse);
    }

    public void pickInAnHourItem(){
        pickUpInAnHourButton.clickOnElement();
    }

    public void selectWarraty(){
        warratyInput1.checkUncheckCheckbox(true);
    }

    public void keepGoing(){
        nextButton.clickOnElement();
    }


}
