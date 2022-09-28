package org.automation.pageObjects;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.automation.selenium.Selenium;
import org.automation.utils.ExcelFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class HomePage extends Selenium {

    WebDriver driver;
    By lgLk;

    public HomePage(WebDriver driver) throws IOException {
        this.driver = driver;
        webElements();
    }

    public void webElements() throws IOException {
        setLgLk(By.xpath(ExcelFileReader.readExcel(getClass().getSimpleName(),1,1)));
    }

    public WebElement getLgLk() {
        return driver.findElement(lgLk);
    }

    public void setLgLk(By lgLk) {
        this.lgLk = lgLk;
    }
}
