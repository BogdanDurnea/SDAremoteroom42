package ro.sda.java42;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExemple {
   static final String emailExperession= "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[abcde]{1,4}");
        Pattern pattern1 = Pattern.compile("[abcde]{3,}");
        Pattern pattern2 = Pattern.compile("[ab]+");
        Pattern pattern3 = Pattern.compile("[ab]{2}");
        Matcher matcher = pattern.matcher("aaab");
        Matcher matcher1 = pattern1.matcher("aaab");
        Matcher matcher2 = pattern2.matcher("aaab");
        Matcher matcher3 = pattern3.matcher("aaab");
        System.out.println(matcher.find());
        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());
        System.out.println(matcher2.find());
        System.out.println(matcher2.find());
        System.out.println(matcher3.find(1));

        System.out.println(Pattern.compile("^(.+)@(\\S+) $")
                .matcher("ala@gmail.a")
                .matches());
        Pattern pattern4 = Pattern.compile(emailExperession);
        Matcher matcher4 = pattern4.matcher("stefan.durla@gmail.com");
        System.out.println(matcher4.matches());
        System.out.println(Pattern.compile(emailExperession)
                .matcher("ala@gmail.ro")
                .matches());


    }
}
