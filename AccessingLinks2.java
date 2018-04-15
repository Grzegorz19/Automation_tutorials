import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingLinks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);

		String linkText = driver.findElement(By.partialLinkText("egis")).getText();
		System.out.println(linkText);
		linkText = driver.findElement(By.partialLinkText("EGIS")).getText();
		System.out.println(linkText);

		driver.quit();

		System.exit(0);
	}

}
