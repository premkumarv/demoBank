package com.tnea.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.tnea.tesBase.testBase;


public class Checking  extends testBase{
	
	
	@Test(priority =0)
	
	public void addCustomer() throws InterruptedException{
		
		//Select collegeList = new Select (driver.findElement(By.xpath(OR.getProperty("collegelist"))));
		
		//collegeList.selectByVisibleText("JAYA INSTITUTE OF TECHNOLOGY");
		
		driver.findElement(By.xpath(OR.getProperty("bankerbutton"))).click();
		
		driver.findElement(By.xpath(OR.getProperty("addcustomer"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("firsName"))).sendKeys("PREM");
		
		driver.findElement(By.xpath(OR.getProperty("lastName"))).sendKeys("KUMAR");
		
		driver.findElement(By.xpath(OR.getProperty("postCode"))).sendKeys("600099");
		
		
		driver.findElement(By.xpath(OR.getProperty("addCustomerBtn"))).click();
		
		
		
	}
	
	@Test(priority =1)
	public void accountCreatedAlert(){
	
		driver.switchTo().alert().accept();
	}
	
	@Test(priority =2)
	public void openCustomer(){
		
		driver.findElement(By.xpath(OR.getProperty("openAccount"))).click();
		Select customerSelect = new Select (driver.findElement(By.xpath(OR.getProperty("customerSelect"))));
	           customerSelect.selectByVisibleText("PREM KUMAR");	
	           
	     Select currencySelect = new Select (driver.findElement(By.xpath(OR.getProperty("currencySelect"))));
	     currencySelect.selectByVisibleText("Dollar");	      
	     
	     driver.findElement(By.xpath(OR.getProperty("processClick"))).click();
	           
		
	}
	
	@Test(priority =3)
	public void accountOpenedAlert(){
	
		driver.switchTo().alert().accept();
	}
	
	@Test(priority =4)
	public void deleteAccount() throws InterruptedException{
		driver.findElement(By.xpath(OR.getProperty("customer"))).click();
		driver.findElement(By.xpath(OR.getProperty("cusText"))).sendKeys("Harry");
		Thread.sleep(5000);
		String actualfirstName = "Harry";
		String actuallastName  ="Potter";
		Thread.sleep(5000);
		String findFirstName =driver.findElement(By.xpath(OR.getProperty("cuFirstName"))).getText();
		String findSecondName =driver.findElement(By.xpath(OR.getProperty("cuSecondName"))).getText();
		if (findFirstName.equalsIgnoreCase(actualfirstName )&& findSecondName.equalsIgnoreCase(actuallastName)){
			
			System.out.println("yes harry potter is correct");
			
			driver.findElement(By.xpath(OR.getProperty("cuDelete"))).click();
			driver.findElement(By.xpath(OR.getProperty("home"))).click();
			Thread.sleep(5000);
			
		}
		
		
	}
	
	

}
