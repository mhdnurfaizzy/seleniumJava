import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class javaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
//		click on colomn
		driver.findElement(By.xpath("//tr/th[1]")).click();
//		capture all element into a list the page
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
//		capture of all text into new(original) list
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
//		sort on the original list of step 3 -> list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
//		compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		
		//Stream Mapper
		//scan the colomn with getText Beans-> print the price
		
		List<String> price;
		do
		{
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s->s.getText().contains("Banana")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
		
			if(price.size()<1);
			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
			
		}while(price.size()<1);

	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return priceValue;
	}

}
