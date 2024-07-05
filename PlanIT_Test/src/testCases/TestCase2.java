/**
 * 
 */
package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert.*;

import java.time.Duration;

import org.junit.Assert;



/**
 * 
 */
public class TestCase2 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PlanIT_Test\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://jupiter.cloud.planittesting.com");
		
		WebElement contactPage = driver.findElement(By.xpath("//*[@id=\"nav-contact\"]"));
		contactPage.click();
		
		Thread.sleep(3000);
		
		int count;
		
		for (count = 1; count <=5; count++) {
		
		WebElement forename = driver.findElement(By.xpath("//*[@id=\"forename\"]"));
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement message = driver.findElement(By.xpath("//*[@id=\"message\"]"));
		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[2]/div/form/div/a"));
			
		forename.sendKeys("Pyro");
		email.sendKeys("pyromoseley@gmail.com");
		message.sendKeys("Hello World!");
		submitBtn.click();
		
		Thread.sleep(10000);
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div")));
		WebElement success = driver.findElement(By.xpath("/html/body/div[2]/div/div"));
		String successMsg =success.getText();
		
		Assert.assertEquals(successMsg, "Thanks Pyro, we appreciate your feedback.");
		
		WebElement backBtn = driver.findElement(By.xpath("/html/body/div[2]/div/a"));
		backBtn.click();
		
		}
		

	}

}
