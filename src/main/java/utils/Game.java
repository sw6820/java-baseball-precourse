package utils;

import java.util.ArrayList;
import java.util.regex.Pattern;

import static utils.Constants.*;

public class Game {
    private static ArrayList<Integer> balls = new ArrayList<>();
    private int strike;
    private int ball;
    private final Pattern regex = Pattern.compile("^[1-9]*$");

    public Game(){
    }

    public void startGame(){
        balls = new ArrayList<>();
        strike = 0;
        ball = 0;
    }

    public String strikeBall(){
        String result = "";
        if (strike == 0 && ball == 0) {
            return NOTHING;
        }
        if (strike > 0) {
            result += strike + STRIKE;
        }
        if (ball > 0){
            result += ball + BALL;
        }
        return result;
    }

    public boolean isContinue() {
        return (strike != BALL_SIZE);
    }

    private void findBall(String input) {
        String inputBalls = input;
        for (String num : inputBalls.split("")) {
            balls.add(Integer.parseInt(num));
        }
    }

    public void countStrikes(int num, int idx) {
        if (balls.get(idx).equals(num)){
            strike++;
        }
    }

    public void countBalls(int num, int idx) {
        if (balls.contains(num) && !balls.get(idx).equals(num)) {
            ball++;
        }
    }

    public String game(String input, ArrayList<Integer> numbers) {
        String number = input;

        findBall(input);

        for (int idx = 0; idx < BALL_SIZE; idx++) {
            int num = numbers.get(idx);
            countStrikes(num, idx);
            countBalls(num, idx);
        }

        String result = strikeBall();
        return result;
    }


}
