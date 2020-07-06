package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class amazon_1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				DesiredCapabilities cap = new DesiredCapabilities();
				//cap.setCapability("deviceName","abc")
				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
				cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
				cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
				cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Training\\chromedriver_win32\\chromedriver.exe");
				AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
				driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
				driver.get("http://amazon.in");
				driver.findElement(By.xpath("//*[@id=\"nav-search-keywords\"]")).sendKeys("iphone 7s plus");
				driver.findElement(By.xpath("//*[@id=\"nav-search-form\"]/div[2]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"search\"]/span[3]/div[2]/div[3]/div/span/div/div/div[1]/div/div/a/div[1]/h2/span")).click();
								
				
			
				
	}

}
