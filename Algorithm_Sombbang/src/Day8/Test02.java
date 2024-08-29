package Day8;

import java.util.TreeMap;

public class Test02 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        map.put(10, 50);    //O(logN)
        map.put(5, 80);     //O(logN)
        map.put(15, 20);    //O(logN)

        System.out.println(map.get(15));    //O(logN)
        System.out.println(map.firstEntry().getValue());
        System.out.println(map.ceilingEntry(13).getValue());    //O(logN)   입력한 key들 중 천장 값
        System.out.println(map.floorEntry(13).getValue());        //O(logN)   입력한 key들 중 바닥 값
    }
}
