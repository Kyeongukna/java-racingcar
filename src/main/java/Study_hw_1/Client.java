package Study_hw_1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)");
        Scanner scanner = new Scanner(System.in);
        String player = scanner.next();
        System.out.println("시도할 회수는 몇회인가요?");
        int several = scanner.nextInt();
        CarManager user = new CarManager(player,several);
        user.race();
        user.printWinner();
    }
}
