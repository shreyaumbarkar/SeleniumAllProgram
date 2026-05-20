import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
    public static void main(String[]args){
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        WebElement sourse= driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
        WebElement target= driver.findElement(By.xpath("//div[contains(@id,'trash')]"));
        Actions act = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        act.dragAndDrop(sourse,target).perform();

    }
}
