import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relativeLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		
		//Above
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditbox = driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditbox)).getText());
		
		//Below
		WebElement dateBirth = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateBirth)).click();
		
		//Leftof
		WebElement checkBox = driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkBox)).click();
		
		//rightOf
		WebElement radioClick = driver.findElement(By.cssSelector("#inlineRadio1"));
		driver.findElement(with(By.tagName("label")).toRightOf(radioClick)).click();
		
		
		
	}

}
