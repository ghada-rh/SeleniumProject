package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		//lehné badalt lpath mta3 driver khater ldriver eli fl projet version mte3ou ghalta ki 7abit nfaskhou wnajouti ldriver jdid ma7abch donc khalitou wmchit ldossier win ldriver eli sabitou jdid wcopit lpath w7atitou lena bch mano93odch n3awed projet ekher
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stoufa\\Desktop\\FormationSelenium\\chromedriver.exe");
		 
		//Open Chrome 
		WebDriver driver = new ChromeDriver();
		
		//Open Application OrangeHRM
		driver.get("https://demoqa.com/alerts");
		
		//Maximize browser
		driver.manage().window().maximize();
				
		driver.findElement(By.id("alertButton")).click();
		
		//Accept alert
		driver.switchTo().alert().accept();
		
		//driver.quit();

	}

}
