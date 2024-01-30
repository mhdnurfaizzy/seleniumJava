import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		//switch to iframe
//		driver.switchTo().frame(1) Switch iframe by index iframe avail on page
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//div[@id='draggable']")).click();
		
		//drag and drop
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		a.dragAndDrop(source, target).build().perform();
		
		//back to default element
		driver.switchTo().defaultContent();

	}

}
