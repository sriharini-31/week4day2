package week5day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.http://www.leafground.com/pages/sortable.html

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
	    List<WebElement> list = driver.findElements(By.xpath("//ul[@id='sortable']//li"));
	    WebElement target = list.get(0);
	    WebElement dest = list.get(4);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    action.click(target).clickAndHold().moveToElement(dest).moveByOffset(0, 4).release().build().perform();
	}

}


