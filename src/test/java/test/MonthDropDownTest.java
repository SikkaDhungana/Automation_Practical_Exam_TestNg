package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import page.MonthDropDownPage;
//import page.NssTodoListPage;
import util.BrowserFactory;

public class MonthDropDownTest {
	static WebDriver driver;

	@Test
	public void monthDropDown() {
		driver = BrowserFactory.init();

		MonthDropDownPage monthDropDownPage = PageFactory.initElements(driver, MonthDropDownPage.class);
		monthDropDownPage.monthDropDown();
	}

}
