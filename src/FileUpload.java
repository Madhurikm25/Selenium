package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload {


    public static void main(String[] args) throws InterruptedException, AWTException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        String path = System.getProperty("user.dir") + "\\Screenshots\\image1.png";
        StringSelection selection = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);// file copied

        Actions actions = new Actions(driver);
        WebElement choosePath = driver.findElement(By.xpath("//input[@name='file']"));
        actions.moveToElement(choosePath).click().build().perform();


        Robot robot = new Robot();
        robot.delay(2000);


        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(By.className("button")).click();





    }


}
