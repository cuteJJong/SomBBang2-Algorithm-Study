package Day1;

import java.util.LinkedList;

public class test {

    private static final int MAX = 100_000;


    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//
//        HashMap<Integer, Integer> map  = new HashMap<>();
//
//        for (int i = 0; i < MAX; i++) {
//            map.put(i, i);
//        }
//
//        int x = 0;
//
//        // O(N)
//        for (int i = 0; i < MAX; i++) {
//            //containsValue(i) O(N^2) : Value값은 hash로 접근 X 단방향 알고리즘이기에
//            if (map.containsKey(i)) {   // O(1)
//                x++;
//            }
//        }

//        int[] arr = new int[MAX + 1];

        //37초??? 10,000,000,000번
//        for (int i = 0; i < MAX ; i++) {
//            for (int j = 0; j < MAX ; j++) {
//                arr[j] = ( i  + MAX / (j + 1)) % 5;
//                arr[j]++;
//                arr[i]++;
//            }
//        }

        // 0(N * NlogN)
//        for (int i = 0; i < MAX; i++) {
//            arr[i] = i + 1;
//            //최악의 케이스 N^2 -> 인위적으로 만든 경우
//            Arrays.sort(arr);   //0(NlogN)
//        }

//        long end = System.currentTimeMillis();
//        System.out.printf("%.6f초\n", (end - start) / 1000.0);

//        int x = Integer.MIN_VALUE;
//        System.out.println("x = " + (x + 1));
//
//        //2진법
//        float a = 0.1f;
//        float b = 0.1f;
//
//        // 0.1  -> 무한소수라 짤라줘야하기 때문에
//        System.out.println(a * b);  //0.010000001
//        System.out.println(0.01f);
//
//        if(a * b == 0.01f)
//            System.out.println("같아요!");
//        else
//            System.out.println("달라요!");

//        //2차원이나 3차원 배열할 때 메모리 조심
//        int[][] arr = new int[MAX][MAX];
//        // 4Byte * 100,100 * 100,100
//        // 40,000,000,000 Byte -> 40GB
//        // 16GB, 6GB, 8GB
//        // KB < MB < GB
//        System.out.println("asd");
//        System.out.println("asd");

        //        long start = System.currentTimeMillis();


        LinkedList<Integer> list  = new LinkedList<>();

        for (int i = 0; i < MAX; i++) {
            list.add(i);
        }

        long s = System.currentTimeMillis();

        int a= 0;

        //LinkedList 포인터로 다음 노드를 찾고 찾고 찾기에
        //코테에서는 잊어라~
        for (int i = 0; i < MAX; i++) {
            a += list.get((MAX - 1) / 2);   //O(N)
        }

        long e = System.currentTimeMillis();

        System.out.printf("%.6f\n", (e - s) / 1000.0);
    }
}
