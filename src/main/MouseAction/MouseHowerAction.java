import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHowerAction {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testautomationstudio.com/demo/actions/#google_vignette");
        WebElement element = driver.findElement(By.id("cssMenu"));
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
    }
}
//id="cssMenu"