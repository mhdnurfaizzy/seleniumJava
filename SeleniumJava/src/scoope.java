import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class scoope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		//1. get all link on page
		driver.get("https://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. limiting get all link 
		WebElement footer= driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//2. count link on each colomn
		WebElement colomnDriver=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(colomnDriver.findElements(By.tagName("a")).size());
		
		//3. click each link on a colomn
		for(int i=1;i<colomnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLinkColomn=Keys.chord(Keys.CONTROL, Keys.ENTER);
			colomnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkColomn);
			Thread.sleep(2000);
			
		}
		
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
			
		

	}

}
