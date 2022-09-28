package org.automation.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Selenium {
    public static Properties prp;
    public static WebDriver driver;

    public static void initialize() throws IOException {
        prp = new Properties();
        FileReader fr = new FileReader("src/test/java/resources/resources.properties");
        prp.load(fr);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(prp.getProperty("baseURL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }


        public static void driverWait(WebElement element){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOf(element));
        }





    }

