package com.tnea.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.tnea.tesBase.testBase;

public class customerLogin  extends testBase{

	@Test(priority = 5)
	public void login(){
	
	
	driver.findElement(By.xpath(OR.getProperty("cusBtn"))).click();
	
	Select yourName = new Select(driver.findElement(By.xpath(OR.getProperty("yourName"))));
	
	yourName.selectByVisibleText("PREM KUMAR");
	
	driver.findElement(By.xpath(OR.getProperty("login"))).click();
	driver.findElement(By.xpath(OR.getProperty("deposit"))).click();
	driver.findElement(By.xpath(OR.getProperty("amount"))).sendKeys("200000");
	driver.findElement(By.xpath(OR.getProperty("depositM"))).click();
	
	
	driver.findElement(By.xpath(OR.getProperty("withdrawl"))).click();
	driver.findElement(By.xpath(OR.getProperty("withdrawlM"))).sendKeys("200");
	driver.findElement(By.xpath(OR.getProperty("withdrawlB"))).click();
	
	}
	
	
	
	
	
}
