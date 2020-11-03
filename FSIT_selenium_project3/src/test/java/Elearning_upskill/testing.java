package Elearning_upskill;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testing {

	WebDriver driver;

	// Launching the Fire fox browser

	public void LaunchBrowser() {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://elearning.upskills.in/");
	}

	/*----------------------------------------Test 1-------------------------------------------*/
	@Test(priority = 0) // To verify whether application allows teacher to create a course,add
						// description and objective and topic
	public void test1() throws InterruptedException {
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		driver.findElement(By.id("form-login_submitAuth")).click();
		// 1.
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
		// 5.
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
		// select Selenium title
		driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/form/div/table/tbody/tr[19]/td[2]"))
				.click();
		// click on course home
		driver.findElement(
				By.xpath("/html/body/main/section/div/div[2]/div/section/form/div/table/tbody/tr[5]/td[8]/a[2]/img"))
				.click();
		// 11.
		driver.findElement(By.linkText("Course description")).click();
		// 12.
		driver.findElement(By.xpath("/html/body/main/section/div/div[3]/div/div/div/div/a[1]/img")).click(); //
		// 13.
		driver.findElement(By.id("course_description_title")).sendKeys("Selenium course for beginners !");
		Thread.sleep(10000);
		// test i frame
		driver.switchTo().frame(driver
				.findElement(By.xpath("/html/body/main/section/div/form/fieldset/div[2]/div[1]/div/div/div/iframe")));
		// 14
		driver.findElement(By.xpath("/html/body")).sendKeys("Selenium course for begineers !");
		Thread.sleep(10000);
		driver.switchTo().parentFrame();
		// 15.
		driver.findElement(By.id("course_description_submit")).click(); //
		// 16.
		driver.findElement(By.xpath("/html/body/main/section/div/div[3]/div/div/div/div/a[2]")).click();
		// 17.
		driver.findElement(By.xpath("//*[@id=\"course_description_title\"]")).sendKeys("selenium course for begineer!");
		Thread.sleep(16000);
		driver.switchTo().frame(driver
				.findElement(By.xpath("/html/body/main/section/div/form/fieldset/div[2]/div[1]/div/div/div/iframe")));
		// 18.
		driver.findElement(By.xpath("/html/body")).sendKeys("Selenium course for beginnrs !");
		Thread.sleep(10000);
		driver.switchTo().parentFrame();
		// 19.
		driver.findElement(By.id("course_description_submit")).click();
		// 20.
		driver.findElement(By.xpath("/html/body/main/section/div/div[3]/div/div[1]/div/div/a[3]/img")).click();
		// 21.
		driver.findElement(By.xpath("//*[@id=\"course_description_title\"]"))
				.sendKeys("selenium course for begineers!");
		Thread.sleep(21000);
		driver.switchTo().frame(driver
				.findElement(By.xpath("/html/body/main/section/div/form/fieldset/div[2]/div[1]/div/div/div/iframe")));
		// 22.
		driver.findElement(By.xpath("/html/body")).sendKeys("Selenium course for beginners !");
		Thread.sleep(10000);
		driver.switchTo().parentFrame();
		// 23.
		driver.findElement(By.id("course_description_submit")).click();
		System.out.println("The page title is: " + driver.getTitle());
	}

	/*----------------------------------------Test 2-------------------------------------------*/

	@Test // To verify whether application allows teacher to create the test
	public void test2() throws InterruptedException {
		driver.findElement(By.linkText("podium")).click();
		// 1.
		driver.findElement(By.linkText("Tests")).click();
		System.out.println("The page title is: " + driver.getTitle());
		// 2.
		driver.findElement(By.xpath("/html/body/main/section/div/div[4]/div/a")).click();
		// 3.
		driver.findElement(By.id("exercise_title")).sendKeys("Online Quiz 2");
		// 4.
		driver.findElement(By.id("advanced_params")).click();
		// 5.
		Thread.sleep(15000);
		driver.switchTo().frame(driver.findElement(
				By.xpath("/html/body/main/section/div/form/fieldset/div[3]/div[1]/div[1]/div/div/div/iframe")));
		driver.findElement(By.xpath("/html/body")).sendKeys("Quiz-2");
		Thread.sleep(15000);
		driver.switchTo().parentFrame();
		// 7.
		Thread.sleep(3000);
		driver.findElement(By.name("activate_start_date_check")).click();
		// 8.
		driver.findElement(By.xpath("/html/body/main/section/div/form/fieldset/div[3]/div[13]/div/div[1]/div/span[1]"))
				.click();
		driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/button[2]")).click();
		// 9.
		driver.findElement(By.xpath("//*[@id=\"pass_percentage\"]")).sendKeys("50");
		// 10.
		driver.findElement(By.id("exercise_admin_submitExercise")).click();
		// 11.
		driver.findElement(By.xpath("/html/body/main/section/div/div[6]/div/ul/li[1]/div/a/img")).click();
		// 12.
		driver.findElement(By.id("question_admin_form_questionName")).sendKeys("Which course you are learning ?");
		// 13.
		Thread.sleep(15000);
		driver.switchTo().frame(driver.findElement(
				By.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[1]/td[3]/div/div/div/iframe")));
		driver.findElement(By.xpath("/html/body")).sendKeys("Selenium");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		// 14.
		driver.switchTo().frame(driver.findElement(
				By.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[2]/td[3]/div/div/div/iframe")));
		driver.findElement(By.xpath("/html/body")).sendKeys("Java");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		// 15.
		driver.switchTo().frame(driver.findElement(
				By.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[3]/td[3]/div/div/div/iframe")));
		driver.findElement(By.xpath("/html/body")).sendKeys("C");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		// 16.
		driver.switchTo().frame(driver.findElement(
				By.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[4]/td[3]/div/div/div/iframe")));
		driver.findElement(By.xpath("/html/body")).sendKeys("C#");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		// 17
		driver.findElement(By.id("submit-question")).click();
		// 19.
		driver.findElement(By.xpath("/html/body/main/section/div/div[6]/div/ul/li[1]/div/a/img")).click();
		// 20.
		driver.findElement(By.id("question_admin_form_questionName"))
				.sendKeys("Which language you are using in selenium ?");
		// 21.
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(
				By.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[1]/td[3]/div/div/div/iframe")));
		driver.findElement(By.xpath("/html/body")).sendKeys("Java");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		// 22.
		driver.switchTo().frame(driver.findElement(
				By.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[2]/td[3]/div/div/div/iframe")));
		driver.findElement(By.xpath("/html/body")).sendKeys("Python");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		// 23.
		driver.switchTo().frame(driver.findElement(
				By.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[3]/td[3]/div/div/div/iframe")));
		driver.findElement(By.xpath("/html/body")).sendKeys("C");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		// 24.
		driver.switchTo().frame(driver.findElement(
				By.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[4]/td[3]/div/div/div/iframe")));
		driver.findElement(By.xpath("/html/body")).sendKeys("C#");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		// 26.
		driver.findElement(By.id("submit-question")).click();
		// 27.
		driver.findElement(By.xpath("/html/body/main/section/div/div[4]/a[2]/img")).click();
		// 28.
		driver.findElement(By.linkText("Start test")).click();
		// 29.
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'-1')]")).click();
		// 30.
		driver.findElement(By.xpath("/html/body/main/section/div/div[5]/form/div[3]/div[3]/button")).click();
		// 31.
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'-1')]")).click();
		// 32.
		driver.findElement(By.xpath("/html/body/main/section/div/div[5]/form/div[3]/div[3]/button[2]")).click();
		System.out.println("The page title is: " + driver.getTitle());
	}

	/*----------------------------------------Test 3-------------------------------------------*/

	@Test // To verify whether application allows teacher to add assessment as online
			// activity and attach certificate
	public void test3() throws InterruptedException {
		driver.findElement(By.linkText("podium")).click();
		// 1.
		driver.findElement(By.linkText("Assessments")).click();
		System.out.println("The page title is: " + driver.getTitle());
		// 2.
		driver.findElement(By.xpath("/html/body/main/section/div/div[3]/div/section/div[1]/div/div[1]/a[2]/img"))
				.click();
		// 3.
		driver.findElement(By.xpath("/html/body/main/section/div/form/fieldset/div/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Tests")).click();
		// 5.
		driver.findElement(By.id("add_link_submit")).click();
		// 6.
		driver.findElement(
				By.xpath("/html/body/main/section/div/div[3]/div/section/form/div/table/tbody/tr[2]/td[6]/a[1]/img"))
				.click();
		driver.findElement(By.id("weight_mask")).sendKeys("1");
		// 7.
		// 8.
		driver.findElement(By.id("edit_link_form_submit")).click();
		// 9.
		driver.findElement(By.xpath("/html/body/main/section/div/div[3]/div/section/div[1]/div/div[2]/a[2]/img"))
				.click();
		System.out.println("The page title is: " + driver.getTitle());
		Thread.sleep(2000);
	}

	// close the browser
	public void closeBrowser() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		testing obj = new testing();
		obj.LaunchBrowser();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.closeBrowser();
	}

}
