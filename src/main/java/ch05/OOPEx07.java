package ch05;

abstract class Animal{
    abstract void speak(); // 추상메소드 몸체{}가 없다

}
class Dog extends Animal{
    void speak(){
        System.out.println("왈왈!");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("야옹!");
    }
}

class Bird extends Animal{
    void speak(){
        System.out.println("짹짹!");
    }
}



public class OOPEx07 {

    public static void main(String[] args){
            Animal a1 = new Dog();
            Animal a2 = new Cat();
            Animal a3 = new Bird();
            a1.speak(); //동적 바인딩이된다 왜? 부모메소드를 무효화됬으니가
            a2.speak();


    }
}
