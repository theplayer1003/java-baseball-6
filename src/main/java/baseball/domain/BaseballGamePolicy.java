package baseball.domain;

import java.util.List;

public interface BaseballGamePolicy {
    RefereeCall callBallAndStrike(List<BaseballNumber> catcherNumberList, PitcherNumber pitcherNumber);
}
