import java.util.Scanner;

public class IndexOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String find = sc.nextLine();
        System.out.println(str.length());
        if(str.indexOf(find) == -1){
            System.out.println("string not found");
        }
        else{
            for (int i = 0; i < str.lastIndexOf(find) + 1; i++) {
                    System.out.print(str.indexOf(find,i) + 1 + " ");
                    i = str.indexOf(find,i);
            }
        }
        
    }
}

