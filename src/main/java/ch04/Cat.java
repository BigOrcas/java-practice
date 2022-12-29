package ch04;

// 값을 초기화하지 않는 이유는 new 할때마다 다른 상태를 가진 고양이를 만들기 위해서이다!
// Cat 클래스를 하나 만들어 놓음으로써 여러마리 고양이를 만들ㅇ수있다
// 세상이란 메모리에  올린다 초기화를 해버리면
public class Cat {
    String name;
    String color;
    //Cat() 생성자를 디폴트 생성자라고 한다.
    // 개발자가 적지 않아도 있는거!!(생략가능한 코드)
    // 내가 직접 생성자를 구현하게 되면 디폴트 생성자가 생략될 수 없다!
    // 그리고 매개변수가 없다
    public Cat(){

    }
    // 개발자가 직접 생성자를 구현함
    public Cat(String n,String c) { // 생성자(메소드)
        System.out.println("고양이가 탄생함");
        System.out.println(n);
        System.out.println(c);

        // String n,String c는 지역변수 = Cat() 이라는 생성자(메소드)가 가진 지역변수
        name = n;
        color = c;
    }
}
