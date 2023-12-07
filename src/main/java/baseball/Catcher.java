package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Catcher implements Makeable {
    private List<Integer> numberList;

    public List<Integer> getNumberList(){
        return Collections.unmodifiableList(numberList);
    }

    @Override
    public void makeNumberList() {
        numberList = new ArrayList<>();

        while(numberList.size()<3){
            int number = Randoms.pickNumberInRange(1, 9);
            if(!numberList.contains(number)){
                numberList.add(number);
            }
        }
    }
    
}
