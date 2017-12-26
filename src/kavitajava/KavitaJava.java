package kavitajava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KavitaJava {

    public static void main(String[] args) {
        String data = "Today is monday";
        String search = "mon";
        Pattern ptrn = Pattern.compile(search);
        Matcher mtr = ptrn.matcher(data);
        while(mtr.find())
        {
            System.out.println("Begining:"+mtr.start()+"--Ending"+mtr.end());
        }
    }
    
}
