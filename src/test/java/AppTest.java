import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest {

	public static void main(String[] args) {
		AppTest obj = new AppTest();
		obj.login();

	}
	
	public void login() {
		final String baseURL = "https://katalon-demo-cura.herokuapp.com";
		System.setProperty("webbriver.gecko.driver", "/SeleniumLearning/src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);

		driver.findElement(By.xpath("//*[@id=\"btn-make-appointment\"]")).click();
		System.out.println(driver.getTitle());
	}
}