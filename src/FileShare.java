import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FileShare{

	public static void main(String[] args) throws Throwable {
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.filemail.com/share/upload-file");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.findElement(By.id("addBtn")).click();
    Robot fl=new Robot();
    fl.delay(3000);
    StringSelection path=new StringSelection("C:\\Users\\Admin\\Downloads\\9 tips for writing good test cases.pdf\\");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
    fl.keyPress(KeyEvent.VK_CONTROL);
    fl.keyPress(KeyEvent.VK_V);

    fl.keyRelease(KeyEvent.VK_CONTROL);
    fl.keyRelease(KeyEvent.VK_V);

    fl.keyPress(KeyEvent.VK_ENTER);
    fl.keyRelease(KeyEvent.VK_ENTER);
	}

}