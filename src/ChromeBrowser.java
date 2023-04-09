import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    //Launch the Chrome browser
    WebDriver driver = new ChromeDriver();
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
        //close browser
        driver.close();
}
}
