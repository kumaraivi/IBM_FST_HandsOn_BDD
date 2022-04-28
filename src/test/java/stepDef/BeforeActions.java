package stepDef;

import java.io.IOException;

import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {
	

	
	@Before
	public static void setUp() throws IOException {
		System.out.println("setting up driver...");
		SeleniumDriver.setUpDriver();
		System.out.println("driver initialized.");

}
}
