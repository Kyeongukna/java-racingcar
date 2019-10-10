package Study_hw_1;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    private List<Car> users = new ArrayList<>();
    private String userName;
    private int countUser;
    private int serveral; // 게임 횟수

    public CarManager(String username, int serveral){
        this.userName = username;
        this.serveral = serveral;
    }

    // 유저가 몇명인지 카운트 해주는 메소드
    private void countUser() {
        int count = 1;
        for(int i = 0; i < userName.length(); i++) {
            if (userName.charAt(i) == ',') count++;
        }
        this.countUser = count;
    }

    //유저들의 이름을 받아서 유저를 나눠 Car객체를 초기화
    private void setUser() {
        String[] names = userName.split(",");
        for (int i = 0; i < countUser; i++) {
            users.add(new Car(names[i]));
        }
    }

    private void doRaceOneTime(){
        for(int i = 0; i < countUser; i++){
            users.get(i).go();
            System.out.print("\n" + users.get(i).getName() + " : ");
            users.get(i).print();
        }
        System.out.println();
    }

    public void race() {
        countUser();
        setUser();
        System.out.println("실행 결과");
        for(int i = 0; i < serveral; i++){
            doRaceOneTime();
        }
    }

    //우승자 출력을 위해 우승한 자동차들의 전진값 리턴
    public int whoWinner() {
        int max = 0;
        for(int i = 0; i < countUser; i++){
            if(users.get(i).getPosition() > max) {
                max = users.get(i).getPosition();
            }
        }
        return max;
    }

    public void printWinner() {
        String winner = "";
        for(int i = 0; i < countUser; i++) {
            if (users.get(i).getPosition() == whoWinner())
                winner += (users.get(i).getName()+ " ");
        }
        System.out.println(winner+"가 최종 우승했습니다.");
    }
}