package src;

public  class BaseCommands extends Base {



    public void searchCommands() {
       String url = obj.getCurrentUrl();
        System.out.println(url);


    }


    public static void main(String[] args) {
        BaseCommands b1 = new BaseCommands();
        b1.setUpBrowser("chrome", "https://www.makemytrip.com/");
        b1.searchCommands();
    }
}
