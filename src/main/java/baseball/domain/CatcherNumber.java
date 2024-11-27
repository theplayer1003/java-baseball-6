package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class CatcherNumber {
    private final List<BaseballNumber> catcherNumberList;
    private final BaseballGamePolicy referee;

    public CatcherNumber(List<Integer> catcherNumberList, BaseballGamePolicy referee) {
        this.catcherNumberList = makeCatcherNumberList(catcherNumberList);
        this.referee = referee;
    }

    private List<BaseballNumber> makeCatcherNumberList(List<Integer> catcherNumberList) {
        List<BaseballNumber> tmp = new ArrayList<>();
        int sequence = 0;
        for (Integer each : catcherNumberList) {
            tmp.add(new BaseballNumber(each, sequence++));
        }
        return tmp;
    }

    public RefereeCall catchingThePitch(PitcherNumber pitcherNumber) {
        return referee.callBallAndStrike(catcherNumberList, pitcherNumber);
    }
}
