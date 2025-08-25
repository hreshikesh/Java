package com.xworkz.runner;

public class NPrimeNumbers {

    public static boolean primeNumbef(int n){
        if(n==0||n==1){
            return false;
        }else {
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean value;
        for(int i=1;i<=100;i++){
          value= primeNumbef(i);
            if(value){
                System.out.println(i);
            }
        }

    }
}
