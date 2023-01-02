package ch05;

class 프로토스유닛{
    String name ="프로토스유닛";
    void 기본공격(프로토스유닛 e1){
    }
    String 이름확인(){
        return "?";
    }

}

class 질럿 extends 프로토스유닛{
    String name ="질럿";
    // 오버라이드 = 부모의 메서드를 무효화하다 메소드를 추상화하고 자식의 메소드를 실행시킨다
    void 기본공격(프로토스유닛 e1){
        System.out.println("질럿이 "+e1.이름확인()+"을 공격합니다");
        //System.out.println("질럿메소드");
    }

    String 이름확인(){
        return name;
    }

}
class 드라군 extends 프로토스유닛{
    String name ="드라군";
    String 이름확인(){
        return name;
    }
}class 다크템플러 extends 프로토스유닛{
    String name ="다크템플러";
    String 이름확인(){
        return name;
    }
}
class 리버 extends 프로토스유닛{
    String name="리버";

    void 공격(프로토스유닛 e1){
        System.out.println(this.name+"이 "+e1.이름확인()+"을 공격합니다");
    }
    String 이름확인(){
        return name;
    }
}


public class OOPEx06 {
    public static void main(String[] args){
        프로토스유닛 u1 = new 질럿(); //(질럿,프로토스유닛V)
        프로토스유닛 u2 = new 드라군(); //(드라군.프로토스유닛V)
        프로토스유닛 u3 = new 다크템플러(); //(다크템플러,프로토스유닛V)
        프로토스유닛 u4 = new 리버(); //(다크템플러,프로토스유닛V)
       u1.기본공격(u2);
        u1.기본공격(u4);
//        u2.기본공격();
//        u3.기본공격();

    }
}
