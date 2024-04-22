package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RCKeyPress {

    //WebDriver driver;

    public static void main(String[] args) throws AWTException, InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("HP");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }



}
