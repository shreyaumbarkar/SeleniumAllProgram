import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleCheckBox {
    public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testing.qaautomationlabs.com/checkbox.php");
        //WebElement element= driver.findElement(By.xpath("(//div[@class='card-header'])[2]"));
        List<WebElement> options=driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement option: options){
            if(!option.isSelected()){
                option.click();
            }
        }
    }//                By.xpath("//input[@type='checkbox']")

}
