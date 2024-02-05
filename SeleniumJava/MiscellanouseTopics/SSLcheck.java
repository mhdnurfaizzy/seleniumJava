import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SSLcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeOptions options = new EdgeOptions();
		Proxy proxy = new Proxy();
		
		//Setup Proxy
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		//Setup download opt
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new EdgeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
