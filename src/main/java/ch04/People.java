package ch04;

// this는 자기자신의 heap 공간
public class People {
    String name;
    int age;

    // 디폴트 생성자가 있을까요? 있음 -> .java -> .class 컴파일할때 자바가 자동으로 코드를 만들어줌
    // 내가 직접 생성자를 정의하였기 때문에 디폴트 생성자가 없음
    public People(String name,int age){ // 매겨변수를 넣어준다는건 자판기에 동전을 넣는다 생각하자
        System.out.println("People 메서드 스택 name:" + name);
        System.out.println("People 메서드 스택 age:" + age);
        this.name =name; // this는 자기자신의 heap공간을 가리킨다 즉 String name 을 가리킨다
        this.age = age;
    }
}
