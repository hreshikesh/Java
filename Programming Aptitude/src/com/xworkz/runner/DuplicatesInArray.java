package com.xworkz.runner;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int cost[]={10,20,20,30,30,90,80};

        for (int i = 0; i <cost.length ; i++) {
            for (int j = i+1; j < cost.length ; j++) {
                if(cost[i]==cost[j]){
                    System.out.println(cost[i]);
                }
            }
        }
    }
}
