package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Mc {
    Pitcher p = new Pitcher();
    Catcher c = new Catcher();
    Referee r = new Referee();

    public void startGame() {
        System.out.println(Gamemessage.ENTER_GAME.getMessage());

        runGame();
    }

    private void runGame() {
        setNumberList(c);

        while (!r.getStateGameOver()) {
            System.out.print(Gamemessage.ENTER_GUESS.getMessage());
            setNumberList(p);
            r.judgeNumberList(p, c);
        }
        r.setStateGameOver();

        continueGame();
    }

    private void continueGame() {
        System.out.println(Gamemessage.CONGRATULATIONS.getMessage());
        System.out.println(Gamemessage.CONTINUE.getMessage());
        if (Console.readLine().equals("1")) {
            runGame();
        }
    }

    private void setNumberList(Makeable i) {
        i.makeNumberList();
    }
}
