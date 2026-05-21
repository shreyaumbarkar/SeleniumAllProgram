import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxAnotherExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.expandtesting.com/checkboxes");

        List<WebElement> checkboxes =
                driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement checkbox : checkboxes) {

            if (!checkbox.isSelected()) {
                checkbox.click();
                Thread.sleep(1000);
            }
        }

        // verification
        for (WebElement checkbox : checkboxes) {
            System.out.println(checkbox.isSelected());
        }
    }
}