package BaseLibary;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class BaseLibary 
{
	//String path = "C:\\Users\\Infodrive-PC\\Desktop";
	//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Infodrive-PC\\\\Desktop");
	public static WebDriver driver = new ChromeDriver();
	@SuppressWarnings("deprecation")
	public void Get_Url(String URL)
	{
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts()
		.implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.close();
		
	}
	
	public  void doubleclick(WebElement ele)
	{
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		
		
	}
	
	
}
