package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		 
		//Open Chrome 
		WebDriver driver = new ChromeDriver();
		
		//Open Application OrangeHRM
		driver.get("http://demo.guru99.com/test/upload/");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Actions actions = new Actions(driver);
		WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
		uploadFile.sendKeys("C:\\Users\\stoufa\\Desktop\\cv\\s7s.jpg");
		
		driver.findElement(By.id("terms")).click();
		
		//driver.quit();


	}

}
