package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stoufa\\Desktop\\FormationSelenium\\chromedriver1.exe");
		 
		//Open Chrome 
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		//Open Application OrangeHRM
		driver.get("http://demoqa.com/droppable/");
		
		Actions actions = new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(from, to).perform();
		
		//Verify text changed into Dropped!
		String textTo = to.getText();
		if (textTo.equals("Dropped!")) {
			System.out.println("pass: source is dropped to target as expected");
		}else {
			System.out.println("fail: source couldn't be dropped to target as expected");
		}
		
		//kill browser
		driver.quit();
	}

}
