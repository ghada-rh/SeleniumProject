package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stoufa\\Desktop\\FormationSelenium\\chromedriver.exe");
		 
		//Open Chrome 
		WebDriver driver = new ChromeDriver();
		
		//Open Application OrangeHRM
		driver.get("https://demoqa.com/menu/");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement mousehover = driver.findElement(By.xpath("/*[@id=\\\"nav\\\"]/li[2]/a"));
		actions.moveToElement(mousehover).perform();
		
		//driver.quit();

	}

}
