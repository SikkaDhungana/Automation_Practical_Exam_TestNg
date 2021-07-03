package page;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonthDropDownPage {
	WebDriver driver;

	By monthDropDown = By.cssSelector("#extra > select:nth-child(3)");

	public MonthDropDownPage(WebDriver driver) {
		this.driver = driver;
	}

	public void monthDropDown() {
		driver.findElement(monthDropDown).click();	
		WebElement dropDown = driver.findElement(monthDropDown);
		Select select = new Select(dropDown);
		List<WebElement> options = select.getOptions();
		ArrayList<String> months = new ArrayList<String>();
		for (WebElement mo: options)
			months.add(mo.getText());
		System.out.println("Current list of months: " + months);
		months.add("Month");
		months.add("Feb");
		months.add("Dec");
		System.out.println("Duplicated months: " + findDuplicates(months));
	}

	public static Set<String> findDuplicates(List<String> listDuplicates) {
		final Set<String> setToReturn = new HashSet<String>();
		final Set<String> set1 = new HashSet<String>();
		for (String myString : listDuplicates) {
			if (!set1.add(myString))
				setToReturn.add(myString);
		}
		System.out.println("Unique months: " + set1);
		return setToReturn;

	}

}
