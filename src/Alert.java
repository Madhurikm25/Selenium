package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert extends Base {

    public void getSimpleAlert() throws InterruptedException {
        WebElement a1 = obj.findElement(By.xpath("//button[contains(text(), 'Click for JS Alert')]"));
        Thread.sleep(5000);
        a1.click();
        System.out.println(obj.switchTo().alert().getText());
        obj.switchTo().alert().accept();
    }

    public void getConfirmationAlert() throws InterruptedException {
       WebElement b1 = obj.findElement(By.xpath("//button[contains(text(), 'Click for JS Confirm')]"));
       //Thread.sleep(5000);
       b1.click();
       System.out.println(obj.switchTo().alert().getText());
        Thread.sleep(5000);
        obj.switchTo().alert().dismiss();
    }

    public void getPromptAlert() throws InterruptedException {
        obj.findElement(By.xpath("//button[contains(text(), 'Click for JS prompt')]")).click();
        Thread.sleep(5000);

        obj.switchTo().alert().sendKeys("abcd");
        Thread.sleep(5000);
        obj.switchTo().alert().accept();
    }



    public static void main(String[] args) throws InterruptedException {

        Alert e1 = new Alert();
        e1.setUpBrowser("chrome", "https://the-internet.herokuapp.com/javascript_alerts");
        obj.manage().window().maximize();
        //e1.getSimpleAlert();
        //e1.getConfirmationAlert();
        e1.getPromptAlert();

    }
}