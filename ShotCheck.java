import java.util.Scanner;

public class ShotCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Row = sc.nextInt();
        int Col = sc.nextInt();
        int k = sc.nextInt();

        int inCount = 0;
        int outCount = 0;

        for(int i = 0 ; i < k ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if((x > 0 && x <= Row) && (y > 0 && y <= Col) ){
                inCount = inCount + 1;
            }
            else{
                outCount = outCount + 1;
            }
        }

        System.out.println(inCount);
        System.out.println(outCount);

    }
}
