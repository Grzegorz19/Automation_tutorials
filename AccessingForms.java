import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingForms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");

		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("passwd"));
		WebElement button = driver.findElement(By.id("SubmitLogin"));

		email.clear();
		password.clear();

		email.sendKeys("jasiu@wp.pl");
		password.sendKeys("jasiek23943");
		button.submit();

		System.exit(0);
	}

}
