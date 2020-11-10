import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regax {
    public String inputPhoneNumber(){
        String number;
        String input =new Scanner(System.in).nextLine();
        String numberRegex = "^(09|01[2|6|8|9])+([0-9]{7})$";
        Pattern pattern = Pattern.compile(numberRegex);
        Matcher matcher =pattern.matcher(input);
        if (matcher.find()){
            number =input;
        } else {
            System.err.println("Phone number include ten number!!");
            number=inputPhoneNumber();
        }
        return number;
    }
}
