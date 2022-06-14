package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SqrServiceTest {
    @ParameterizedTest
    @CsvSource({
            "100, 400, 9",
            "99, 800, 19",
            "200, 300, 3"
    })
    public void test(int min, int max, int expected) {
        SQRService service = new SQRService();
        int count = service.calculate(min, max);
        Assertions.assertEquals(expected, count);
    }
}

