package baseball;

import java.util.Scanner;

import utils.Ball;
import utils.Console;
import utils.Game;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        run(scanner);
    }

    private static void run(Scanner scanner){
        Ball ball = new Ball();
        Game game = new Game();
        ball.generateBall();
        game.startGame();

        do {
            Console.consolePrint(Console.INPUT_NUMBER);
            String input = scanner.nextLine();
            String strikeBall = game.game(input, ball.balls);
            System.out.println(strikeBall);
        } while(game.isContinue());
    }

    public void gameStart(Scanner scanner) {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        if (scanner.nextLine().equals("1")) {
            run(scanner);
        }
    }
}
