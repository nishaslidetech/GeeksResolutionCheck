package GeeksTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SliPages extends BaseClass {

	@DataProvider
	public Object[][] windowResolution() {

		return new Object[][] {

				{ 2560, 1440 }, { 1920, 1080 }, { 1366, 768 }, { 1920, 1200 }, { 1440, 900 }, { 1680, 1050 },
				{ 1280, 720 }, { 1536, 864 }
				// { 2560, 1440 }, { 1920, 1080 }, { 1366, 768 }, { 1920, 1200 }, { 1440, 900 }
				// - working fine
				// { 1280, 720 }, { 1536, 864 } - not working fine
		};
	}

	@Test(dataProvider = "windowResolution", enabled = true)
	public void checkResolutionForSliPages(int w, int h) throws InterruptedException {
		setDriver(w, h);
		System.out.println("Resolution = " + w + "*" + h);
		driver.get(config.getProperty("testsiteurl"));
		WebElement Templates = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("Templates"))));
		Templates.click();
		Thread.sleep(7000);
		log.info("Templates is successfully clicked");
		BaseClass.checkResolutionSliPages(driver);

		WebElement Business = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("Business"))));
		Business.click();
		Thread.sleep(7000);
		log.info("BusinessPPts is successfully clicked");
		BaseClass.checkResolutionSliPages(driver);

		WebElement Process = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("Process"))));
		Process.click();
		Thread.sleep(7000);
		log.info("Process is successfully clicked");
		BaseClass.checkResolutionSliPages(driver);

		WebElement marketing = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("marketing"))));
		marketing.click();
		Thread.sleep(7000);
		log.info("marketing is successfully clicked");
		BaseClass.checkResolutionSliPages(driver);

		WebElement education = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("education"))));
		education.click();
		Thread.sleep(7000);
		log.info("education is successfully clicked");
		BaseClass.checkResolutionSliPages(driver);

		WebElement Technology = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("Technology"))));
		Technology.click();
		Thread.sleep(7000);
		log.info("Technology is successfully clicked");
		BaseClass.checkResolutionSliPages(driver);

		driver.close();
	}
}
