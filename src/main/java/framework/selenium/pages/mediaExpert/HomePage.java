package framework.selenium.pages.mediaExpert;

import framework.selenium.base.elements.Button;
import framework.selenium.base.elements.InputTextBox;
import framework.selenium.base.elements.Lable;
import framework.selenium.base.elements.Link;
import org.openqa.selenium.By;

public class HomePage {

    InputTextBox searchField;
    Lable closeCookieLable;
    Button searchButton;

    public HomePage(){
        searchField = new InputTextBox(By.xpath("//div[@class='c-search_input']//input"));
        closeCookieLable =new Lable(By.xpath("//label[@class='c-alert_close is-closeCookie']"));
        searchButton =new Button(By.xpath("//span[@class='c-search_submitIcon wf wf-search01']"));
    }

    public HomePage searchItem(String item){
        searchField.sendText(item);
        return this;
    }

    public HomePage clickCloseCookieLable() {
        closeCookieLable.clickOnElement();
        return this;
    }

    public ItemPage clickSearchButton() {
        searchButton.clickOnElement();
        return new ItemPage();
    }
}
