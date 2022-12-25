package ch01;

public class VarEx02 {
    static int n2 = 20;
    public static void main(String[] args){ // 자바는 static이라는 키워드를 가진 친구를 우선 메모리에 올린다

        int n1 = 10;
        System.out.println(n1); // 이 라인이 실행될때 10이라는 숫자가 n1이라는 메모리 공간에 할당된다
        System.out.println(n2); // varEx02라는 static 공간의 n2
        // static main();
        // stack 은  n1 =10 stack은 9번 라인에서 메모리공간에서 사라진다
        // static 또한 자바프로그램이 끝난 후에 종료된다

    }
}
