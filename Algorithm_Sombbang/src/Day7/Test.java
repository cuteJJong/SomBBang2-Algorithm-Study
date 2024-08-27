package Day7;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

    private static final int MAX = 200_000;
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("김희성", 990217);
        map.put("박보영", 930514);

        System.out.println("map.size() = " + map.size());   //개수

        System.out.println("map.get() = " + map.get("김희성"));    //O(1)

        System.out.println("------------------------------------------");

        HashMap<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < MAX; i++) {
            map1.put(i, i);
        }

        long s = System.currentTimeMillis();

        for (int i = 0; i < MAX; i++) {
            map1.containsKey(i);     //O(1) -> key를 이용해서 value를 찾아 쓴다.
            //map1.containsValue(i);     //어어어어ㅓ엄청 오래걸린다 value 는 hash를 하지 않는다.
        }

        long e = System.currentTimeMillis();

        System.out.println((e - s) / 1000.0);

        System.out.println("---------------------------------------");

        //Thread-safe   지금 사용하는 Hashtable이랑 거의 동일한 기능
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        //Non-Thread-safe
        HashMap<Integer, Integer> map2 = new HashMap<>();
        map2.put(null, null);

        //Thread-safe
        Hashtable<Integer, Integer> table = new Hashtable<>();  //마지못해 남아있는 코드
        table.put(null, null);  //Exception in thread "main" java.lang.NullPointerException
    }
}
