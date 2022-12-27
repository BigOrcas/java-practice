package ch02;

// new가 되어서 heap에 할당이 되었을때 사이즈를 알 수 있다.(프로그램이 실행되었을때 ==runtime)
class MyData{
    int id=1; // 4byte 할당해야하는것을 알고있다
    int price =1000;
}

// 레퍼런스(참조) 변수,일반 변수
public class VarRefEx01 {

    public static void main(String[] args){
        // 타입 변수 ; int num; 변수를 선언한다
        // 타입 변수 = 값; int num =10; 변수를 초기화(메모리에 할당) 한다.
        int num =10; // 일반변수 (크기가 정해져 있는 것) 값을 가지고있다
        MyData d = new MyData(); 
        // 크기가 정해지않으니까 크기를 일단 크게 잡는다 EX) CLASS 자료형 BEAN같은
        // 레퍼런스 변수는 주소를 가지고있다 주소를 찾아 값을 찾는다(크기가 정해져 있지 않는것 ==컴파일 시점)
    }

}
