import org.apache.commons.lang3.StringUtils;

public class Validator {

    /**
     *
     * @param email
     * @return true if e-mail is valid
     */
    public static boolean isEmailValid(String email) {
        if (email == null) {
            return false;
        }
        return email.split("@").length == 2
                && StringUtils.countMatches(email, "@") == 1
                && (email.split("@"))[1].split(".").length == 2;
    }


    public boolean isPasswordValid(String password) {
        if (password == null) {
            return false;
        }

        return true;
    }

}

// https://javarush.ru/groups/posts/regulyarnye-vyrazheniya-v-java
