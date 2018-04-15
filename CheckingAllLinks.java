import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/newtours/";

		String underConstruction = "Under Construction: Mercury Tours";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);

		List<WebElement> linkElements = driver.findElements(By.tagName("a"));

		String[] linkTexts = new String[linkElements.size()];

		int i = 0;

		for (WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			i++;
		}

		for (String t : linkTexts) {
			driver.findElement(By.linkText(t)).click();
			if (driver.getTitle().equals(underConstruction)) {
				System.out.println("\"" + t + "\"" + " is under construction.");
			} else {
				System.out.println("\"" + t + "\"" + " is working.");
			}
			driver.navigate().back();
		}
		driver.quit();
		System.exit(0);
	}

}
