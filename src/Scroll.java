package src;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Scroll extends Base {

    public void scrollPixel() {
        JavascriptExecutor js = (JavascriptExecutor) obj;
        js.executeScript("window.scrollBy(0,100)");
    }

    public void ScrollPageDown()
    {
        JavascriptExecutor js = (JavascriptExecutor) obj;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void scrollToElement()
    {
        WebElement elem = obj.findElement(By.xpath("//button[contains(text(), 'Interaction')]"));
        JavascriptExecutor js = (JavascriptExecutor) obj;
        js.executeScript("arguments[0].scrollIntoView();", elem);
    }


    public static void main(String[] args) throws InterruptedException {
        Scroll s1 = new Scroll();
        s1.setUpBrowser("chrome", "https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
        obj.manage().window().maximize();
        Thread.sleep(5000);
        //s1.scrollPixel();
        //s1.ScrollPageDown();
        s1.scrollToElement();
    }
}