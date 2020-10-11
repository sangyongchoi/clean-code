package chapter_02;

import java.util.ArrayList;
import java.util.List;

public class BadExample {
    // 주석이 필요하며 변수로 무엇을 하느지 유추할 수 없는 나쁜코드
    int d; // 경과시간
    List<int[]> theList = new ArrayList<>();
    // 코드는 어렵지 않다.
    // 무엇을 하는 코드인가?
    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<>();

        for (int[] x : theList) {
            if(x[0] == 4){
                list1.add(x);
            }
        }

        return list1;
    }
}

