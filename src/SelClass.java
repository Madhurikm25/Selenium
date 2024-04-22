package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SelClass extends Base {
    public static void main(String[] args) throws InterruptedException {
        SelClass sc = new SelClass();
       sc.setUpBrowser("chrome", "https://www.makemytrip.com/");
        obj.manage().window().maximize();
        Thread.sleep(5000);
        System.out.println("**************");

        try {
            obj.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
            Thread.sleep(5000);
            obj.findElement(By.xpath("//a[@class='close']")).click();
        } catch (WebDriverException e) {
            // Handle exception
        }

        WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(10));
        WebElement elem = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fromCity")));

        Actions action = new Actions(obj);
        action.moveToElement(elem).click().sendKeys("BEN").perform();

        String selectOption = "BENGALURU";

        List<WebElement> optionList = obj.findElements(By.xpath("//p[@class='hsw_sectionTitle font12 latoBlack greyText']"));

        for(WebElement e1 : optionList) {
            String ddoption = e1.getText();
            if(ddoption.contains(selectOption)) {
                e1.click();
                break;
            }
        }
    }
}
