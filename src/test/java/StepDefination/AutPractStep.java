package StepDefination;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import CommonSteps.CommonStepPract;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutPractStep {
	WebDriver driver;
	
	public AutPractStep(CommonStepPract CommonStepPract) {
		this.driver =CommonStepPract.getDriver();
	}

//@Test
	@Given("I am on automation practice page")
	public void i_am_on_automation_practice_page() {
		 driver.get("https://automationpractice.com/index.php");
		System.out.println("Automation Practice Website is getting opened");
	}

	@When("Ill click on contact us & fill the form")
	public void ill_click_on_contact_us_fill_the_form() throws IOException {
		driver.findElement(By.xpath("//a[@title='Contact Us']")).click(); 
		String ExcelPath= "C:\\Users\\dipali.kaphare\\eclipse-workspace\\AutomationCuPractice\\DataFiles\\Contact Us.xlsx";
		Select DD= new Select (driver.findElement(By.xpath("//select[@id='id_contact']")));
		 DD.selectByVisibleText("Customer service");
		 
		FileInputStream input= new FileInputStream(ExcelPath);
	    XSSFWorkbook  workbook= new XSSFWorkbook(input) ;//We have a class XSSworkbook
	    
	    XSSFSheet sheet=  workbook.getSheetAt(0);
	   //Using for loop
	   
	    int rw = sheet.getLastRowNum();
	    System.out.println(rw);
	    int cols= sheet.getRow(0).getLastCellNum();
	    System.out.println(cols);
//	  
	 
	   for(int r=1;r<=rw;r++) 
	   {
		   for(int c=0;c<=cols;c++) {
			System.out.println(sheet.getRow(r).getCell(c));   
		   }
	   }
	   
	}
	@Then("My form should get submitted successfully")
	public void my_form_should_get_submitted_successfully() {
	  
	}
}
