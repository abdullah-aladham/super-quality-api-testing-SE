package superqualitytesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
/*
 * this test case is for opening chrome window and maximizing it */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//opens the chrome window and maximizes it
		driver.get("http://www.superquality.me");

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