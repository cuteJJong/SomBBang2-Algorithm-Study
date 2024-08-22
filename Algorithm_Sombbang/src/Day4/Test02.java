package Day4;

import java.io.IOException;
import java.util.Arrays;


public class Test02 {

    private static class Emp {
        int age, height;

        public Emp(int age, int height) {
            this.age = age;
            this.height = height;
        }

        @Override
        public String toString() {
            return "age = " + this.age + " / height = " + this.height;
        }
    }

    public static void main(String[] args) throws IOException {
        String a ="b";
        String b = "c";

        //String 비교
        System.out.println(a.compareTo(b));

        Emp[] emps = new Emp[5];

        emps[0] = new Emp(30, 170);
        emps[1] = new Emp(25, 165);
        emps[2] = new Emp(25, 175);
        emps[3] = new Emp(25, 170);
        emps[4] = new Emp(30, 160);

        //stable sort
        Arrays.sort(emps, (o1, o2) -> {
            if(o1.age == o2.age)
                return Integer.compare(o1.height, o2.height);
            return Integer.compare(o1.age, o2.age);
        });

        for (Emp emp : emps) {
            System.out.println("emp = " + emp);
        }
    }
}
