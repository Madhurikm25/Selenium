package src;

import org.openqa.selenium.WebDriver;

public class Test  extends Base{

    public void getTitle()
    {
        String Title = obj.getTitle();
        System.out.println(Title);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.setUpBrowser("chrome", "https://www.google.com");
        //t.wait(3000);
        t.getTitle();

    }
}

