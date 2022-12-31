package ch05;

class 요리사{
    String name="요리사";
}
// 홍길동 or 요리사
class 홍길동 extends 요리사{
    String name="홍길동";
}
public class OOPEx03 {
    public static void main(String[] args){
        홍길동 h1 = new 홍길동(); // 힙메모리에는 홍길동 ,요리사가 올라감
        System.out.println(h1.name);

        요리사 y1 = new 홍길동(); // 힙메모리에는 홍길동 ,요리사가 올라감
        System.out.println(y1.name);

        // 홍길동 h2 = new 요리사(); 불가능하다, 요리사를 바라보고있기때문
        // 힙메모리에 요리사만 올라갔다

    }
}
