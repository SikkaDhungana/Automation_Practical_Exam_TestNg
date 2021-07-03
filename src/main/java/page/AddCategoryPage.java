package page;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCategoryPage {
	WebDriver driver;
	 Set<String> names = new HashSet<String>();
	
	By addCategory = By.cssSelector("input[name='data']");
	 	
		public AddCategoryPage(WebDriver driver) {
			this.driver = driver;
		}
		
		public void addCategory(String category) {
			driver.findElement(addCategory).sendKeys(category);										
		}
		
	public void userNotAbleToAddDuplicateCategory (String category) {
		boolean eleSelected= driver.findElement(addCategory).isDisplayed();
		System.out.println(eleSelected);
		        if (names.contains(category)) {
		            System.out.println( "The category you want to add alresdy exists");    
		        } else {
		            names.add(category);
		        }
		   }	
	}
		
		
		

		 
		

