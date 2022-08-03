package Questions;

import java.util.Arrays;

public class PrintPrimes {
    public static void main(String[] args) {
        printAllPrimes(100);
    }

    public static void printAllPrimes(int n) {
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, 2,n+1, true);

        int i;

        /*
        * This works with the assumption that all composite number has a prime factor that is less
        * than or equal to its square root
        * */

        for (int divisor = 2; divisor * divisor <= n; divisor++ ){
            /*
            * this line is to determine whether to or not to test that particular number,
            * since all the numbers are to set to true by default
            * */
            if (prime[divisor]) {
                /*
                * 2 * divisor ensures that we don't set the current divisor to false ie not prime
                *
                * this essentially loops over all the multiples for a particular divisor and sets them to false
                * */
                for (i = 2 * divisor; i <= n; i+=divisor){
                    prime[i] = false;
                }
            }
        }

        for (int idx = 0; idx <= n; idx++) {
            if (prime[idx]) {
                System.out.print(idx + ", ");
            }
        }
    }
}
