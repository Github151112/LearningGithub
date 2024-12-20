package learningTestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNg {

	@Test(dependsOnMethods = "register")
	public void login() {
		Reporter.log("Login test script executed sucessfully", true);

	}

	@Test()
	public void register() {
		Reporter.log("register test script executed sucessfully", true);
	}

	@Test(enabled = false)
	public void addToCart() {
		Reporter.log("add to cart test script executed sucessfully", true);
	}

}
