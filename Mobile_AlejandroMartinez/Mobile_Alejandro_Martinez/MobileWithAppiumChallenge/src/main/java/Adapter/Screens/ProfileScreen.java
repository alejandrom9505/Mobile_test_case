package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MobileElement;
import Core.By;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProfileScreen extends BaseMobileScreen {
    private MobileElement findingNemoTextSelector = new MobileElement(By.Xpath, "//android.widget.TextView[@resource-id='com.imdb.mobile:id/primaryText' and @text='Finding Nemo']", "Finding Nemo Text");
    private MobileElement exitButtonSelector = new MobileElement(By.Id, "com.imdb.mobile:id/exit", "Exit Button");
    public ProfileScreen(AndroidDriver<AndroidElement> ndriver) {
        driver= ndriver;
        wait =new WebDriverWait(driver,30);
        initElements();
    }




    public void clickExitButton() {
        findMobileElement(exitButtonSelector).click(); // Método para hacer click en el botón de salida
    }
    public String getFindingNemoText() {
        return findMobileElement(findingNemoTextSelector).getText(); // Retorna el texto del elemento encontrado
    }
}