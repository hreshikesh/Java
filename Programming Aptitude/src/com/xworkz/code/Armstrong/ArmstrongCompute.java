package com.xworkz.code.Armstrong;

public class ArmstrongCompute {

    public boolean amstrongCompute(int no) {
        int digit;
        int mult = 0;
        int num=no;

        while (no != 0) {
            digit = no % 10;
            mult += digit * digit * digit;
            no = no / 10;
        }

        if(num==mult){

            return true;
        }
        else

            return false;

    }
}
