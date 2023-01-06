package ch06;
class 호랑이{
    String name ="호랑이";
}
class 사자{
    String name ="사자";
}
// 호랑이, 사자
class 큰바구니<T>{
    T data;
}

public class GenericEx02 {

    public static void main(String [] args){
        큰바구니<호랑이> s1 = new 큰바구니<>(); // 이 데이터는 호랑이 타입이된다 뒤에 <>은 생략가능하다
        s1.data = new 호랑이();               // 큰바구니에 호랑이를 넣는다
        System.out.println(s1.data.name);    // 호랑이의 이름을 꺼낸다

        큰바구니<사자> s2 = new 큰바구니<>(); // 이 데이터는 호랑이 타입이된다
        s2.data = new 사자();
        System.out.println(s2.data.name);
    }
}
