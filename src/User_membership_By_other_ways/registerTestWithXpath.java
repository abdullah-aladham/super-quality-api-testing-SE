package User_membership_By_other_ways;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class registerTestWithXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();//opens the chrome window and maximizes it
		driver.get("http://www.superquality.me/Backend/Organizations/SelfRegister");
		driver.findElement(By.xpath("//input[@placeholder='أسم الشركة']")).sendKeys("Store name");
		driver.findElement(By.xpath("//textarea[@placeholder='وصف عمل الشركة']")).sendKeys("just a test object");
		driver.findElement(By.xpath("//input[@placeholder='أسم الشخص المخول']")).sendKeys("john doe");
		driver.findElement(By.xpath("//input[@placeholder='رقم الشخص المخول']")).sendKeys("+1123456789");
		driver.findElement(By.xpath("//input[@placeholder='إيميل الشخص المخول']")).sendKeys("john@doe.com");
		driver.findElement(By.xpath("//button[@title='أختر دولة']")).click();
		driver.findElement(By.xpath("//*[@id=\"Country\"]/div/div[1]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//button[@title='أختر فئة']")).click();
		driver.findElement(By.xpath("//*[@id=\"Industries\"]/div/div[1]/div/ul/li/a")).click();
		driver.findElement(By.xpath("//span[@class='switchery']")).click();
//		driver.findElement(By.cssSelector("button[class='Submit Request]"));
		
		

		//driver.close();




	}

}
