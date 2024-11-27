package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class PitcherNumber {
    private final List<BaseballNumber> pitcherNumberList;

    public PitcherNumber(List<Integer> pitcherNumberList) {
        this.pitcherNumberList = makePitcherNumberList(pitcherNumberList);
    }

    private List<BaseballNumber> makePitcherNumberList(List<Integer> pitcherNumberList) {
        List<BaseballNumber> tmp = new ArrayList<>();
        int sequence = 0;
        for (Integer each : pitcherNumberList) {
            tmp.add(new BaseballNumber(each, sequence++));
        }
        return tmp;
    }

    
}
