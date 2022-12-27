package ch02;
/*
* 정리 : Stack(지역변수 = 메소드가 실행될 때 메모리에 할당된다 = 메서드가 종료될때 메모리에서 사라짐)
*  Heap( 전역변수 = new 할때 메모리에서 할당되요 = 더 이상 참조하지 않을 때 메모리에서 사라져요)
*  Static( 전역변수 = main 메소드가 실행되기 전에 메모리에서 할당된다 = main 메서드가 종료되면 메모리에서 사라진다)
 */
public class StackEx02 {

   static int sum = 20; // 전역변수 main 메서드가 시작되기전에 sum이 할당된다
   int value = 50; // 전역변수(heap) // 더 이상 참조하지 않을때 자동으로 사라진다

    static void a(){
        // a 메서드가 실행될 때 stack 공간에 n1이 할당되고 a메소드가 종료되면 메모리에서 사라짐
        int n1 =1; //a메서드의 스택영역에 저장됨(지역변수)
        int n2 =2 ;
        // static 공간 할당은 main 메소드 실행전에만 가능하다
        // static int n3 = 3; 이친구는 a()가 호출될때 메모리에 올라가야하는데 static 키워드가 붙어 오류가남
    }
    public static void main(String[] args){
        a(); // 메소드를 호출한다
        System.out.println(sum);
        StackEx02 S = new StackEx02(); // 이 라인에서 heap공간에 value가 할당된다
        System.out.println(S.value);
    }
}
