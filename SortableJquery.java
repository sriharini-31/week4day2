package week5day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SortableJquery {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/sortable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));	
		org.openqa.selenium.Point location = item5.getLocation();
		int x = location.getX();
		int y = location.getY();
		Actions builder= new Actions(driver);
		builder.dragAndDropBy(item1,x,y).perform();

	}
}
