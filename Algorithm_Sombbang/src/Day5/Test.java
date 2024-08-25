package Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        //우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>();  //설정이 없으면 MIN HEAP -> 오름차순 정렬
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  //MAX HEAP -> 내림차순 정렬

        pq.add(10);
        pq.add(5);
        pq.add(7);
        pq.add(12);

        System.out.println("pq.poll = " + pq.poll());   // 5    // O(logN)

        pq.add(9);

        System.out.println("pq.poll = " + pq.poll());   // 7

        pq.add(13);

        System.out.println("pq.poll = " + pq.poll());   // 9
        System.out.println("pq.poll = " + pq.poll());
        System.out.println("pq.poll = " + pq.poll());

        System.out.println("------------------------------------ ");

        //우선순위 큐
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();  //설정이 없으면 MIN HEAP -> 오름차순 정렬

        pq1.add(10);
        pq1.add(5);
        pq1.add(7);
        pq1.add(12);
        
        //for문으로 반복돌리지 말고 poll()로 꺼내야 오름차순으로 정렬되어 나온다.

        System.out.println("pq1.peek() = " + pq1.peek());
        
        while (!pq1.isEmpty()) {
            System.out.println("pq.poll() = " + pq1.poll());
        }

        System.out.println("------------------------------------ ");
        ArrayList<Integer> arrayList = new ArrayList<>();  //설정이 없으면 MIN HEAP -> 오름차순 정렬

        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(12);

        Collections.sort(arrayList);    //O(N)

        System.out.println("arrayList.get(0) = " + arrayList.get(0)); //O(logN)
        
    }
}
