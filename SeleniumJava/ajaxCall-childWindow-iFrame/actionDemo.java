import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.mi.co.id/id/");
		Actions a= new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//i[@class='micon micon-account shortcut__icon']"));
		
		a.moveToElement(move).contextClick().build().perform();
		a.moveToElement(driver.findElement(By.xpath("//button[@class='mi-btn mi-btn--icon mi-btn--normal mi-btn--light navigation__link']"))).click().keyDown(Keys.SHIFT).sendKeys("Redmi").doubleClick().build().perform();

		//
	}

}
