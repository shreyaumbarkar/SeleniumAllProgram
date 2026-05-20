import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClick {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        Actions act = new Actions(driver);
        act.contextClick(rightClick).perform();

    }
}
//rightClickBtn