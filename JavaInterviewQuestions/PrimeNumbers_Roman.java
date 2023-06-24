package JavaInterviewQuestions;

public class PrimeNumbers_Roman {

    //A prime number is a whole number greater than 1 whose only factors are 1 and itself.
    // A factor is a whole number that can be divided evenly into another number.
    // The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
    // Numbers that have more than two factors are called composite numbers.
    // The number 1 is neither prime nor composite.


    public static void main(String[] args) {

     // Example 1. Check if number is prime.

        int number = 5;
        boolean isPrime = true;

        if(number<=1){
            // first of all we check this condition, because 1 and less 1 it is not prime.
            // If condition true reassign our boolean to false.
            isPrime = false;
        } else {
            // we will check if number has only divisible by itself, since we start from 2.
            // we start from 2 because of first condition above.
            for (int i = 2; i<number; i++){
                if (number%i==0){
                    // if condition above will be true, our boolean became false.
                    // Because following iterator we determine that number have other divisors.
                    isPrime = false;
                }
            }
        }

        // now we ready to check our boolean
        if (isPrime){
            // if boolean has not been changed print prime
            System.out.println(number + " is prime!");
        } else {
            // if boolean has been changed print prime
            System.out.println(number + " is not prime!");
        }

    //Example 2. Check range 1-100 and find all prime numbers.

        for(int i = 2; i <= 100; i++){
            // Start from 2 because 1 is not prime. It is not necessary check 1 like in example above,
            // because we check a range
            boolean isPrime2 = true;
            // we need to use one more loop to check a divisors inside all numbers in the range
            for(int j = 2; j < i; j++){

                if(i % j == 0){
                    // if condition above will be true, our boolean became false.
                    // Because following iterator we determine that number have other divisors.
                    isPrime2 = false;
                    break; // we use break because if loop find at least one we don't need to check anymore
                }
            }

            if(isPrime2){
                System.out.print(i + " ");
            }
        }

    }
}
