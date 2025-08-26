package com.xworkz.dsa.array;

public class TargetSum {

    public static void main(String[] args) {
        int[] array={3,4,5,6,9,10};
        int target=15;
        int index1 = 0;
        int index2=0;



        for(int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==target){
                    index1=i;
                    index2=j;

                }
            }
        }

        System.out.println(index1+" "+index2);
    }



}
