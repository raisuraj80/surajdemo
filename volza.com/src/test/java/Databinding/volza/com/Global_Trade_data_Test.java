package Databinding.volza.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Global_Trade_data_Test 
{
     Global_Trade_data ob = new Global_Trade_data();
     
     @Test(priority = 1)
     public void lunchurl ()
 	{
 		try {
 			
 			ob.lunchurl();
 			
 		}
 		
 		catch (Exception e) {
 			
 			System.out.println("Expection is lunchur" + e);
 		}
    
 	}
     
     @Test(priority = 2)
     public void bblink()
		{
		try 
		{	
			ob.bblink();
		} 
		
		catch (Exception e)
		
		
		{
			System.out.println("Issue in bblink " + e);
		}	
			
		}
     
     
    
}

