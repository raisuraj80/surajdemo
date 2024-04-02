package Databinding.volza.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibary.BaseLibary;

/**
 * Hello world!
 *
 */
public class Global_Trade_data extends BaseLibary


{
		
	public Global_Trade_data()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//@FindBy(xpath = "//ul[@class = 'text-left header-item-pos header link-hover-disable nav']//li[@class='nav-item']//div/a[@class='set-header-fs-fw nav-link']")
	
	@FindBy(xpath="//a[@class='set-header-fs-fw nav-link']//span[contains(text(),'Pricing')]")
	private WebElement Pricing;
	
	@FindBy(xpath = "//div[@class='react-tags__search-input']//input")
	private WebElement SearchBar;
	
	@FindBy(xpath = "//button[@class='btn-default background-color-blue new-search-btn']") 
	private WebElement SearchButton;
	
	public void lunchurl ()
	{
		try {
			
			Get_Url("https://databinding.volza.com/");
			Thread.sleep(5000);
			
			SearchBar.sendKeys("Brass");
			Thread.sleep(5000);
			//doubleclick(SearchButton);
			SearchButton.click();
			Thread.sleep(1000);
			SearchButton.click();
			//String pp = Pricing.getText();
			//System.out.println(pp);
			} 
		catch (Exception e) {
			
			System.out.println("Expection is lunchurl" + e);
			}
	}
		
		

	

	
	
	
}
