package Com.tesringacdemy.Base;

import Com.tesringacdemy.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest
{

    @BeforeMethod
    public void setUp()
    {
        DriverManager.init();
    }

    public String getText(WebElement by)
    {
        return by.getText();
    }
    
    @AfterTest
    public void tearDown()
    {
        DriverManager.down();
    }
}
