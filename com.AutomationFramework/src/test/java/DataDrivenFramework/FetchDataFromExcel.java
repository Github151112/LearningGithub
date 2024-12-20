package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

public class FetchDataFromExcel {
	static WebDriver driver;
	static String path = "./src/test/resources/Login.xlsx";
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String username = Flib.getDataFromExcel(path,"LoginData", 1, 0);
		String password = Flib.getDataFromExcel(path,"LoginData", 1, 1);
		System.out.println(username);
		System.out.println(password);
		
		Flib.implicitWait(driver, 20);
		
		
	}
	
	

}
