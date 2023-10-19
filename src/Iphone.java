import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Iphone{
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\Edge webdriver\\msedgedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		List<WebElement> dropdown = driver.findElements(By.xpath("//div[@role='button']//span"));
		System.out.println(dropdown.size());
		for (WebElement list : dropdown) {
		System.out.println(list.getText());
			
			if (list.getText().contains("13 pro")) {
				list.click();
				break;
			}
		}
	}
}

