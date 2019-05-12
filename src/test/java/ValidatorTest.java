import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void isEmailValid() {

        assertFalse(Validator.isEmailValid(null));
        assertFalse(Validator.isEmailValid("djhb@jksdgjk.sd"));
//        assertFalse(Validator.isEmailValid("kjvdfsuyub"));
//        assertFalse(Validator.isEmailValid("kjv@fsu@yub"));

    }
}