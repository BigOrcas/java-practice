package ch06;

class 농구공{
    private String name="농구공";
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name =name;
    }
}
class 축구공{
    private String name="축구공";
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name =name;
    }
}

class 가방<T>{
    private T data;


    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data =data;
    }
}

public class GenericEx03 {

    static 가방<?> 꺼내기(int time){
        if(time ==9){
            System.out.println("가방에 축구공이 담겼어요");
            축구공 g2 = new 축구공();
            가방<축구공> b2 = new 가방<>();
            b2.setData(g2);
            return b2;
        }else{
            System.out.println("가방에 농구공 담겼어요");
            농구공 g1 = new 농구공();
            가방<농구공> b1 = new 가방<>();
            b1.setData(g1);
            return b1;
        }
    }
    public static void main(String[] args){
        가방<?> r1 =꺼내기(9);
        가방<?> r2 =꺼내기(12);

        농구공 g1 = new 농구공();
        축구공 g2 = new 축구공();

        가방<농구공> b1 = new 가방<>();
        b1.setData(g1);
        가방<축구공> b2 = new 가방<>();
        b2.setData(g2);
        System.out.println(b1.getData().getName());
        System.out.println(b2.getData().getName());
    }
}
