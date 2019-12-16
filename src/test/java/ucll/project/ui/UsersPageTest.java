package ucll.project.ui;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class UsersPageTest {

    private static WebDriver driver;


    @Before
    public void SetupDriver() {
        // Setup the Firefox driver for the whole class
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
    public void VisitUsersPageTest() {
        driver.get(Config.BASE_URL);
        WebElement link = driver.findElement(By.xpath("//a[text() = 'Users']"));
        link.click();
        assertEquals("All users", driver.getTitle());

    }

}
