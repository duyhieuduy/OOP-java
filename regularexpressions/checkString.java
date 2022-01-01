import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class checkString {
    public static void main(String[] args) {
        // tim regular expression syntax,method matcher
        String input = "PS23989";
        String regex = "^[PSKTDH]{2}\\d{5}$";
        Pattern patern = Pattern.compile(regex);
        Matcher matcher = patern.matcher(input);
        if(matcher.find()){
            System.out.println("oke");
        }
        else{
            System.out.println("sai");
        }
    }
}
