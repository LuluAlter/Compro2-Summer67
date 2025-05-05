import java.util.Scanner;

public class BattleMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Row = sc.nextInt();
        int Col = sc.nextInt();
        int [][] map = new int[Row][Col];

        for(int i = 0 ; i < Row ; i++){
            for (int j = 0 ; j < Col ; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        System.out.println(k);

        for(int i = 0 ; i < Row ; i++){
            for (int j = 0 ; j < Col ; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}
