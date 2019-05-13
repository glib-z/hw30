import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void isEmailValid() {

        assertFalse(Validator.isEmailValid(null));
        assertFalse(Validator.isEmailValid("kjvdfsuyub"));
        // Extra '@' chars are present
        assertFalse(Validator.isEmailValid("kjv@fsu@yub"));
        // E-mail has not domain name
        assertFalse(Validator.isEmailValid("kjv@fsuyub"));
        // Char '.' position is wrong
        assertFalse(Validator.isEmailValid("kjv@.fsu.yub"));
        assertFalse(Validator.isEmailValid("kjv@fsu.yub."));
        assertFalse(Validator.isEmailValid(".kjv@fsu.yub"));
        assertFalse(Validator.isEmailValid("kjv.@fsu.yub"));
        // Valid e-mail
        assertTrue(Validator.isEmailValid("djhb@jksdgjk.sd"));

    }

    @Test
    public void isPasswordValid() {

        assertFalse(Validator.isPasswordValid(null));
        // Cyrillic chars, forbidden chars, space
        assertFalse(Validator.isPasswordValid("jds glj324jапр!?&*#$"));
        // Cyrillic chars
        assertFalse(Validator.isPasswordValid("jdsАБВГ"));
        // Checks password length
        assertFalse(Validator.isPasswordValid("1234567"));
        assertTrue(Validator.isPasswordValid("12345678"));
        assertTrue(Validator.isPasswordValid("01234567890123456789"));
        assertFalse(Validator.isPasswordValid("012345678901234567890"));
        // Checks latin chars
        assertTrue(Validator.isPasswordValid("abcdefghijklmno"));
        assertTrue(Validator.isPasswordValid("pqrstuvwxyz"));
        assertTrue(Validator.isPasswordValid("ABCDEFGHIJKLMNO"));
        assertTrue(Validator.isPasswordValid("PQRSTUVWXYZ"));

    }
}