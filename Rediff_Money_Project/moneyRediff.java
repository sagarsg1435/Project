package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class moneyRediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Testing\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://portfolio.rediff.com/portfolio-login");
		
		WebElement uname = driver.findElement(By.id("useremail"));
//		uname.sendKeys("kavitakhajure606@gmail.com");
		uname.sendKeys("sagarsg1435@gmail.com");
		
//		driver.findElement(By.id("userpass")).sendKeys("Kavita@2508");
		
		driver.findElement(By.id("userpass")).sendKeys("Sagar@123");
		driver.findElement(By.id("loginsubmit")).click();
		
		driver.findElement(By.id("createPortfolio")).click();
		driver.findElement(By.id("create")).sendKeys("Large Cap");


	}

}
