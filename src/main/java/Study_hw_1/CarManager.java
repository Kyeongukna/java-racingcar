package Study_hw_1;

import java.util.Scanner;

public class CarManager {
    private Car user[];
    private String username;
    private int serveral; // 게임 횟수

    CarManager(String username){
        this.username=username;
    }

    public void setServeral(int serveral) {
        this.serveral = serveral;
    }

    private int countuser(){
        int count=1;
        for(int i=0; i<username.length();i++)
        if(username.charAt(i)==',') count ++;
        return count;
    }
    // 유저가 몇명인지 카운트 해주는 메소드

    private void setUser(){
       user=new Car[countuser()];
        for(int i=0;i<countuser();i++)
            user[i]=new Car(username.split(",")[i]);
    }

    public void play(){
        setUser();
        System.out.println("실행 결과");
        for(int i=0;i<serveral;i++){
            for(int j=0;j<countuser();j++){
                user[j].go();
                System.out.print("\n"+user[j].getName()+" : ");
                user[j].print();
            }
            System.out.println();
        }
    }

    public int iswinner(){
        int max=serveral;
        for(int i=0;i<countuser();i++){
            if(user[i].getPosition()==max) return max;
            max--;
        }
        return 0;
    }
    //우승자 출력을 위해 우승한 자동차들의 전진값 리턴

    public String winner(){
        String winner="";
        for(int i=0;i<countuser();i++) {
            if (user[i].getPosition() == iswinner())
                winner += (user[i].getName()+ " ");
        }
        return winner;
    }
}
