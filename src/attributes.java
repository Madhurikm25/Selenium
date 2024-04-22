package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class attributes extends Base{

    public void getAttributes() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-v-7b563373=''][text()='Admin']"))).click();
        Thread.sleep(5000);
        obj.findElement(By.xpath("//SPAN[@data-v-7b563373=''][text()='PIM']")).click();
        Thread.sleep(5000);
        WebElement header = obj.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']"));
        //obj.navigate().refresh();
        //Thread.sleep(5000);
        //obj.close();

        System.out.println(header.getCssValue("position"));
}

     public void pageSource()
{
    System.out.println(obj.getPageSource().contains("OrangeHRM"));
    obj.close();
}

public void button()
{

    WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(5));
    WebElement elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//INPUT[@data-v-1f99f73c='']")));
    System.out.println(elem.getAttribute("placeholder"));
    //System.out.println(eleme);
}

     public void getLocation() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(5));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//SPAN[@data-v-7b563373=''][text()='PIM']"))).click();
        Thread.sleep(5000);

         WebElement PIM  = obj.findElement(By.xpath("//h6[contains(@class,  'oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module')]"));
         System.out.println(PIM.getLocation());

    }

    public static void main(String[] args) throws InterruptedException {

        attributes e1 = new attributes();
        e1.setUpBrowser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        obj.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username"))).sendKeys("Admin");

        obj.findElement(By.name("password")).sendKeys("admin123");
        obj.findElement(By.xpath("//button[@type='submit']")).click();
        //e1.getAttributes();
       // e1.pageSource();
        //e1.button();
        e1.getLocation();
    }
}
