import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/patrickvaras/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.xpath("//*[@id='gb_70']")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("varaspj@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("SnoopyCunt");
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		
		//driver.findElement(By.xpath("//*[@id="p_lt_ctl11_pageplaceholder_p_lt_ctl01_LogIn_txtPassword"]")).sendKeys("amandav3");
		//driver.findElement(By.xpath("//*[@id='p_lt_ctl11_pageplaceholder_p_lt_ctl01_LogIn_btnSubmit']")).click();
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		//driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.findElement (By.xpath("//*@id=pwd-remind")).click();
		

	}

	private static By ByXPath() {
		// TODO Auto-generated method stub
		return null;
	}

	private static By ByXPath(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}