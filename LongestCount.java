import java.util.Scanner;

public class LongestCount {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int Longest = 0;
       int LongestCount = 0;
       for(;;){
        String str = sc.nextLine();
        if(str.length() == 0){
            break;
        }
        if(str.length() > Longest){
            Longest = str.length();
            LongestCount = 1;
        }
        else if(str.length() == Longest){
            LongestCount += 1;
        }
       }
       System.out.println(Longest);
       System.out.println(LongestCount);
    }
}