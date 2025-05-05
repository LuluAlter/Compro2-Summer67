import java.util.Scanner;

public class StartBattle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Row = sc.nextInt();
        int Col = sc.nextInt();
        int [][] map = new int[Row + 1][Col + 1];

        for(int i = 1 ; i <= Row ; i++){
            for (int j = 1 ; j <= Col ; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        int firstHit = 0;
        int firstMiss = 0;
        int shipHitAgain =  0;
        int missHitAgain = 0;
        int out = 0;

        for(int i = 0 ; i < k ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if((x > 0 && x <= Row) && (y > 0 && y <= Col) && map[x][y] == 1 ){
                firstHit = firstHit + 1;
                map[x][y] = map[x][y] + 1;
            }
            else if((x > 0 && x <= Row) && (y > 0 && y <= Col) && map[x][y] == 0) {
                firstMiss = firstMiss + 1;
                map[x][y] = map[x][y] - 1;
            }
            else if((x > 0 && x <= Row) && (y > 0 && y <= Col) && map[x][y] > 1) {
                shipHitAgain = shipHitAgain + 1;
                map[x][y] = map[x][y] + 1;
            }
            else if((x > 0 && x <= Row) && (y > 0 && y <= Col) && map[x][y] < 0) {
                missHitAgain = missHitAgain + 1;
                map[x][y] = map[x][y] - 1;
            }
            else{
                out = out + 1;
            }
        }
        System.out.println(firstHit);
        System.out.println(firstMiss);
        System.out.println(shipHitAgain);
        System.out.println(missHitAgain);
        System.out.println(out);
    }
}
