package com.meesho.man;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public  class Menswear {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.edge.driver", "D:\\Edge webdriver\\msedgedriver.exe");
		//EdgeOptions options = new EdgeOptions();
		//options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/meesho.com/");
		WebElement menCategory = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		menCategory.click();
		Thread.sleep(3000);
		WebElement menCategory1 = driver.findElement(By.xpath("//p[contains(text(),'Shirts')]"));
		menCategory1.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(text(),'Trendy Designer Men Shirts')]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
