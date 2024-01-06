package userMembershipByName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//opens the chrome window and maximizes it
		driver.get("http://www.superquality.me//Account/Login?ReturnUrl=%2FBackend");
		driver.findElement(By.name("Email")).sendKeys("test@test.com");
		driver.findElement(By.name("Password")).sendKeys("123456789jfjf");
		driver.findElement(By.id("EmailLogin")).click();
	}

}
