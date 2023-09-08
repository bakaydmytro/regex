package org.example;

import java.util.regex.Pattern;

public class ValidationService {

    public boolean valid(String inputValue, int maxLength) {
        if(inputValue==null){
            return false;
        }
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!\"#$%'()*+,-./:;<=>?@\\[\\]^_`{|}~])(?!.*\\s).{1,"+maxLength+"}$";
        return Pattern.matches(regex, inputValue);
    }

}
