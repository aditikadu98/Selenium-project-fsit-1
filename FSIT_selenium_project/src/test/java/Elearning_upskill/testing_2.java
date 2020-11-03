package Elearning_upskill;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testing_2 {

	WebDriver driver;

	// Launching the Firefox browser

	public void LaunchBrowser() {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://elearning.upskills.in/");
	}

	public void test1() throws InterruptedException {
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		driver.findElement(By.id("form-login_submitAuth")).click();

		// Click on create a source link
		driver.findElement(By
				.xpath("/html/body/main/section/div/div[2]/div/section/section[1]/div[2]/div/div[2]/div[2]/ul/li[2]/a"))
				.click();

		// 2.Enter valid credential course name text box
		driver.findElement(By.id("update_course_title")).sendKeys("Selenium_ad");
		// 5.
		driver.findElement(By.id("visual_code")).sendKeys("SELENIUM16");
		// 4.
		driver.findElement(By
				.xpath("/html/body/main/section/div/div[2]/div/section/form/fieldset/div[3]/div[1]/div/button/div/div"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/main/section/div/div[2]/div/section/form/fieldset/div[3]/div[1]/div/div/div[2]/ul/li[4]/a"))
				.click();
		//
		driver.findElement(By.id("department_name")).sendKeys("Computer");
		// 6.
		driver.findElement(By.xpath(
				"/html/body/main/section/div/div[2]/div/section/form/fieldset/div[7]/div[1]/div/button/span/span"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/main/section/div/div[2]/div/section/form/fieldset/div[7]/div[1]/div/div/div[2]/ul/li[6]/a"))
				.click();

		// 7
		driver.findElement(By.id("update_course_submit")).click();
		Thread.sleep(2000);
		// select selenium title
		driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/form/div/table/tbody/tr[19]/td[2]"))
				.click();
		// click on course home

		driver.findElement(
				By.xpath("/html/body/main/section/div/div[2]/div/section/form/div/table/tbody/tr[5]/td[8]/a[2]/img"))
				.click();

		// 11.
		driver.findElement(By.id("\"istooldesc_12623\"")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		testing_2 obj_1 = new testing_2();
		obj_1.LaunchBrowser();
		obj_1.test1();
		// obj.closeBrowser();
	}
}
