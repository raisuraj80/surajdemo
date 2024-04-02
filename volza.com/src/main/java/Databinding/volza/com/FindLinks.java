package Databinding.volza.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BaseLibary.BaseLibary;

public class FindLinks extends BaseLibary
{

	public FindLinks ()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void bblink()
	{
	try {
	List<WebElement> webelementsList	=driver.findElements(By.tagName("a"));
	int linknumber = webelementsList.size();
	System.out.println(linknumber);
	} 
	
	catch (Exception e)
	
	
	{
		System.out.println("Issue in bblink " + e);
	}	
		
	}
	
	
}
