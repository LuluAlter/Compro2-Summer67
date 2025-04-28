import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String find = sc.nextLine();
        if(str.indexOf(find) == -1){
            System.out.println("string not found");
        }
        else{
            System.out.println(str.indexOf(find) + 1);
        }
    }
}
