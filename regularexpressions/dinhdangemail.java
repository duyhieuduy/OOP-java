import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class dinhdangemail {
    public static void main(String[] args) {
        //kiemtra dinh dang email hieu123@amail.com
        String regex =  "^\\w+[a-z0-9]*@{1}\\w+mail.com$";// chu so random
        //chu cai + so theo thu tu "^\\w+\\d+"
        Scanner scanner = new Scanner(System.in); 
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println("OKE");
        }
        else{
            System.out.println("sai");
        }
    }
}
