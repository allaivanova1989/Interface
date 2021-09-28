package homework2109;

public class Rec {
    public int rec(int n) {
        if (n == 3) {
            return n;
        }
        int result = rec(++n);
        return result;
    }

    public void test1() {
        int i = 0;
        test2();
        int j = 3;
    }

    public void test2() {
        int k = 6;
    }

}
