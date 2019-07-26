package tracy_groupid_withste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MarvelContactPage {

    static WebDriver driver = new FirefoxDriver();
    static WebElement element;


    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "geckodriver");

        driver.get("https://marvelapp.com/contact-us");

        driver.manage().window().maximize();

        element = driver.findElement(By.name("name"));

        element.click();

        element.sendKeys("Tracy");

        //git driver.close();


    }


}
