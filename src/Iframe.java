package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Iframe extends Base {

    public void iframeUsage()
    {
        obj.switchTo().frame(0);
        System.out.println("123");
      WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(5));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Selenium Tutorial']"))).click();
        /*String text = obj.findElement(By.tagName("h1")).getText() ;
        System.out.println(" Text is: " + text);*/




    }



    public void iframeUsage2()
    {
        obj.switchTo().frame(1);
        System.out.println("456");
       // WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(5));
       // WebElement e1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='Selenium - Automation Practice Form']")));
       //System.out.println(e1);



    }

    public void defContent() {
        obj.switchTo().defaultContent();
        //obj.switchTo().parentFrame();
        System.out.println("789");
        obj.findElement(By.xpath("//a[@href='frames.php']")).click();
        WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(5));
        WebElement e1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='Selenium - Automation Practice Form']")));
        System.out.println(e1);

    }


    public static void main(String[] args) throws InterruptedException {
        Iframe handle  = new Iframe();
        handle.setUpBrowser("chrome", "https://www.tutorialspoint.com/selenium/practice/frames.php");
        obj.manage().window().maximize();
       // WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(10));
       // WebElement w1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='w3-btn w3-margin-bottom'][text()='Try it Yourself »'][5]")));
       // w1.click();
        handle.iframeUsage();
        Thread.sleep(5000);
        handle.defContent();
       // handle.iframeUsage2();

    }
}
