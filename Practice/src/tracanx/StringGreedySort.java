package tracanx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringGreedySort {
    public static void main(String[] args) {
        String[] values={"30","13","34"};
        String revs="";

        List<String> lists= new ArrayList<>(Arrays.asList(values));

       lists.sort((a,b)->(b+a).compareTo(a+b));


        List<String> resultList=lists;

        for (String list:resultList){
            revs+=list;
        }

        System.out.println(revs);


    }
}
