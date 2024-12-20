package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutonmateLikeFunctionality {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys("hgvvdchuads");
		lp.getPasswordTextField().sendKeys("djcsjdhc");
		lp.getLoginButton().click();
		
	}

}
