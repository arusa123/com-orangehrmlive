import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {

    static String browser = "Edge";

    static WebDriver driver;
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        } else {
            System.out.println("Invalid browser");
        }
        //open URL
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //print the current URL
        System.out.println("Current URl: " + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source: " + driver.getPageSource());
        //Enter the email to email field
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");
        //Enter password to password field
        driver.findElement(By.name("password")).sendKeys("admin123");
        //close the browser
       // driver.close();
    }
}