import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testAtschool {

    public static void main(String[] args) {
        final String email = "kseniyapanshinana@gmail.com";
        final String password = "k9CDIU";
        System.setProperty("webdriver.gecko.driver", "/Users/kseniyapanshina/bin/geckodriver");

        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://uxcrowd.ru/");
            new WebDriverWait(driver, 20)
                    .until(
                            ExpectedConditions.elementToBeClickable(
                                    By.id("header-lk-button")
                            )
                    )
                    .click();

            new WebDriverWait(driver, 20)
                    .until(
                            ExpectedConditions.elementToBeClickable(
                                    By.id("login")
                            )
                    )
                    .sendKeys(email);
            new WebDriverWait(driver, 20)
                    .until(
                            ExpectedConditions.elementToBeClickable(
                                    By.xpath("//input[@name='password']")
                            )
                    )
                    .sendKeys(password);

            new WebDriverWait(driver, 20)
                    .until(
                            ExpectedConditions.elementToBeClickable(
                                    By.className("lk-enter-btn")
                            )
                    )
                    .click();

        } finally {

            driver.quit();
        }
    }
}

