package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Automation{
	public static void main(String[]args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\Edge webdriver\\msedgedriver.exe");
		//EdgeOptions options = new EdgeOptions();
		//options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver();
		String url = "https://testautomationpractice.blogspot.com/";
		driver.get(url);
		driver.manage().window().maximize();
		// Enter name
		driver.findElement(By.cssSelector("input[id$='name']")).sendKeys("Muneer");
		//enter Email
		driver.findElement(By.cssSelector("#email")).sendKeys("Muneershaik.marolix@gmail.com");
		//enter phone
		driver.findElement(By.cssSelector("#phone")).sendKeys("9866875756");
		//address
		driver.findElement(By.xpath("//textarea[@id='textarea]")).sendKeys("hyderabad");
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		//gender male
		driver.findElement(By.id("male")).click();
		List<WebElement> tag= driver.findElements(By.cssSelector("input[value$='day']"));
		for (int i=0;i<tag.size();i++) {
		tag.get(i).click();
		//break;
		}

		
	}
}
