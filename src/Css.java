import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/patrickvaras/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.cssSelector("class='email'")).sendKeys("varaspj@gmail.com");
		driver.findElement(By.cssSelector("class='password'")).sendKeys("SnoopyCunt");
		
		
	

	}

}
