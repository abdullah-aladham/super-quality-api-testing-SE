package user_membership_test_suite_By_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
/*in this Test Case we're attempting to login with email and password 
	with remember me checkbox
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//opens the chrome window and maximizes it
		driver.get("http://www.superquality.me//Account/Login?ReturnUrl=%2FBackend");
		driver.findElement(By.id("Email")).sendKeys("test@test.com");
		driver.findElement(By.id("Password")).sendKeys("123456789jfjf");
		driver.findElement(By.id("EmailLogin")).click();
		
		}

}
/*
Lets work together ❤️😊👇
Linkedin:
 https://www.linkedin.com/in/abdullah-aladham/
upwork:
https://www.upwork.com/freelancers/~01ca51ad621ece9a78
Freelancer:
https://www.freelancer.com/u/Abdullahadham
mostaql:
https://mostaql.com/u/Abdullah_Adham

*/
