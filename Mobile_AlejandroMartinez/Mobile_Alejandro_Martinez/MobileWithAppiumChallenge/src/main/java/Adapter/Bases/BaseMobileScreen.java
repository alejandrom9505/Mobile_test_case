package Adapter.Bases;

import Core.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class BaseMobileScreen {

    public AndroidDriver<AndroidElement> driver;
    public AndroidElement androidElement;
    public String mobileElementDescription;
    public WebDriverWait wait;


    public BaseMobileScreen()  {

    }
    public BaseMobileScreen click(){
        androidElement.click();
        return this;
    }
    public BaseMobileScreen sendKeys(String text){
        androidElement.sendKeys(text);
        return this;
    }
    public String getText(){

        return androidElement.getText();
    }

    public void initElements(){
        //PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



    protected BaseMobileScreen findMobileElement(MobileElement mobileElement) {
        mobileElementDescription = mobileElement.elementDescription;

        switch(mobileElement.by) {
            case AndroidUiSelector:
                androidElement = (AndroidElement) wait.until(ExpectedConditions.visibilityOf(driver.findElementByAndroidUIAutomator(mobileElement.element)));
                break;
            case Id:
                androidElement = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id(mobileElement.element)));
                break;
            case ClassName:
                androidElement = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.className(mobileElement.element)));
                break;
            case Xpath:
                androidElement = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(mobileElement.element)));
                break;
        }
        return this;
    }

//    public AndroidElement getAndroidElement() {
//        return androidElement;
//    }

}


