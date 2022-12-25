package ch01;

class Note1{
    int price = 2000;
}
public class VarEx05 {
    public static void main(String[] args){
       Note1 note1= new Note1(); // heap 공간에 Note1 클래스가 가지고 있는 모든 데이터를 할당해!!(대신 static을 제외하고)
       Note1 note2= new Note1(); // heap 공간 동적할당을 위해서
        new Note1();

        int age = 25; // main stack 공간
        note2.price =3000;
        System.out.println(note1.price);
        System.out.println(note2.price);
        System.out.println(age);


    }
}
