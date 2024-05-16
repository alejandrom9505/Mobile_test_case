package Adapter.Screens;



import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PreferredServicesScreen extends BaseMobileScreen {

    private MobileElement skipButtonSelector = new MobileElement(By.Xpath,"//android.widget.TextView[@resource-id=\"com.imdb.mobile:id/user_streaming_skip_save_button\"]","skip Button");
    public PreferredServicesScreen(AndroidDriver<AndroidElement> ndriver) {
        driver= ndriver;
        wait =new WebDriverWait(driver,30);
        initElements();
    }


    public void clickSkipButton() {
        findMobileElement(skipButtonSelector).click();// Método para hacer click en el botón "Skip"
    }
}
