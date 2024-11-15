package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample {
    public static void main(String[] args) {
        String text = "Contact us at support@regex.com or call 123-456-7890!";
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+"); // Email regex
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
        }
    }

}
