package venkateshPractise;

public class PrimeNumber {
    public static void main(String args[]) {
        for(int i=1;i<=100;i++){
            prime(i);
        }
    }
    public static void prime(int n){

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;

            }
        }
        if (count == 2) {
            System.out.println(n);
        }
    }
}
