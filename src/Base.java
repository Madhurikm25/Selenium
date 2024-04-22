package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {


    public static WebDriver obj ;

    public void setUpBrowser(String browser, String url) {
        String currDir = System.getProperty("user.dir");
        System.out.println("Current working directory: " + currDir);
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("Web driver ", currDir + "\\Drivers\\chromedriver.exe");
             obj = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("Web driver ", currDir + "\\Drivers\\msedgedriver.exe");
            obj = new EdgeDriver();
        } else {
            System.out.println("not availbale hence quitting it");
            System.exit(0);
        }

        if (url != "") {
            obj.get(url);
        } else {
            obj.get("blank url");
        }
    }
}



