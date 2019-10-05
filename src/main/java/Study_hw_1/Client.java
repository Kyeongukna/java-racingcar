package Study_hw_1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        CarManager user;
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)");
        Scanner scanner=new Scanner(System.in);
        user=new CarManager(scanner.next());
        System.out.println("시도할 회수는 몇회인가요?");
        user.setServeral(scanner.nextInt());
        user.play();
        String winner=user.winner();
        System.out.println(winner+"가 최종 우승했습니다.");
    }
}
