package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stoufa\\Desktop\\FormationSelenium\\chromedriver.exe");
		 
		//Open Chrome 
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		//Open Application OrangeHRM
		driver.get("http://demoqa.com/buttons");
		//Maximize browser
		driver.manage().window().maximize();
		
		//instantiate action class
		Actions actions = new Actions(driver);
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		//or WebElement btnDoubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		//or WebElement btnDoubleClick = driver.findElement(By.xpath("//button[contains(text(), 'Double Click Me')]"));
		
		actions.doubleClick(btnDoubleClick).perform();
		
		//Storage and compare
		String doubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertTrue(doubleClickMessage.contains("You have done a double click"));
		
		//kill browser
		//driver.quit();
				
				
		

	}

}
