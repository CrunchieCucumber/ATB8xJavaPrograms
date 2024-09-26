package Sept.ex_25092024;

//0,1 are not prime numbers
//2 is the only even prime number
//For other numbers, the loop runs from 2 to the square root of the number.
//If the number is divisible by any number in this range, it's not prime.

public class Lab029_PrimeNumber {
    public static void main(String[] args) {
        int number = 2173;
        boolean isPrime = true;

        if(number<=1)
            isPrime=false;
        else{
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime) System.out.println(number + " is a prime number.");
        else System.out.println(number + " is not a prime number.");
    }
}
