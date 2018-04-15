import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.facebook.com/";
		String tagName = "";

		driver.get(baseUrl);
		tagName = driver.findElement(By.id("u_0_j")).getTagName();
		System.out.println(tagName);
		driver.close();
		System.exit(0);
	}

}
