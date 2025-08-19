package com.xworkz.runner;


import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
//        int[] a = {10, 4, 5, 1, 7, 8, 9};

        Scanner sc =new Scanner(System.in);


        int a[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }

        int temp;
        int maxSum=0;
        int minSum=0;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
            }
        }




        int[] asc=Arrays.copyOf(a,4);
        for(int  i=0;i<asc.length;i++) {
            maxSum+=asc[i];
        }



            for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }



        int[] dsc=Arrays.copyOf(a,4);
        for(int  i=0;i<dsc.length;i++) {
            minSum+=dsc[i];
        }
        System.out.println(maxSum+" "+minSum);







        }
}
