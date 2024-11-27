package baseball.domain;

import java.util.HashMap;
import java.util.Map;

public class RefereeCall {
    private final Map<String, Integer> refereeCall;

    public RefereeCall(Integer ballCount, Integer strikeCount) {
        this.refereeCall = Map.of("볼", ballCount,
                "스트라이크", strikeCount);
    }
}
