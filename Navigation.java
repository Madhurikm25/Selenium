import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import src.Base;

import java.time.Duration;

public class Navigation extends Base {

    public void locateElem() {
        //obj.findElement(By.cssSelector("span.headerIconTextAlignment.chNavText.darkGreyText:nth-of-type(2)")).click();
        WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username"))).sendKeys("Admin");

        obj.findElement(By.name("password")).sendKeys("admin123");
        obj.findElement(By.xpath("//button[@type='submit']")).click();
        //WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(10));

        obj.findElement(By.xpath("//span[contains(text(), 'Job')]")).click();
    }

    public void getAttribute() {
        WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(5));
        String elem = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username"))).getAttribute("placeholder");
        System.out.println(elem);
    }


    public void NavigationBackExample() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(10));
        obj.navigate().back();
        Thread.sleep(5000);

    }

    public void NavigationForwardExample() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(10));
        obj.navigate().forward();
        obj.manage().window().maximize();
        Thread.sleep(5000);

    }

    public void NavigationRefreshExample() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(10));
        obj.navigate().refresh();
        Thread.sleep(5000);

    }




    public static void main(String[] args) throws InterruptedException {
        Navigation e2 = new Navigation();
        String OrangeUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
        e2.setUpBrowser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //e2.NavigationBackExample();
       //e2.NavigationForwardExample();
       //e2.NavigationRefreshExample();

       // WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(10));
        obj.manage().window().maximize();
        //e2.locateElem();
        e2.getAttribute();

    }
}

