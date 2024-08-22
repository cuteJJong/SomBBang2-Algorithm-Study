package Day4;

public class Test {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";

        System.out.println(System.identityHashCode("abc"));
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));

        //== 비교는 같은 객체(identityHashCode)니?
        if(a == b) {
            System.out.println("같습니다");
        }
        else {
            System.out.println("다릅니다.");
        }

        a += "d";
        b += "d";

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));

        //if(a.equals(b)) 데이터를 비교 // 같습니다
        //java에서는 == 보다는 equals를 많이 쓴다.
        if ( a == b ) {
            System.out.println("같습니다");
        }
        else {
            System.out.println("다릅니다");
        }
    }


}
