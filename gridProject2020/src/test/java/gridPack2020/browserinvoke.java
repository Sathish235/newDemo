package gridPack2020;

import org.testng.annotations.Test;

public class browserinvoke {

	@Test
	public void browserSelection() {
		// mvn test -Dbrowser=chrome (syntax :run time execution in CMD window)
		String browserName = System.getProperty("browser"); // Syntax : will help receive it from external (eg:cmd)
		if (browserName.equalsIgnoreCase("chrome")) {
			System.out.println("This is chrome browser");
		} else {
			System.out.println("No browser");
		}
	}
}