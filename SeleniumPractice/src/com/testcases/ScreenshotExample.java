package com.testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotExample {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		String timeStamp = new SimpleDateFormat("yyyymmdd_hhmmss").format(new Date());
		
		driver.get("https://the-internet.herokuapp.com/");
		
		Thread.sleep(2000);
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("./Screenshots/page.png"));
		
		Thread.sleep(2000);
		
		Screenshot fpScreenshot = new AShot()
				.shootingStrategy(ShootingStrategies.viewportPasting(100))
				.takeScreenshot(driver);
		
		ImageIO.write(fpScreenshot.getImage(), "png", new File("./Screenshots/"+timeStamp+"_fp.png"));
		
	}
}
