package Adapter.Screens;

import Core.By;
import Core.MobileElement;
import Adapter.Bases.BaseMobileScreen;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SearchViewScreen extends BaseMobileScreen {


    private MobileElement searchIconSelector = new MobileElement(By.Xpath,"(//android.widget.ImageView[@resource-id=\"com.imdb.mobile:id/navigation_bar_item_icon_view\"])[2]","search Icon");
    private MobileElement searchBarSelector = new MobileElement(By.Id,"com.imdb.mobile:id/search_src_text","search Bar");
    private MobileElement firstSearchResultSelector = new MobileElement(By.Xpath,"//android.widget.TextView[@resource-id='com.imdb.mobile:id/suggestion' and @text='Iron Man']","first Search Result");
    private MobileElement plotOverviewSelector = new MobileElement(By.Id,"com.imdb.mobile:id/plot_overview","plot Over view");
    private MobileElement movieResultSelector = new MobileElement(By.Xpath,"//android.widget.TextView[@resource-id='com.imdb.mobile:id/suggestion' and @text='Monsters University']","movie Result");
    private MobileElement addToWatchlistButtonSelector = new MobileElement(By.Id,"com.imdb.mobile:id/watchlist_button_icon","add To Watch list Button");
    private MobileElement dontPromptAgainButtonSelector = new MobileElement(By.Id,"com.imdb.mobile:id/notification_dont_ask_me_again","dont Prompt Again Button ");
    private MobileElement firstMovieResultSelector = new MobileElement(By.Xpath,"(//android.widget.TextView[@resource-id=\"com.imdb.mobile:id/suggestion\"])[1]","first Movie Result");
    private MobileElement rateIconSelector = new MobileElement(By.Id,"com.imdb.mobile:id/star_your","rate Icon");
    private MobileElement tenStarRatingSelector = new MobileElement(By.Id,"com.imdb.mobile:id/star_10","ten Star Rating");
    private MobileElement rateButtonSelector = new MobileElement(By.Id,"com.imdb.mobile:id/rate_title_button","rate Button");
    private MobileElement closeButtonSelector = new MobileElement(By.Id, "com.imdb.mobile:id/rate_more_like_this_close", "Close Button");
    private MobileElement ratingHistoryButtonSelector = new MobileElement(By.Xpath, "(//android.view.ViewGroup[@resource-id='com.imdb.mobile:id/posters_parent'])[1]", "Rating History Button");

    public SearchViewScreen(AndroidDriver<AndroidElement> ndriver) {
        driver= ndriver;
        wait =new WebDriverWait(driver,30);
        initElements();
    }

    public void clickSearchIcon() {
        findMobileElement(searchIconSelector).click(); // Método para hacer click en el icono de buscar
    }

    public void clickSearchBar() {
        findMobileElement(searchBarSelector).click();
         // Método para hacer click en la barra de búsqueda
    }
    public void enterSearchText(String text) {

        findMobileElement(searchBarSelector).sendKeys(text);// Método para ingresar texto en la barra de búsqueda

    }
    public void clickFirstSearchResult() {
        findMobileElement(firstSearchResultSelector).click();// Método para hacer click en el primer resultado de la búsqueda
    }

    public String getPlotOverview() {

        return findMobileElement(plotOverviewSelector).getText();

    }

    public void clickOnMovieFromResults() {
        findMobileElement(movieResultSelector).click();// Método para hacer click en el resultado de la película "Monsters University"
    }

    public void addToWatchlist() {
        findMobileElement(addToWatchlistButtonSelector).click();// Método para hacer click en el icono "add to Watchlist"
    }

    public void clickDontPromptAgain() {
        findMobileElement(dontPromptAgainButtonSelector).click(); // Método para hacer click en el botón "Don't prompt me again"
    }
    public void clickFirstMovieResult() {
        findMobileElement(firstMovieResultSelector).click(); // Método para hacer click en el primer resultado de la película
    }

    public void clickRateIcon() {
        findMobileElement(rateIconSelector).click(); // Método para hacer click en el icono de Rate
    }

    public void clickTenStarRating() {
        findMobileElement(tenStarRatingSelector).click(); // Método para hacer click en el icono de puntuación de 10 estrellas
    }

    public void clickRateButton() {
        findMobileElement(rateButtonSelector).click(); // Método para hacer click en el botón "Rate"
    }
    public void clickCloseButton() {
        findMobileElement(closeButtonSelector).click(); // Método para hacer click en el botón de cerrar
    }
    public void clickRatingHistoryButton() {
        findMobileElement(ratingHistoryButtonSelector).click(); // Método para hacer click en el botón de Historial de Calificaciones
    }


}