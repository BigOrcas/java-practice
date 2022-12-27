package ch02;

public class MethodEx03 {
    
    static void 자판기_음료_돌려주기(int coin){
        System.out.println("동전 투입하였씁니다.");
    }
    static void 자판기_음료_돌려주기2(double paper){
        System.out.println("지폐 투입하였씁니다.");
    }
    static void 자판기_음료_돌려주기3(String card){
        System.out.println("카드 투입하였씁니다.");
    }
    static void add(int n1,int n2){ //매개변수 2개!!
        System.out.println("더하기 메서드 호출");
    }
    public static void main(String[] args){
        자판기_음료_돌려주기(10000);
        자판기_음료_돌려주기2(10000.50);
        자판기_음료_돌려주기3("삼성카드");
        add(5,6);

    }

}
