import java.util.Scanner;

public class LongestString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Longest = 0;
        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            if (str.length() > Longest) {
                Longest = str.length();
            }
        }
        System.out.println(Longest);
        sc.close();
    }
}
