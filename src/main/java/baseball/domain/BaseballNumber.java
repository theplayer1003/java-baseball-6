package baseball.domain;

import java.util.Objects;

public class BaseballNumber {
    private final int number;

    public BaseballNumber(int number) {
        validateRange(number);
        this.number = number;
    }

    private void validateRange(int number) {
        if (number < 1 || number > 9) {
            throw new IllegalArgumentException("숫자는 1부터 9까지의 정수만 사용합니다.");
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        BaseballNumber that = (BaseballNumber) other;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(number);
    }
}
