package user_membership_test_suite_By_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterationTest {

	public static void main(String[] args) {//Data in fields are for testing purpose you can add yours 
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//opens the chrome window and maximizes it
		driver.get("http://www.superquality.me/Backend/Organizations/SelfRegister");
		driver.findElement(By.id("Name")).sendKeys("Test Company#1");
		driver.findElement(By.id("Description")).sendKeys("This is Test");
		driver.findElement(By.id("AdminName")).sendKeys("TC_Admin");
		driver.findElement(By.id("AdminPhoneNumber")).sendKeys("+970123456789");
		driver.findElement(By.id("Email")).sendKeys("test1@test.com");
	}

}
