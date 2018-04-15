import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/radio.html";
		driver.get(baseUrl);

		WebElement chkIfPersist = driver.findElement(By.id("vfb-6-0"));
		for (int i = 0; i < 2; i++) {
			chkIfPersist.click();
			System.out.println(chkIfPersist.isSelected());
		}
		
		chkIfPersist.click();
		System.exit(0);
	}

}
