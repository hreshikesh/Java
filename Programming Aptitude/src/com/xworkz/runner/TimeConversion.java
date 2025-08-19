package com.xworkz.runner;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
//       String time="07:30:00AM";

        Scanner sc=new Scanner(System.in);

        String time=sc.next();

       String hour=time.substring(0,2);
//        System.out.println(hour);
       String minutes=time.substring(3,5);
//        System.out.println(minutes);
        String seconds=time.substring(6,8);
        String meridian=time.substring(8,10);
//        System.out.println(seconds);
//        System.out.println(meridian);

        int converted_hour =Integer.parseInt(hour);
//        System.out.println(converted_hour);

       if(meridian.equals("AM")) {
           if (converted_hour == 12) {
               converted_hour = 00;
           }
       }
         if(meridian.equals("PM")){
             if(converted_hour==12)
             converted_hour=12;
             else converted_hour+=12;
          }


        System.out.printf("%02d:%s:%s\n",converted_hour,minutes,seconds);

}}
