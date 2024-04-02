package Databinding.volza.com;

import org.testng.annotations.Test;

public class Global_Trade_data_Test 
{
     Global_Trade_data ob = new Global_Trade_data();
     
     @Test
     public void lunchurl ()
 	{
 		try {
 			
 			ob.lunchurl();
 			
 			
 		} 
 		catch (Exception e) {
 			
 			System.out.println("Expection is lunchur" + e);
 		}
    
 	}
     
     
    
}

