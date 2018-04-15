import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.facebook.com/";
		driver.get(baseUrl);

		WebElement myElement = driver.findElement(By.name("firstname"));
		myElement.sendKeys("Grzesiek");

		WebElement myElement2 = driver.findElement(By.name("lastname"));
		myElement2.sendKeys("Mirecki");

		WebElement myElement3 = driver.findElement(By.id("u_0_o"));
		myElement3.sendKeys("888932465");

		WebElement myElement4 = driver.findElement(By.id("u_0_v"));
		myElement4.sendKeys("takietam");

		WebElement myElement5 = driver.findElement(By.id("u_0_2"));
		myElement5.click();

		driver.quit();
		System.exit(0);
	}

}
