import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		//Verify broken link by status code 
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		SoftAssert a= new SoftAssert();
		for(WebElement link : links)
		{
			String url = link.getAttribute("href");
			
			HttpURLConnection  conn=(HttpURLConnection)new URL (url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400, "The link with text "+link.getText()+ "is broken with response code " + respCode);
		
		}
		
		a.assertAll();
		
		
		
		
		
		
		
		
		

	}

}
