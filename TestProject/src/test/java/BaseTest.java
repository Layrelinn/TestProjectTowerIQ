import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import pages.BasePage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static pages.BasePage.getDriver;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(@Optional String browserName) {
        System.out.println("Current browser is : " + browserName);
        System.out.println("Current thread id : " + Thread.currentThread().getId());

        if (browserName == null) {
            browserName = "chrome";
        }

        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability("chrome.switches", Arrays.asList("--incognito"));
            driver = new ChromeDriver(capabilities);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://qa.toweriq.io/sign-in");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        BasePage.setDriverThreadLocal(driver);

    }

    String validEmailAddress = "nuknifakni@biyac.com";
    String validPassword = "qqqqqqQ1";
    String randomNumber = ""+(int)(Math.random()*Integer.MAX_VALUE);


    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        getDriver().quit();
    }
}
