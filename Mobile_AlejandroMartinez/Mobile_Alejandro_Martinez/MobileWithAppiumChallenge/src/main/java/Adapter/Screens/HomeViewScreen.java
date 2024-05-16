package Adapter.Screens;

import Core.By;
import Adapter.Bases.BaseMobileScreen;
import Core.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeViewScreen extends BaseMobileScreen {

    private MobileElement backButtonSelector = new MobileElement(By.Xpath,"//android.widget.ImageButton","back Button");
    private MobileElement homeIconSelector = new MobileElement(By.Xpath,"(//android.widget.ImageView[@resource-id='com.imdb.mobile:id/navigation_bar_item_icon_view'])[1]","home Icon");
    private MobileElement seeAllFromWatchlistSelector = new MobileElement(By.Id,"com.imdb.mobile:id/see_all","see All From Watch list");
    private MobileElement movieInWatchlistSelector = new MobileElement(By.Id,"com.imdb.mobile:id/primaryText","movie In Watch list");
    private MobileElement scrollAreaSelector = new MobileElement(By.AndroidUiSelector, "new UiSelector().className(\"android.widget.LinearLayout\").instance(0)", "Scroll Area");
    private MobileElement profileButtonSelector = new MobileElement(By.Xpath, "(//android.widget.ImageView[@resource-id='com.imdb.mobile:id/navigation_bar_item_icon_view'])[4]", "Profile Button");

    //
   public HomeViewScreen(AndroidDriver<AndroidElement> ndriver) {
        driver= ndriver;
        wait =new WebDriverWait(driver,30);
        initElements();
    }


//
    public void clickBackButton() {
        findMobileElement(backButtonSelector).click();// Método para hacer click en el icono de volver

    }
    public void clickHomeIcon() {
        findMobileElement(homeIconSelector).click();// Método para hacer click en el icono "Home"
    }
    public void clickSeeAllFromWatchlist() {
        findMobileElement(seeAllFromWatchlistSelector).click();// Método para hacer click en el botón "See all" en la vista HomeViewScreen
    }
    public void clickProfileButton() {
        findMobileElement(profileButtonSelector).click(); // Realiza el click en el ícono de perfil
    }
    public String isMovieInWatchlist() {
        return findMobileElement(movieInWatchlistSelector).getText();

    }



//    public void scrollToElement(MobileElement targetElement) {
//        String scrollableContainerSelector = "new UiScrollable(new UiSelector().scrollable(true).instance(0))";
//        String uiSelector = targetElement.by == By.AndroidUiSelector ?
//                targetElement.element :
//                "new UiSelector()." + targetElement.by.toString().toLowerCase() + "(\"" + targetElement.element + "\")";
//
//        driver.findElementByAndroidUIAutomator(scrollableContainerSelector + ".scrollIntoView(" + uiSelector + ")");
//    }
//
//
//    public void scrollDownInHome() {
//        scrollToElement(scrollAreaSelector);
//    }





}