package baseball;

import java.util.stream.IntStream;

public class Referee {
    private final Integer GAMESET = 3;

    private boolean stateGameOver=false;

    public boolean getStateGameOver() {
        return stateGameOver;
    }

    public void setStateGameOver(){
        stateGameOver = false;
    }

    public void judgeNumberList(Pitcher p, Catcher c) {

        Integer strikeCount = (int) IntStream.range(0, c.getNumberList().size())
                .filter(i -> c.getNumberList().get(i).equals(p.getNumberList().get(i)))
                .count();

        int ballCount=0;

        for(int i=0;i<c.getNumberList().size();i++){
            for(int j=0;j<p.getNumberList().size();j++){
                if(i==j)continue;
                if(c.getNumberList().get(i)==p.getNumberList().get(j)) ballCount++;
            }
        }

        callBallStrike(ballCount, strikeCount);
    }

    private void callBallStrike(Integer ballCount, Integer strikeCount) {
        if (ballCount == 0 && strikeCount == 0) {
            System.out.println("낫싱");
        }
        if (ballCount == 0 && strikeCount != 0) {
            System.out.println(strikeCount + "스트라이크");
        }
        if (ballCount != 0 && strikeCount == 0) {
            System.out.println(ballCount + "볼");
        }
        if (ballCount != 0 && strikeCount != 0) {
            System.out.println(ballCount + "볼 " + strikeCount + "스트라이크");
        }

        if (strikeCount == GAMESET) {
            stateGameOver = true;
        }
    }
}
