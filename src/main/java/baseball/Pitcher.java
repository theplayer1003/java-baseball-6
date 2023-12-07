package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Pitcher implements Makeable {
    private List<Integer> numberList;
    private static final Pattern INPUT_FORMAT = Pattern.compile("[1-9\\s]+$");

    public List<Integer> getNumberList() {
        return numberList;
    }

    @Override
    public void makeNumberList() {
        parseStringToList(readInput());
    }

    private String readInput() {
        boolean success = false;
        String input = null;

        while (!success) {
            try {
                input = Console.readLine();
                validateCheckInput(input);

                success = true;
                
            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.");
                System.out.print(Gamemessage.ENTER_GUESS.getMessage());
            }
        }

        return input;
    }

    private void validateCheckInput(String input) {
        if (checkFormat(input)) {
            throw new IllegalArgumentException();
        }

        if (checkLength(input)) {
            throw new IllegalArgumentException();
        }

        if (checkDuplicate(input)) {
            throw new IllegalArgumentException();
        }
        // 정규식, 길이체크, 공백체크
        // 공백은 remove로 지웠는데 왜 정규식 체크와
    }

    private boolean checkFormat(String input) {
        return !INPUT_FORMAT.matcher(input).matches();
    }

    private static boolean checkLength(String input) {
        return input.length() != 3;
    }

    private static boolean checkDuplicate(String input) {
        return Arrays.stream(input.split(""))
                .distinct()
                .count() != input.length();
    }

    private void parseStringToList(String userInput) {
        numberList = new ArrayList<>();

        for (char each : userInput.toCharArray()) {
            int number = Character.getNumericValue(each);
            // validatecheck

            numberList.add(number);
        }
    }

}
