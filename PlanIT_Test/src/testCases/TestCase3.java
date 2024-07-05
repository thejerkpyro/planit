package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
	
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
		
		WebElement shopPage = driver.findElement(By.xpath("//*[@id=\"nav-shop\"]"));
		shopPage.click();
		
		Thread.sleep(3000);
		
		double frogPrice = 10.99;
		double bunnyPrice = 9.99;
		double bearPrice = 14.99;
		
		double frogTotal;
		double bunnyTotal;
		double bearTotal;
		
		int frogCount;
		int bunnyCount;
		int bearCount;
		
		WebElement frog = driver.findElement(By.xpath("//*[@id=\"product-2\"]/div/p/a"));
		WebElement bunny = driver.findElement(By.xpath("//*[@id=\"product-4\"]/div/p/a"));
		WebElement bear = driver.findElement(By.xpath("//*[@id=\"product-7\"]/div/p/a"));
		
		for (frogCount = 1; frogCount <=2; frogCount ++) {
			frog.click();
			}
		
		for (bunnyCount = 1; bunnyCount <=5; bunnyCount ++) {
			bunny.click();
			}
		
		for (bearCount = 1; bearCount <=3; bearCount ++) {
			bear.click();
			}
		
		WebElement cart = driver.findElement(By.xpath("//*[@id=\"nav-cart\"]"));
		cart.click();
		
		Thread.sleep(3000);
		
		frogTotal = frogPrice * 2;
		bunnyTotal = bunnyPrice * 5;
		bearTotal = bearPrice * 3;
		double totalPrice = frogTotal + bunnyTotal + bearTotal;
		
		String frog1 = driver.findElement(By.xpath("/html/body/div[2]/div/form/table/tbody/tr[1]/td[4]")).getText();
		String bunny1 = driver.findElement(By.xpath("/html/body/div[2]/div/form/table/tbody/tr[2]/td[4]")).getText();
		String bear1 = driver.findElement(By.xpath("/html/body/div[2]/div/form/table/tbody/tr[3]/td[4]")).getText();
		String total1 = driver.findElement(By.xpath("/html/body/div[2]/div/form/table/tfoot/tr[1]/td")).getText();
		
		//System.out.println(total1);
		
		double frog2 = Double.parseDouble(frog1.replaceAll("[\\$]", ""));
		double bunny2 = Double.parseDouble(bunny1.replaceAll("[\\$]", ""));
		double bear2 = Double.parseDouble(bear1.replaceAll("[\\$]", ""));
		double total = Double.parseDouble(total1.replaceAll("Total: ", ""));
		
		System.out.println(totalPrice);
		
		if (frog2 == frogTotal) {
			System.out.println("The total for Stuffed Frog is " + frog2);
		}	
		if (bunny2 == bunnyTotal) {
			System.out.println("The total for Fluffy Bunny is " + bunny2);
		}
		if (bear2 == bearTotal) {
			System.out.println("The total for Valentine Bear is " + bear2);
		}	
		
		
		
		}
		
}
