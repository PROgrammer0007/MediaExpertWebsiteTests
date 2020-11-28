package framework.selenium.base.elements;

import org.openqa.selenium.By;

public class Lable extends BaseElements{

    public Lable (By locator){
        super(locator);
    }

    public void clickOnElement(){
        clickOnElementBase();
    }
}