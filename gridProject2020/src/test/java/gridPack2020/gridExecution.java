package gridPack2020;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gridExecution {

	//@Test
	public void parallel_Gridexecution() throws MalformedURLException {

		//Desired capabilities sets the properties,on which browser/which OS test gets executed
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		//WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444/wd/hub"),dc);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		
	}
}