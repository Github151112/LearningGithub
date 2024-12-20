package DataDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import LaunchBrowser.ChromeBrowser;

public class FetchingDataFromPropperty {
	static String path = "./src/test/resources/CommanData.properties";
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		String browser = Flib.getDataFromProperty(path, "browser");
		String url = Flib.getDataFromProperty(path, "url");
		if (browser.equals("chrome"))
			driver = new ChromeDriver();
		else if (browser.equals("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equals("edge"))
			driver = new EdgeDriver();
		else
			System.out.println("Invalid browser");
		driver.manage().window().maximize();
		driver.get(url);

	}
}
