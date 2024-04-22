import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadingText {


    public static void main(String[] args) throws Exception {

        // File path is passed as parameter
        File file = new File("C:\\Users\\manasa\\Desktop\\SCM.txt");

        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        List<String> str = new ArrayList<String>();
        //while ((st = br.readLine()) != null)
        while ((br.readLine()) != null)
        {
            String[] words = br.readLine().split(" ");
            for (String s1 : words) {
                StringBuilder rev = new StringBuilder(s1);
                String reverse = rev.reverse().toString();
                System.out.println(reverse);
                //str.add(st);
                //br.readLine();
            }
        }
        br.close();


    }
}

