package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClassClick {

    public static  void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        WebElement elem = driver.findElement(By.id("blogsmenu"));
        action.moveToElement(elem).contextClick().perform();

        Robot robot = new Robot();
        robot.delay(2000);



        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }
}
