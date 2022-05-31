import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opensaucedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Chrome Path
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\ChromePath\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // Invoking Webdriver
		
		driver.get("https://www.saucedemo.com/"); // This is get Method is to get url address
		driver.findElement(By.id("user-name")).sendKeys("standard_user");; // Sending Username
		driver.findElement(By.id("password")).sendKeys("secret_sauce");; // Sending Password
		driver.findElement(By.id("login-button")).click(); // Clicking Login Button
		
		//driver.close(); // It will close the chrome exe extension
		//driver.quit(); // It close all the tabs open by selenium

	}

}
