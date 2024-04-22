package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CapturrScreenshot {

        //WebDriver driver;

        public static void main(String[] args) throws AWTException, InterruptedException, IOException {

            WebDriver driver= new ChromeDriver();
            driver.get("https://www.tutorialsninja.com/demo");
            Thread.sleep(2000);
            driver.manage().window().maximize();
            driver.findElement(By.name("search")).sendKeys("HP");
            Robot robot = new Robot();
           /* Rectangle rectangle = new Rectangle(100,50);
            BufferedImage srcImage = robot.createScreenCapture(rectangle);
            ImageIO.write(srcImage,"PNG", new File("./Screenshots/image1.png"));*/
            robot.mouseWheel(100);
            robot.delay(2000);

            robot.mouseWheel(-100);
            robot.delay(2000);

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Rectangle rect = new Rectangle(screenSize);

            BufferedImage srcImg2 = robot.createScreenCapture(rect);
           ImageIO.write(srcImg2,"PNG", new File("./Screenshots/image2.png"));





        }



    }


