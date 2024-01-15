import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invoking Browser
		//Chrome - ChromeDriver exten->Methods close get
		//Firefox- FirefoxDriver ->methods close get
		// WebDriver  close  get
		//WebDriver methods + class methods
		// Chrome

//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
//		WebDriver driver = new ChromeDriver(options);



		//Firefox
//		System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");
//		WebDriver driver1 = new FirefoxDriver();
		
		//Microsoft Edge
//		System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		driver.close();
//test

		driver.quit();
	
	
	}

}
