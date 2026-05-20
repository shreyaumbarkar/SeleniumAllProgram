//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import java.time.Duration;
//public class DoubleClick {

    //public static void main(String[] args) throws InterruptedException {

       // WebDriver driver = new ChromeDriver();

        //driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //driver.get("https://demoqa.com/buttons");

        //WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));

        //Actions act = new Actions(driver);

        //act.doubleClick(doubleClick).perform();

        //System.out.println("Double click performed");

        //Thread.sleep(10000); // browser stays open 10 seconds
    //}
//}
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        System.out.println("Browser opened");

        Thread.sleep(10000);

        driver.quit();
    }
}