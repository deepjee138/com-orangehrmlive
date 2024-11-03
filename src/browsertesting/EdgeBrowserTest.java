package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    static String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    public static void main(String[] args) {
        //1. Set up Edge browser.
        WebDriver driver= new EdgeDriver();

        // 2. Open URL.
        driver.get(baseURL);


        // maximize screen
        driver.manage().window().maximize();

        // wait to drive
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Print the title of the page.
        String title= driver.getTitle();
        System.out.println(title);

        //4. Print the current URL.

        System.out.println("This is current URL:" +driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("This is the page source: " +driver.getPageSource());

        // 6. Click on the ‘Forgot your password?’ link.
        //String passwordLink="https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";

        //7 Print the current URL.
        System.out.println("This is currentURL:" +driver.getCurrentUrl());

        System.out.println(" Get Navigate back to the login page "+driver.getCurrentUrl());

        //9. Refresh the page.
        driver.navigate().refresh();

        //10. Enter the email in the email field.
        WebElement searchBox = driver.findElement(By.name("username"));
        searchBox.sendKeys("Admin");


        //11. Enter the password in the password field.
        WebElement searchField = driver.findElement(By.name("password"));
        searchField.sendKeys("admin123");

        //12. Click on the Login Button.
        //WebElement loginButton = driver.findElement(By.name("submit"));
        //loginButton.sendKeys("123");

        //13 close
        driver.close();

    }
}
