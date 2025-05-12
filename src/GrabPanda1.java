import java.util.Scanner;

class FoodOrder{
    String name;
    int foodTotal;
    int sentPrice = 0;
    public FoodOrder(String name){
        this.name = name;
    }

    public void addFood(int price){
        foodTotal = foodTotal + price;
        if(foodTotal <= 50){
            sentPrice = 20;
        }
        else if(foodTotal <= 150){
            sentPrice = 10;
        }
        else{
            sentPrice = 0;
        }
    }

    public void finalizeReceipt(){
        System.out.println(name);
        System.out.println(foodTotal);
        System.out.println(sentPrice);
        System.out.println(foodTotal + sentPrice);
    }
}


public class GrabPanda1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        FoodOrder f = new FoodOrder(name);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int price = sc.nextInt();
            f.addFood(price);
        }
        f.finalizeReceipt();
    }
}
