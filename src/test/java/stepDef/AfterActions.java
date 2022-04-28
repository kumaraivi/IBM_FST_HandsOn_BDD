package stepDef;

import java.io.IOException;

import io.cucumber.java.After;
import utils.SeleniumDriver;

public class AfterActions {
	

	@After
	public static void setUp() throws IOException {
		System.out.println("Closing driver...");
		SeleniumDriver.tearDown();

}
}
