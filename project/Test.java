package project;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
    
    String name = "apples";
    int ID = 34;
    double price = 21.0;
    boolean in_stock = true;
    boolean food = true;
    Inventory.addFood(name, ID, price, in_stock, food);
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
    public static void test(){
        Scanner scan = new Scanner (System.in);
        System.out.println("\nEntering Food Item");
                System.out.println("Please enter the Item's NAME (string), ID(integer), PRICE(double), STOCK AVAILABILITY(boolean), Quantity(integer)");
                System.out.print("Name:");
                String name = "null";
                int catchStatement = 10;
                while (catchStatement == 10){
                    try {
                        name = scan.next();
                        catchStatement = 20;
                      } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a string value.");
                        scan.next();
                      }
                }
                catchStatement = 10;
                System.out.print("ID:");
                int ID = 0;
                while (catchStatement == 10){
                    try {
                        ID = scan.nextInt();
                        catchStatement = 20;
                      } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter an integer value.");
                        scan.next();
                      }
                }
                catchStatement = 10;
                System.out.print("Price:");
                double price = 0;
                while (catchStatement == 10){
                    try {
                        price = scan.nextDouble();
                        catchStatement = 20;
                      } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a double value.");
                        scan.next();
                      }
                }
                catchStatement = 10;
                System.out.println("Is item in stock true/false: ");
                Boolean in_stock = false;
                while (catchStatement == 10){
                    try {
                        in_stock = scan.nextBoolean();
                        catchStatement = 20;
                      } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a boolean value.");
                        scan.next();
                      }
                }
                catchStatement = 10;
                System.out.print("Quantity:");
                int quant = 0;
                while (catchStatement == 10){
                    try {
                        quant = scan.nextInt();
                        catchStatement = 20;
                      } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter an integer value.");
                        scan.next();
                      }
                }
                catchStatement = 10;
                String isFood;
                boolean food;
                boolean loop = true;
                while (loop == true){
                    System.out.print("Is the item a food yes/no: ");
                    isFood = scan.next().toLowerCase();
                    if(isFood.equals("yes")){
                        food = true;
                        Inventory.addFood(name, ID, price, in_stock, quant, food);
                        System.out.println();
                        loop = false;
                    }
                    else if(isFood.equals("no")){
                        food = false;
                        Inventory.addNonFood(name, ID, price, in_stock, quant, food);
                        System.out.println();
                        loop = false;
                    }
                    else{
                        System.out.println("Answer yes or no");
                    }
                }


                System.out.println("Please enter the Item's NAME (string), ID(integer), PRICE(double), STOCK AVAILABILITY(boolean), Quantity(integer)");
                System.out.print("Name:");
                String name = scan.next();
                System.out.print("ID:");
                int ID = scan.nextInt();
                System.out.print("Price:");
                double price = scan.nextDouble();
                System.out.print("In stock (true/false):");
                boolean in_stock = scan.nextBoolean();
                System.out.print("Quantity:");
                int quant = scan.nextInt();
                String isFood;
                boolean food;
                boolean loop = true;
                while (loop == true){
                    System.out.println("Is the item a food yes/no: ");
                    isFood = scan.next().toLowerCase();
                    if(isFood.equals("yes")){
                        food = true;
                        Inventory.replaceNewFoodInven(replaceInt, name, ID, price, in_stock, quant, food);
                        System.out.println();
                        loop = false;
                    }
                    else if(isFood.equals("no")){
                        food = false;
                        Inventory.replaceNewNonFoodInven(replaceInt, name, ID, price, in_stock, quant, food);
                        System.out.println();
                        loop = false;
                    }
                    else{
                        System.out.println("Answer yes or no");
                    }
                }
    }
}