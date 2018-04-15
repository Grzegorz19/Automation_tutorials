import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://jsbin.com/osebed/2";

		driver.get(baseUrl);

		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Grape");
		fruits.selectByIndex(1);
		fruits.deselectByVisibleText("Grape");

		System.exit(0);
	}

}
