package com.academiacx;

public class EX4Fibonacci {
    static long fibo(int n){
        if(n < 2){
            return n;
        }
            else {
                return fibo(n - 1) + fibo(n - 2);
            }
    }
}
