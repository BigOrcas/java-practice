package ch07;

class SubThread implements Runnable{

    // 자바의 서브 스레드
    @Override
    public void run(){
        for(int i=1;i<6;i++){
            try{
                System.out.println("서브스레드:"+i);
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        }
    }


public class ThreadEx01 {

    // 자바의 메인 스레드
    // sub스레드 객체생성
    // thread 객체생성
    // run() 스타트
    // for 돈다
    public static void main(String[] args){

        SubThread st = new SubThread(); // heap 공간에 subthread가 생성 runnable이 부모
        Thread t1 = new Thread(st); // 타겟선정 subthread의 run메소드
        t1.start();
        for(int i=1;i<6;i++){
            try{
                System.out.println("메인스레드:"+i);
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
