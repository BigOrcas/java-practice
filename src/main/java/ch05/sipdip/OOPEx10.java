package ch05.sipdip;

interface  CanAble{
    public abstract void talk();
}
abstract class 홀직원 implements CanAble{
    abstract void 청소();

    public void talk(){
        System.out.println("우리지금말해!");
    }
}
abstract class 종업원 extends 홀직원{
    void 서빙하기(){
        System.out.println("서빙하기");
    }
    void 주문받기(){
        System.out.println("주문받기");
    }
}
abstract class 캐셔 extends 홀직원{
    void 정산하기(){
        System.out.println("정산하기");
    }
    void 계산하기 (){
        System.out.println("계산하기");
    }
}

abstract class 요리사{
    abstract void 요리();
}

class 홍길동 extends 종업원{
    요리사 j; // 의존성 역전 원칙
    @Override
    void 청소() {
        System.out.println("화장실청소");
    }
}
class 임꺽정 extends 종업원{
    요리사 j; // 의존성 역전 원칙
    @Override
    void 청소() {
        System.out.println("홀청소");
    }

    @Override
    public void talk() {

    }
}
class 김유신  extends 캐셔{

    @Override
    void 청소() {
        System.out.println("주방청소");
    }

    @Override
    public void talk() {

    }
}
class 이몽룡 extends 캐셔{

    @Override
    void 청소() {
        System.out.println("테이블청소");
    }

    @Override
    public void talk() {

    }
}
class 이순신 extends 요리사{

    @Override
    void 요리() {
        System.out.println("양식요리");
    }
}
public class OOPEx10 {
    public static void main(String[] args){


    }
}
