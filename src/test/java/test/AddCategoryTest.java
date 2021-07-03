package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import page.MonthDropDownPage;
//import page.NssTodoListPage;
import util.BrowserFactory;

public class AddCategoryTest {
	static WebDriver driver;

	@Test
	public void UserShouldBeAbleToAddCategory() {
		driver = BrowserFactory.init();
		
		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
		addCategoryPage.addCategory("Automation");
		addCategoryPage.userNotAbleToAddDuplicateCategory ("Automation");
	}
	
	
	
}
