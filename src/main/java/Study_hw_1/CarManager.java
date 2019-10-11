package Study_hw_1;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    private List<Car> cars = new ArrayList<>();
    private int countUser;
    private int several; // 게임 횟수

    public CarManager(String userNames, int several) {
        this.cars = generateCars(userNames);
        this.several = several;
    }

    private List<Car> generateCars(String userNames) {
        List<Car> cars = new ArrayList<>();
        for (String name : userNames.split(",")) {
            cars.add(new Car(name));
        }
        return cars;
    }

    private void countUser() {
        this.countUser = cars.size();
    }

    private void doRaceOneTime(){
        for(int i = 0; i < countUser; i++) {
            cars.get(i).move();
            System.out.print("\n" + cars.get(i).getName() + " : ");
            cars.get(i).print();
        }
        System.out.println();
    }

    public void race() {
        countUser();
        System.out.println("실행 결과");
        for(int i = 0; i < several; i++){
            doRaceOneTime();
        }
    }

    public int getMaxPosition() {
        int max = 0;
        for(int i = 0; i < countUser; i++){
            if(cars.get(i).getPosition() > max) {
                max = cars.get(i).getPosition();
            }
        }
        return max;
    }

    public void printWinner() {
        String winner = "";
        for(int i = 0; i < countUser; i++) {
            if (cars.get(i).getPosition() == getMaxPosition())
                winner += (cars.get(i).getName() + " ");
        }
        System.out.println(winner + "가 최종 우승했습니다.");
    }
}