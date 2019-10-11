package Study_hw_1;
import java.util.Random;

public class Car {
    private static final int MAX_RANDOM_NUMBER = 9;
    private static final int MIN_MOVE = 3;
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    private  boolean canMove() {
        int a = new Random().nextInt(MAX_RANDOM_NUMBER);
        return a > MIN_MOVE ;
    }

    public String getName() {
        return name;
    }
    public int getPosition() {
        return position;
    }

    public void move() {
        if(canMove()) position++;
    }

    public void print() {
        for(int i = 0; i < position; i++){
            System.out.print("-");
        }
    }
}
