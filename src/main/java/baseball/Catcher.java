package baseball;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class Catcher {
    List<Integer> ballCatch = new ArrayList<>();

    private void makeBallCatch() {
        while (ballCatch.size() < 3) {
            Integer randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!ballCatch.contains(randomNumber)) {
                ballCatch.add(randomNumber);
            }
        }

    }

}
