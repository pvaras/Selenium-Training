import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class safaridriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.get("http://www.cnn.com");

	}

}
