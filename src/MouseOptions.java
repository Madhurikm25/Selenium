package src;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MouseOptions extends Base{

    public void clickAndHold() {


        WebElement clickable = obj.findElement(By.id("clickable"));
        //new Actions(obj).clickAndHold(clickable).perform();
        new Actions(obj).click(clickable).perform();


    }

    public void MoveElement() {
        WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(10));
        WebElement clickable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Login'][1]")));
        //new Actions(obj).clickAndHold(clickable).perform();
        new Actions(obj).moveToElement(clickable).perform();


    }

    public void MouseKeyupDown() {
    WebElement elem1 = obj.findElement(By.linkText("compendiumdev"));
    Actions action = new Actions(obj);
    action.moveToElement(elem1).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();

    }

    public void copy() throws InterruptedException {
        WebElement sourceElem  = obj.findElement(By.xpath("//span[@role='presentation'][contains(text(),'Your two files will be displayed side by side alon')]"));
        WebElement targetElem = obj.findElement(By.xpath("//span[contains(text(),'File comparison can be very difficult,')]"));
        Actions action = new Actions(obj);
        action.keyDown(sourceElem, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        Thread.sleep(2000);
        action.keyDown(targetElem, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
        Thread.sleep(2000);
    }

    public void googleSearch() throws InterruptedException {
        // Switch to iframe
        obj.switchTo().frame("callout");

        // Click on button
        WebElement button = obj.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']"));
        button.click();
        Thread.sleep(5000);
        WebElement searchBox = obj.findElement(By.name("q"));
        searchBox.click();
        searchBox.sendKeys("selenium");
        System.out.println("****");

        // Perform ENTER key press action
       /* Actions action = new Actions(obj);
        action.sendKeys(Keys.ENTER).perform();*/
    }

    public void fbSearch() throws InterruptedException {

        WebElement email  = obj.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("abc");
        Thread.sleep(2000);
        email.sendKeys(Keys.CONTROL+"a");
        email.sendKeys(Keys.CONTROL+"c");
        Thread.sleep(2000);
        WebElement passwd = obj.findElement(By.xpath("//input[@name='pass']"));
        passwd.sendKeys(Keys.CONTROL+"v");


    }



    public static void main(String[] args) throws InterruptedException {
        MouseOptions m = new MouseOptions();

        //m.setUpBrowser("chrome", "https://www.google.com/");

        m.setUpBrowser("chrome", "https://www.facebook.com/");
        obj.manage().window().maximize();
        //m.clickAndHold();
       // m.MoveElement();
       m.MouseKeyupDown();
        //m.copy();
      // m.googleSearch();
       // m.fbSearch();



        }
}
