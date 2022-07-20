package WebElements;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WE {
	public WebDriver driver;
	@Test
	public void chromePage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");
	
	driver = new ChromeDriver();
	driver.navigate().to("https://sda.edu.sa/ar/partners/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement rr = driver.findElement(By.name("email"));
	rr.sendKeys("5000000");
	Thread.sleep(3000);
	
	WebElement aa = driver.findElement(By.cssSelector("button"));
	aa.submit();
	Thread.sleep(3000);
	
    driver.findElement(By.id("remember")).click();	
	Thread.sleep(3000);

	
    driver.findElement(By.partialLinkText("المرور")).click();	
	Thread.sleep(3000);

//	WebElement bb = driver.findElement(By.linkText("هل نسيت كلمة المرور ؟"));
//	bb.click();
	Thread.sleep(5000);

//	
	driver.close();

	}
}
