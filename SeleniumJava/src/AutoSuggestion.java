import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
			
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class*='ui-menu-item'] a"));
		System.out.println(driver.findElement(By.xpath("//li/a[text()='Indonesia]")).getText());
				for(WebElement option :options) 
				{
					if(option.getText().equalsIgnoreCase("Indonesia"));
					{
						option.click();
						break;
					}
				}

	}

}
