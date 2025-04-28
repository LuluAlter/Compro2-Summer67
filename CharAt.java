import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x = sc.nextInt();
        if(x == 0 || x >= str.length()){
            System.out.println("invalid position");
        }
        else{
            System.out.println(str.charAt(x-1));
        }
    }
}
