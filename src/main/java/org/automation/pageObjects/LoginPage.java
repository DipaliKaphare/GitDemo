package org.automation.pageObjects;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.automation.utils.ExcelFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LoginPage {

    WebDriver driver;

    By lgBttn;
    By emlTxtbx;
    By pwdTxtbx;

    By invlCredBx;



    By NtfBx;
    By NThksBttn;



    By lgImg;

    public LoginPage(WebDriver driver) throws IOException {
        this.driver = driver;
        webElements();
    }

    public void webElements() throws IOException {
        setLgBttn(By.xpath(ExcelFileReader.readExcel(getClass().getSimpleName(),1,1)));
        setEmlTxtbx(By.xpath(ExcelFileReader.readExcel(getClass().getSimpleName(),2,1)));
        setPwdTxtbx(By.xpath(ExcelFileReader.readExcel(getClass().getSimpleName(),3,1)));
        setLgImg(By.xpath(ExcelFileReader.readExcel(getClass().getSimpleName(),4,1)));
        setInvlCredBx(By.xpath(ExcelFileReader.readExcel(getClass().getSimpleName(),5,1)));
        setNtfBx(By.xpath(ExcelFileReader.readExcel(getClass().getSimpleName(),6,1)));
        setNThksBttn(By.xpath(ExcelFileReader.readExcel(getClass().getSimpleName(),7,1)));
    }

    public WebElement getLgBttn() {
        return driver.findElement(lgBttn);
    }

    public void setLgBttn(By lgBttn) {
        this.lgBttn = lgBttn;
    }

    public WebElement getEmlTxtbx() {
        return driver.findElement(emlTxtbx);
    }

    public void setEmlTxtbx(By emlTxtbx) {
        this.emlTxtbx = emlTxtbx;
    }

    public WebElement getPwdTxtbx() {
        return driver.findElement(pwdTxtbx);
    }

    public void setPwdTxtbx(By pwdTxtbx) {
        this.pwdTxtbx = pwdTxtbx;
    }

    public WebElement getLgImg() {
        return driver.findElement(lgImg);
    }

    public void setLgImg(By lgImg) {
        this.lgImg = lgImg;
    }

    public WebElement getInvlCredBx() {
        return driver.findElement(invlCredBx);
    }

    public void setInvlCredBx(By invlCredBx) {
        this.invlCredBx = invlCredBx;
    }

    public WebElement getNtfBx() {
        return driver.findElement(NtfBx);
    }

    public void setNtfBx(By ntfBx) {
        NtfBx = ntfBx;
    }

    public WebElement getNThksBttn() {
        return driver.findElement(NThksBttn);
    }

    public void setNThksBttn(By NThksBttn) {
        this.NThksBttn = NThksBttn;
    }

}
