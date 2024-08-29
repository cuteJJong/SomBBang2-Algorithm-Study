package Day8;


import java.util.Arrays;

public class Test {

    private static final int ANS = 17;
    public static void main(String[] args) {
        int left = 1;   //답으로 나올 수 있는 최소값
        int right = 50;     //답으로 나올 수 있는 최대값

        while (left < right) {
            System.out.println(left + " " + right);
            int mid = (left + right) / 2;
            if (isPossible(mid)) {
                right = mid;    //25
            }
            else {
                left = mid + 1;
            }
        }
        System.out.println("left = " + left);

        System.out.println("---------------------------------");
        //         -1 -2 -3 -4  -5   -6
        //           0  1  2   3   4

        int[] arr = {1, 5, 9, 14, 20};

        System.out.println(Arrays.binarySearch(arr, 20));   //인덱스를 출력
        System.out.println(Arrays.binarySearch(arr, 200));   //들어갈 위치를 리턴(음수는 데이터가 없다는 것을 알려주기 위함)

        int x = Arrays.binarySearch(arr, 17);

        if(x < 0)
            // 배열의 인덱스를 벗어나면 에러
            System.out.println("배열 안에 없음");
            System.out.println(arr[-x -2]);
    }

    private static boolean isPossible(int answer) {
        // 25
        if (answer >= ANS) {
            return true;
        }
        else {
            return false;
        }
    }
}
