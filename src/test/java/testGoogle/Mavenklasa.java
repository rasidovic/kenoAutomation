package testGoogle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.GooglePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Mavenklasa {
    WebDriver driver;
    @BeforeSuite
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    void nest() throws InterruptedException {
        System.out.println("DJes Veca");
        GooglePage googlePage = new GooglePage(driver);
        googlePage.fillGoogleSearchBar("Jana odvedi me sreco");
        Thread.sleep(2000);
        googlePage.clickSearch();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    void testic(){
        System.out.println("testic");

    }
    @AfterSuite
    void teardown(){
        driver.quit();
    }

}
