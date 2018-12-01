import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class AppTest {

	public static void main(String[] args) {
		AppTest obj = new AppTest();
		obj.login();

	}
	
	@Test
	public void login() {
		final String baseURL = "https://katalon-demo-cura.herokuapp.com";
		//System.setProperty("webdriver.chrome.driver", "src/test//resources//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "src/test//resources//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.ie.driver", "src/test//resources//.exe" );
		//WebDriver driver = new InternetExplorerDriver();
		
		//System.setProperty("webdriver.edge.driver", "src/test//resources//MicrosoftWebDriver.exe" );
		//WebDriver driver = new EdgeDriver();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(baseURL);

		driver.findElement(By.xpath("//*[@id=\"btn-make-appointment\"]")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}
}