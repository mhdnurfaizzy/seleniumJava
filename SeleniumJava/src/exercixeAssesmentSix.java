import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class exercixeAssesmentSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//select checkbox
		driver.findElement(By.xpath("//label[normalize-space()='Option1']")).click();
		System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Option1']")).getText());
		
		//save 
		WebElement option= driver.findElement(By.xpath("//label[normalize-space()='Option1']"));
		
		//choose dropdown by selected checkbox
		driver.findElement(By.id("dropdown-class-example")).click();
		
	}

}
