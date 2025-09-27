package Com.tesringacdemy.tests.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {

    @Parameters("Browser")
    @Test
    public void test(String browser_name) {
        System.out.println("Parameter value is " + browser_name);
        WebDriver driver = null;

        if (browser_name.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--guest");
            driver = new ChromeDriver(options);

        } else if (browser_name.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--guest");
            driver = new EdgeDriver(options);
        }

        driver.get("https://www.google.com");
        System.out.println("Title is: " + driver.getTitle());

        driver.quit();
    }
}
