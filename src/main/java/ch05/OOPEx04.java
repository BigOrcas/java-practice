package ch05;
class 임꺽정{

    void 달리기(){
        System.out.println("달리기1");
    }
    // 오버로딩
    void 달리기(int spped){
        System.out.println("달리기2");
    }
    void 달리기(double spped){
        System.out.println("달리기3");
    }
    void 달리기(int spped,double power){
        System.out.println("달리기5");
    }
}
public class OOPEx04 {
    public static void main(String[] args){
            임꺽정 e = new 임꺽정();
            e.달리기();
            e.달리기(2);
            e.달리기(2.3);
            e.달리기(2,2.3);

    }
}
