package venkateshPractise;

public class PrimeNumber {
    public static void main(String args[]) {
        int n = 9;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;

            }
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("not Prime");
        }
    }
}
