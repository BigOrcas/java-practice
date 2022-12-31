package ch05;

class Player{
    // 상태 = 필드
    String name; //이름
    int thirty; // 목마름

    public  Player(String name,int thirty){
        this.name=name;
        this.thirty=thirty;
    }

    // 행위 = 메소드
    void 물마시기(){
        this.thirty =this.thirty-50;
    }
    int 목마름상태확인(){
        return this.thirty;
    }
}

public class OOPEx01 {

    public static void main(String[] args){
        Player p1 = new Player("하석진",100);
        System.out.println("이름은 :" +p1.name);
        System.out.println("갈증지수 :" +p1.thirty);


        System.out.println("갈증지수 :" +p1.목마름상태확인());

    }
}
