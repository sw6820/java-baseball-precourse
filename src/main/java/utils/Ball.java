package utils;

import java.util.ArrayList;

import static utils.Constants.*;

public class Ball {

    public final ArrayList<Integer> balls = new ArrayList<>();

    public Ball() {
    }

    public boolean doContain(int number){
        return balls.contains(number);
    }

    public void appendBall(int validNumber){
        if (!doContain(validNumber)){
            balls.add(validNumber);
        }
    }

    public void generateBall(){
        while (balls.size() < BALL_SIZE){
            appendBall(RandomUtils.nextInt(MIN_BALL, MAX_BALL));
        }

    }

}
