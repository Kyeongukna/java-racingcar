package Study_hw_1;
import java.util.Random;

public class Car {
    private final String name;
    private int position =0;

    public Car(String name){
        this.name=name;
    }

    public  boolean cango(){
        int a=new Random().nextInt(9);
        if(a>3) return true;
        return false;
    }
    public void go(){
        if(this.cango()) position++;
    }
    public void print(){
    for(int i=0;i<position;i++){
        System.out.print("-");
    }

    }
    public String getName(){
        return name;
    }
    public int getPosition(){
        return position;
    }
}
