import java.util.Scanner;

public class NumTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Row = sc.nextInt();
        int Col = sc.nextInt();
        int [][] arr = new int[Row + 1][Col + 1];

        for(int i = 1 ; i <= Row ; i++){
            for(int j = 1 ; j <= Col ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        int recent = -1;
        boolean isNewLine = true;

        for(int i = 0 ; i < k ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if((x > 0 && x <= Row)&&(y > 0 && y <= Col)){
                if(arr[x][y] == recent){
                    System.out.print("*");
                }
                else{
                    System.out.print(arr[x][y]);
                }
                recent = arr[x][y];
                isNewLine = false;
            }
            else{
                if(isNewLine == false){
                    System.out.println();
                    recent = -1;
                    isNewLine = true;
                }
            }
        }
    }
}
