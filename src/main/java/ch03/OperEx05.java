package ch03;

public class OperEx05 {

    public static void main(String[] args){
        // 삼항 연산자 = 조건 연산자
        int n1 = 5;

        System.out.println(n1==5? "5가 맞습니다." : "5가아닙니다");
        // 명시적 형변환 == 다운캐스팅 단점 : 데이터가 유실될수있다
        // 묵시적 형변환 == 업캐스팅
    }
}
