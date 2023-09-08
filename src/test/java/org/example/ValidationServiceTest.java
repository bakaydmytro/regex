package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidationServiceTest {

    @ParameterizedTest
    @CsvSource({
            "Ab1_asdahxc, 5, false",
            "'', 5, false",
            "Ab1_, 5, true",
            "ab1_, 5, false",
            "AB1_, 5, false",
            "AB1, 5, false",
            "Aa_, 5, false",
            "Aa 1_, 5, false",
            "'   Aa1_', 5, false",
            ", 5, false"
    })
    void validationTest(String input, int maxLength, boolean expected) {
        ValidationService validationService = new ValidationService();
        boolean result = validationService.valid(input, maxLength);
        Assertions.assertEquals(expected, result);
    }
}
