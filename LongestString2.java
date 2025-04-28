
import java.util.Scanner;

public class LongestString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Longest = 0;
        String LongestStr = "";
        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            if(str.length() > Longest){
                Longest = str.length();
                LongestStr = str;
            }
        }

        System.out.println(LongestStr);
    }   
}
