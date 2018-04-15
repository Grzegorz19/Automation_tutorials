import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingByImageLink {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");

		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);

		driver.findElement(By.cssSelector("a[title=\"PrzejdŸ na stronê g³ówn¹ Facebooka\"]")).click();
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Facebook – zaloguj siê lub zarejestruj")) {
			System.out.println("We are back again on homepage");
		} else {
			System.out.println("We are NOT back again in FB homepage");
		}

		driver.close();
	}

}
