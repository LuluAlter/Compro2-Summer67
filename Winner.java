import java.util.Scanner;

public class Winner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Row = sc.nextInt();
        int Col = sc.nextInt();
        int [][] map = new int[Row + 1][Col + 1];
        int totalShip = 0;

        for(int i = 1 ; i <= Row ; i++){
            for (int j = 1 ; j <= Col ; j++) {
                map[i][j] = sc.nextInt();
                if(map[i][j] == 1){
                    totalShip = totalShip + 1;
                }
            }
        }

        int k = sc.nextInt();
        int firstHit = 0;
        int firstMiss = 0;
        int shipHitAgain =  0;
        int missHitAgain = 0;
        int out = 0;
        int firstShip = 0;
        int lastShip = 0;

        for(int i = 0 ; i < k ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if((x > 0 && x <= Row) && (y > 0 && y <= Col) && map[x][y] == 1 ){
                firstHit = firstHit + 1;
                map[x][y] = map[x][y] + 1;
                if(firstShip == 0){
                    firstShip = i + 1;
                }
                if(firstHit == totalShip){
                    lastShip = i + 1;
                }
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

        if(lastShip != 0){
            System.out.println("attacker " + lastShip);
        }
        else if (firstShip != 0) {
            System.out.println("battleship " + firstShip);
        }
        else{
            System.out.println("battleship -1");
        }
    }
}
