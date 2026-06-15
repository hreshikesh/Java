package tracanx;


public class StringDuplicate {
    public static void main(String[] args) {
        String name="malayalam";


        for (int i = 0; i <name.length() ; i++) {
            char ch=name.charAt(i);
            for (int j = i+1; j <name.length() ; j++) {
                char ch1=name.charAt(j);
                if(ch==ch1 && name.indexOf(ch)==i){
                    System.out.println(ch);
                    break;
                }


            }
        }
    }
}
