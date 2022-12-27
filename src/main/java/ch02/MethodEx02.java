package ch02;

public class MethodEx02 {
    // void는 리턴을 하지않겠다

    static int add(){ //호출이 되면 중괄호 내부가 실행된다. 이때 Stack 공간이 메모리에 만들어진다
        int sum = 5+6;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args){
           int result= add(); // return을 받는 result
        System.out.println(result);
        // 메소드 또한 request와 response를 따른다
        // 호출해줄래? 응(return)
        // 모든게 리턴이 필요한건 아니다
    }
}
