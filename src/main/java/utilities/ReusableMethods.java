package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {
	
	public static void javaScriptExecutorClick(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void switchtoFrame(WebDriver driver, String framename) {
		driver.switchTo().frame(framename);
	}

	public static void selectDropDownValue(WebElement element, String value) {
		Select slt = new Select(element);
		slt.selectByVisibleText(value);
	}
	
	public static void explitWaitForElements(WebDriver driver, long timeOutInSeconds, WebElement element) {
		WebDriverWait wt = new WebDriverWait(driver, timeOutInSeconds);
		wt.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void screenCapture(WebDriver driver, String filePath) {
		try {
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(filePath));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error in capturing Screenshots");
		}
	}
}
