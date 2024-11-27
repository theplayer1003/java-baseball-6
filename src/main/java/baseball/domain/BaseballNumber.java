package baseball.domain;

import java.util.Objects;

public class BaseballNumber {
    private final int number;
    private final int sequence;

    public BaseballNumber(int number, int sequence) {
        validateRange(number);
        this.number = number;
        this.sequence = sequence;
    }

    private void validateRange(int number) {
        if (number < 1 || number > 9) {
            throw new IllegalArgumentException("숫자는 1부터 9까지의 정수만 사용합니다.");
        }
    }

    public boolean checkBallCount(BaseballNumber other) {
        if (sequence == other.sequence) {
            return false;
        }
        return equals(other);
    }

    public boolean checkStrikeCount(BaseballNumber other) {
        if (sequence != other.sequence) {
            return false;
        }
        return equals(other);
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
