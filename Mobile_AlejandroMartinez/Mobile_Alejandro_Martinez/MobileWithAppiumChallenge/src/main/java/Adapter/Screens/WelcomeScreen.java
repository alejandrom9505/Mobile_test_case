package Adapter.Screens;


import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WelcomeScreen extends BaseMobileScreen {

    private MobileElement continueButtonSelector = new MobileElement(By.Id, "com.imdb.mobile:id/welcome_dialog_continue", "Deny Button for Location PopUp");
    private MobileElement signInWithGoogleButtonSelector = new MobileElement (By.Id,"com.imdb.mobile:id/google_oauth","sign In With Google");
    public WelcomeScreen(AndroidDriver<AndroidElement> ndriver) {
        driver= ndriver;
        wait =new WebDriverWait(driver,30);
        initElements();
    }

    public void clickContinueButton() {
        findMobileElement(continueButtonSelector).click(); // Método para hacer click en el botón 'continue'
    }


    public void clickSignInWithGoogle() {
        findMobileElement(signInWithGoogleButtonSelector).click();// Método para hacer click en el botón "Sign in with Google"
    }
}