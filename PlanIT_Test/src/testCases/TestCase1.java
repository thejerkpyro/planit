/**
 * 
 */
package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert.*;
import org.junit.Assert;



/**
 * 
 */
public class TestCase1 {

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
		
		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[2]/div/form/div/a"));
		submitBtn.click();
		
		WebElement errorHeader = driver.findElement(By.xpath("//*[@id=\"header-message\"]/div"));
		String headerError = errorHeader.getText();

		WebElement errorForename = driver.findElement(By.xpath("//*[@id=\"forename-err\"]"));
		String forenameError = errorForename.getText();
		
		WebElement errorEmail = driver.findElement(By.xpath("//*[@id=\"email-err\"]"));
		String emaileError = errorEmail.getText();

		WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"message-err\"]"));
		String messageeError = errorMessage.getText();
		
		Assert.assertEquals(headerError,"We welcome your feedback - but we won't get it unless you complete the form correctly.");
		Assert.assertEquals(forenameError,"Forename is required");
		Assert.assertEquals(emaileError,"Email is required");
		Assert.assertEquals(messageeError,"Message is required");
		
		WebElement forename = driver.findElement(By.xpath("//*[@id=\"forename\"]"));
		forename.sendKeys("Pyro");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("pyromoseley@gmail.com");
				
		WebElement message = driver.findElement(By.xpath("//*[@id=\"message\"]"));
		message.sendKeys("Hello World!");
		
		try {
			errorHeader.isDisplayed();
			errorForename.isDisplayed();
			errorEmail.isDisplayed();
			errorMessage.isDisplayed();
			
		}
		catch(Exception e){
		System.out.println("Errors are now gone.");	
		}
		

	}

}
