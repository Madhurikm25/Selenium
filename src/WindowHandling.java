package src;

import org.openqa.selenium.By;

import java.util.ArrayList;

public class WindowHandling extends Base {

    public void WindowHandling()
    {
        System.out.println("Before clicking");
        System.out.println(obj.getWindowHandles());
        obj.findElement(By.xpath("//button[@title='New Tab']")).click();
        ArrayList<String> s  = new ArrayList<String>(obj.getWindowHandles());
            for (String m1 : s)
            {
                System.out.println(m1);
            }
            obj.switchTo().window(s.get(1));
            obj.findElement(By.xpath("//a[@title='back to Selenium Tutorial']")).click();
            System.out.println(obj.getTitle());
        }






    public static void main(String[] args) {
        WindowHandling w = new WindowHandling();
        w.setUpBrowser("chrome", "https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
        obj.manage().window().maximize();
        w.WindowHandling();
    }
}
