package ucll.project.ui;

import org.jsoup.parser.CharacterReader;
import org.junit.*;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class HomePageTest {

    private static WebDriver driver;

    @Before
    public void SetupDriver() {
        // Setup the Chrome driver for the whole class
        driver = ChromeDriverHelper.getDriver();
    }

    @After
    public void CloseBrowser() {
        // close it in the end, comment this away to keep chrome open
        driver.close();
    }

    /**
     * This is a sample test, remove this test and write your own!
     */
    @Test
    public void VisitHomePageTest() {

        driver.get(Config.BASE_URL);
        assertEquals("Hello world!", driver.getTitle());

    }

}
