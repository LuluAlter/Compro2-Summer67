import java.util.Scanner;

public class LongestString4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Longest = 0;
        String LongestStr = "";
        for (;;) {
            String str = sc.nextLine();

            if(str.length() == 0){
                break;
            }
            
            if(str.length() >= Longest){
                Longest = str.length();
                LongestStr = str;
            }
        }

        System.out.println(LongestStr);
    }   
}
