package com.Bridgelabz;

public class PrimeNumbers {

    public void primeNumber(){
        int i;
        int num;
        int result;
        for( i=1; i<=1000; i++){
            num = i/2;
            result = num%2;
            if(result == 0){
                System.out.println(i +" is not a prime number");
            }
            System.out.println(i + " is a prime number");
        }
    }

    public static void main(String[] args) {
        PrimeNumbers call = new PrimeNumbers();
        call.primeNumber();
    }
}
