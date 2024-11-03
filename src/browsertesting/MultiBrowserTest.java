package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {


    static String browser= "Chrome";
    static String baseUrl= "https://opensource-demo.orangehrmlive.com/web/index.php";
    static WebDriver driver;


    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver= new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println(" Wrong Browser");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("Page Source " + driver.getPageSource());
        driver.navigate().refresh();
        WebElement searchBox = driver.findElement(By.name("username"));
        searchBox.sendKeys("Admin");
        WebElement searchField = driver.findElement(By.name("password"));
        searchField.sendKeys("admin123");
        WebElement loginLink = driver.findElement(By.xpath("//button[@type='submit']"));
        loginLink.click();
        driver.close();


        }
    }

