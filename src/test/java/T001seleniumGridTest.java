import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class T001seleniumGridTest {

    @Test
    public void seleniumGrid() {

        try {
            WebDriver driver;
            String nodeUrl = "http://172.17.0.1:4444/wd/hub";

            DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
            desiredCapabilities.setBrowserName("chrome");
            desiredCapabilities.setCapability("browserVersion", "100.0");
            desiredCapabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            desiredCapabilities.setPlatform(Platform.LINUX);
            driver = new RemoteWebDriver(new URL(nodeUrl), desiredCapabilities);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
            driver.get("https://google.com");
            driver.findElement(By.name("q")).sendKeys("selenoid");
            driver.findElement(By.name("btnK")).click();
            Thread.sleep(10000);
            driver.close();
            System.out.println("first test");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void aaaaa() {

        try {
            WebDriver driver;
            String nodeUrl = "http://172.17.0.1:4444/wd/hub";

            DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
            desiredCapabilities.setBrowserName("chrome");
            desiredCapabilities.setPlatform(Platform.LINUX);
            driver = new RemoteWebDriver(new URL(nodeUrl), desiredCapabilities);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
            driver.get("https://google.com");
            driver.findElement(By.name("q")).sendKeys("second test");
            driver.findElement(By.name("btnK")).click();
            Thread.sleep(10000);
            driver.close();
            System.out.println("second test");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void aaaaaa() {

        try {
            WebDriver driver;
            String nodeUrl = "http://172.17.0.1:4444/wd/hub";

            DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
            desiredCapabilities.setBrowserName("chrome");
            desiredCapabilities.setPlatform(Platform.LINUX);
            driver = new RemoteWebDriver(new URL(nodeUrl), desiredCapabilities);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
            driver.get("https://google.com");
            driver.findElement(By.name("q")).sendKeys("third test");
            driver.findElement(By.name("btnK")).click();
            Thread.sleep(10000);
            driver.close();
            System.out.println("third test");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
