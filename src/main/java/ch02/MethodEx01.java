package ch02;

class 손님{
    //손님의 행위
    void 커피마시기(){
        System.out.println("손님이 커피를 마셔요");
    }
}
public class MethodEx01 {
    
    // 메소드 = MethodEx01 클래스의 행위
    static void start(){
        System.out.println("만나서 반갑습니다.");
        System.out.println("Start 메소드 종료");
    }
    
    public static void main(String[] args){
        MethodEx01.start();
        손님 s = new 손님();
        s.커피마시기();
    }
}
