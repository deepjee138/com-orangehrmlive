package browsertesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 *1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Click on the ‘Forgot your password?’ link.
 * 7. Print the current URL.
 * 8. Navigate back to the login page.
 * 9. Refresh the page.
 * 10. Enter the email in the email field.
 * 11. Enter the password in the password field.
 * 12. Click on the Login Button.
 * 13. Close the browser.
 * Project-3 - ProjectName: com-her
 */

public class FireFoxBrowserTest {


    static String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    public static void main(String[] args) {

        //1. Set up fire fox browser.
        WebDriver driver= new FirefoxDriver();

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

         //8. Navigate back to the login page.
        driver.navigate().back();
        System.out.println(" Get Navigate back to the login page "+driver.getCurrentUrl());

        //9. Refresh the page.
        driver.navigate().refresh();


        //Enter the email in the email field.
        WebElement searchBox = driver.findElement(By.name("username"));
        searchBox.sendKeys("Admin");

        //Enter the password in the password field.
        WebElement searchField = driver.findElement(By.name("password"));
        searchField.sendKeys("admin123");


        //12. Click on the Login Button.
        //WebElement loginButton = driver.findElement(By.name("submit"));
        //loginButton.sendKeys("123");

        //13. Close the browser.
        driver.close();
    }
}
