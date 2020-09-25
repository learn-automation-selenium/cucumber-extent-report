package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static WebDriver driver;

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void launchGoogle() {
		driver.get("https://www.google.co.in/");
	}

	public void searchBoxVisibility() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.isDisplayed();
	}

	public void enterSearchBoxVisibility(String s) throws InterruptedException {
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys(s);
		Thread.sleep(5000);
		driver.quit();
	}

}
