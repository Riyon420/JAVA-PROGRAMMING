package JAVA-PROGRAMMING;

public class recursion {
    class recursion {
        int result = 1;

        int cal(int a) {
            if (a == 1) {
                return 1;
            } else {
                return a * cal(a - 1);
            }
        }

        public static void main(String[] args) {
            recursion r = new recursion();
            int s = r.cal(5);
            System.out.println(s);
        }
    }
}
