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

public class amazon_2 {

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
				driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"hmenu-customer-name\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"register_accordion_header\"]/i")).click();
				driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Mohanraj");
				driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]")).sendKeys("9880107799");
				driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("rajmohan@1983");
				driver.hideKeyboard();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
				String StrText =driver.findElement(MobileBy.xpath("//h4[text()='Mobile number already in use']")).getText();
				System.out.println(StrText);
		
			
				
	}

}
