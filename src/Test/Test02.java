package Test;

public class Test02 {
    public static void main(String[] args) {
        System.out.println(sumUp(3));
    }

    private static int sumUp(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result = result + i;
        }

        return result;
    }
}
