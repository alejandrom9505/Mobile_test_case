package Tests;

import Adapter.Bases.BaseMobileTest;
import Adapter.Screens.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MyTest extends BaseMobileTest {

    private static final String MOVIE_NAME = "Iron Man";
    private static final String EXPECTED_PLOT = "After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil.";
    private static final String SEARCH_MOVIE_NAME = "Monsters University";
    private static final String EXPECTED_WATCHLIST = "Monsters University";
    private static final String RATE_MOVIE_NAME = "Finding Nemo";
    private static final String EXPECTED_RATING = "Finding Nemo";



    private void initializeSearch() {

        welcomeScreen.clickContinueButton();
        welcomeScreen.clickSignInWithGoogle();
        preferredServicesScreen.clickSkipButton();
        searchViewScreen.clickSearchIcon();
        searchViewScreen.clickSearchBar();
    }

    @Test
    public void testSearchAndValidateMovieDescription() {

        welcomeScreen.clickContinueButton();
        homeViewScreen.clickBackButton();
        searchViewScreen.clickSearchIcon();
        searchViewScreen.clickSearchBar();
        searchViewScreen.enterSearchText(MOVIE_NAME);
        searchViewScreen.clickFirstSearchResult();
        String actualPlot = searchViewScreen.getPlotOverview();
        assertThat(actualPlot).as("Verifying the plot description of Iron Man").isEqualTo(EXPECTED_PLOT);
    }

    @Test
    public void testLoginSearchAddAndVerifyMovieInList() {

        initializeSearch();

        searchViewScreen.enterSearchText(SEARCH_MOVIE_NAME);
        searchViewScreen.clickOnMovieFromResults();
        searchViewScreen.addToWatchlist();
        searchViewScreen.clickDontPromptAgain();
        homeViewScreen.clickProfileButton();
        //en algunas ocaciones sale un mensaje de publicidad
        //profileScreen.clickExitButton();
        homeViewScreen.clickSeeAllFromWatchlist();
        String isMovieAdded = homeViewScreen.isMovieInWatchlist();
        assertThat(isMovieAdded).as("Check if 'Monsters University' is added to Watchlist").isEqualTo(EXPECTED_WATCHLIST);
    }
    @Test
    public void testRateMovie(){
        initializeSearch();
        searchViewScreen.enterSearchText(RATE_MOVIE_NAME);
        searchViewScreen.clickFirstMovieResult();
        searchViewScreen.clickRateIcon();
        searchViewScreen.clickTenStarRating();
        searchViewScreen.clickRateButton();
        searchViewScreen.clickCloseButton();
        homeViewScreen.clickProfileButton();
        searchViewScreen.clickRatingHistoryButton();
        String actualText = profileScreen.getFindingNemoText();
        assertThat(actualText).as("Check if 'Finding Nemo' text is displayed correctly").isEqualTo(EXPECTED_RATING);


    }


}


