package ch07;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {

    public static void main(String[] args) throws IOException {

        // 1. 키보드 A를 인코딩해서 010000으로 컴퓨터에게 전송
        // 2. ByteStream으로 흘러간다
        // 3, read 메소드로 65를 디코딩
        // 4. 65를 문자로 부호화한다
        InputStream in = System.in;// 키보드를 모니터에 연결

        int data = in.read();
        System.out.println(data);


    }
}
