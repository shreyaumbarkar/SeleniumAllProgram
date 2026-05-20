import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownWithoutSelectClass {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dropdown#google_vignette");
        WebElement element= driver.findElement(By.id("dropdown"));
        element.click();
        List<WebElement> options= driver.findElements(By.xpath("//select[@id='dropdown']/option"));
        for(WebElement option:options){
            String text = option.getText();
            if(text.equals("Option 2")){
                option.click();

            }
        }
       System.out.println("Program executed");


    }

}
