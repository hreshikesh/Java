package tracanx;

public class StringPatternMatching {

    public static void main(String[] args) {
        String text="vbhiav";
        String pattern="bha";
        boolean flag=false;

        int count=0;

        for (int i = 0; i <text.length() ; i++) {
            if(text.charAt(i)==pattern.charAt(count)){
                count++;
                if (count==pattern.length()) {
                    flag=true;
                    break;

                }
            } else  {
                count=0;
            }
        }
        System.out.println(flag);

    }
}
