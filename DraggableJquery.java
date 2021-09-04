package week5day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DraggableJquery {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		https://jqueryui.com/draggable

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().frame(0);

		WebElement source = driver.findElement(By.id("draggable"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions builder = new Actions(driver);

		builder.dragAndDropBy(source, 100, 100).perform();

	}

	}


