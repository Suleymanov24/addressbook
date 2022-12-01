import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class GroupCreationTests {
    public WebDriver driver;
    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");
    }

    @Test
    public void qwert() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("calculator");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click();//2
        driver.findElement(By.xpath("//div[@jsname='XSr6wc']")).click();//+
        driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click();//2
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();//=
        Thread.sleep(5000);

    }
    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();

    }

}
