package kavitajava;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class metachrs1 {
    public static void main(String[] args) {
        String data = "Today is mool day";
        //String search = "[ftc]ool";
        String search = "[a-z]ool";
        Pattern ptrn = Pattern.compile(search);
        Matcher mtr = ptrn.matcher(data);
        if(mtr.find())
        {
            System.out.println("Begining:"+mtr.start()+"--Ending"+mtr.end());
        }
        else if(!mtr.find())
        {
            System.out.println("Not found");
        }
        
    }
}
