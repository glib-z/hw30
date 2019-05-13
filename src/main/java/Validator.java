import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    /**
     *
     * @param email input string for validation
     * @return true if e-mail is valid
     */
    public static boolean isEmailValid(String email) {
        if (email == null) {
            return false;
        }
        String[] s = email.split("@");
        return StringUtils.countMatches(email, "@") == 1          // e-mail has only one '@'
                && email.split("@").length == 2                 // '@' divides string on two parts
                && s[1].split("\\.").length == 2                // '.' divides string after '@' on two parts
                && StringUtils.countMatches(s[1], ".") == 1      // string after '@' has only one '.'
                && s[0].charAt(0) != '.'                              // Char '.' can't be at first position
                && s[0].charAt(s[0].length() - 1) != '.';             // Char '.' can't be at last position
    }


    /**
     *
     * @param password input string for validation
     * @returntrue if password is valid
     */
    public static boolean isPasswordValid(String password) {
        if (password == null) {
            return false;
        }

        if (password.length() < 8 || password.length() > 20) {
            return false;
        }

        Pattern p = Pattern.compile("[a-zA-Z!?&[0-9]]");
        Matcher m = p.matcher(password);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return password.length() == count;
    }

}

// https://javarush.ru/groups/posts/regulyarnye-vyrazheniya-v-java
