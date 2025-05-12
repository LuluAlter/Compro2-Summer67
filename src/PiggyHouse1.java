import java.util.Scanner;

class House {
    public int width;
    public int length;
    public int pigCount;

    public House(int width, int length){
        this.width = width;
        this.length = length;
    }

    public void printPiggie(){
        System.out.println("Piggies " + pigCount + ", Space " + (9 * pigCount));
    }

    public static void encourage(){
        System.out.println("Piggy Together STRONG!");
    }
}

public class PiggyHouse1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int l = sc.nextInt();
        House h = new House(w, l);
        h.encourage();
        for(;;){
            int k = sc.nextInt();
            if((9 * (k + h.pigCount)) <= (w * l)){
                h.pigCount += k ;
                h.printPiggie();
            }
            else{
                System.out.println("no space, need a new house");
                break;
            }
        }
    }
}
