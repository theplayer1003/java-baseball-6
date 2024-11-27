package baseball.domain;

import java.util.List;

public class Referee implements BaseballGamePolicy{
    @Override
    public RefereeCall callBallAndStrike(List<BaseballNumber> catcherNumberList, PitcherNumber pitcherNumber) {
        int ballCount = countBall(catcherNumberList, pitcherNumber);

        return new RefereeCall();
    }

    private int countBall(List<BaseballNumber> catcherNumberList, PitcherNumber pitcherNumber) {
        for(BaseballNumber each : catcherNumberList) {
            
        }

        return 0;
    }
}
