package project;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
    
    String name = "apples";
    int ID = 34;
    double price = 21.0;
    boolean in_stock = true;
    boolean food = true;
    Inventory.addFood(name, ID, price, in_stock, 0, food);
    Inventory.printInven();
    
    
    
    
        /*     Scanner scan = new Scanner (System.in);
        System.out.println("select item");
        int select;
        select = scan.nextInt();
        if(select == 1){
                String username;
                int userID;
                double userPrice;
                boolean Userin_stock;
                boolean Userfood;
            
            System.out.println("Enter stuff");
            username = scan.next();
            userID = scan.nextInt();
            userPrice = scan.nextDouble();
            Userin_stock = scan.nextBoolean();
            Userfood = scan.nextBoolean();
        } */
    }
}