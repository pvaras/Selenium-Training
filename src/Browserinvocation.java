import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "/Users/patrickvaras/Downloads/chromedriver");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");

	}

}
