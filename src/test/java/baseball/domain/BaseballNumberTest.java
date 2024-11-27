package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BaseballNumberTest {
    private BaseballNumber number1;
    private BaseballNumber number3;
    private static final int SEQUENCE_IS_NOT_USED_THIS_TEST = 0;

    @BeforeEach
    void init() {
        number1 = new BaseballNumber(1, SEQUENCE_IS_NOT_USED_THIS_TEST);
        number3 = new BaseballNumber(3, SEQUENCE_IS_NOT_USED_THIS_TEST);
    }

    @Test
    void test_equals() {
        BaseballNumber numberForEqualTest = new BaseballNumber(1, SEQUENCE_IS_NOT_USED_THIS_TEST);

        assertEquals(number1, numberForEqualTest);
        assertNotEquals(number3, numberForEqualTest);
    }

    @Test
    void validate_check() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new BaseballNumber(10, SEQUENCE_IS_NOT_USED_THIS_TEST);
        });

        assertEquals("숫자는 1부터 9까지의 정수만 사용합니다.", exception.getMessage());
    }
}