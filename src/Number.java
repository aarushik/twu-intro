import java.util.ArrayList;

/**
 * Created by Aarushi on 30/07/2016.
 */
public class Number {

    public Number() {

    }

    public void fizzBuzz() {

        for (int i = 1; i<=100; i++) {
            boolean mod3 = i%3 == 0;
            boolean mod5 = i%5 == 0;

            if (mod3 && !mod5) { //divisible by 3, but not 5
                System.out.println("Fizz");
            } else if (mod5 && !mod3) { //divisible by 5, but not 3
                System.out.println("Buzz");
            } else if (mod5 && mod3) { //divisible by both 3 and 5
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }

    }

    public void generate(int n) { //printing list of primes
        System.out.print(primeFactorsList(n));
    }

    private ArrayList<Integer> primeFactorsList(int n) { //calculating list of primes
        ArrayList<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) { //while n is divisible by i, i is a prime factor
                primeFactors.add(i);
                n /= i;
            }
        }
        if (n > 1) { //number was a prime itself
            primeFactors.add(n);
        }

        return primeFactors;
    }
}
