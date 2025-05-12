import java.util.Scanner;

class FoodOrder{
    String name;
    int foodTotal;
    int sentPrice = 0;
    int grandTotal;
    int Rider;
    int GrabPanda;
    int FoodSeller;

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

    public void distributeIncome(){
        if(foodTotal <= 200){
            Rider = 20;
        }
        else{
            Rider = 30;
        }

        GrabPanda = (foodTotal * 3) / 10;
        FoodSeller = grandTotal - Rider - GrabPanda;

        System.out.println("Rider: " + Rider);
        System.out.println("GrabPanda: " + GrabPanda);
        System.out.println("Food Seller: " + FoodSeller);
    }

    public void finalizeReceipt(){
        grandTotal = foodTotal + sentPrice;

        System.out.println(name);
        System.out.println(foodTotal);
        System.out.println(sentPrice);
        System.out.println(grandTotal);
    }
}


public class GrabPanda2 {
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
        f.distributeIncome();
    }
}
