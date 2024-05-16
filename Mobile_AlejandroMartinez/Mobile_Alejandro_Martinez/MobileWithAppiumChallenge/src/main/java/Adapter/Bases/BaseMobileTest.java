package Adapter.Bases;


import Adapter.Screens.*;
import Core.ConfigCapabilities;
import Core.MobileAppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.*;


public class BaseMobileTest {
    public WelcomeScreen welcomeScreen;
    public HomeViewScreen homeViewScreen;
    public SearchViewScreen searchViewScreen;
    public PreferredServicesScreen preferredServicesScreen;
    public ProfileScreen profileScreen;

    private AndroidDriver<AndroidElement> driver;

    @BeforeSuite(alwaysRun = true)
    public void SetUp(){
        driver = new MobileAppDriver().GetMoviesAppDriver(new ConfigCapabilities().GetCapabilities());
        welcomeScreen=new WelcomeScreen(driver);
        homeViewScreen=new HomeViewScreen(driver);
        searchViewScreen=new SearchViewScreen(driver);
        preferredServicesScreen=new PreferredServicesScreen(driver);
        profileScreen=new ProfileScreen(driver);
    }

    @AfterSuite(alwaysRun = true)
    public void TearDown()
    {
        if(driver!=null)
            driver.quit();
    }
}



