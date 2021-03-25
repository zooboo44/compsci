package project;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner scan = new Scanner (System.in);
        
        //Break condition
        boolean run = true;
        
        //Break statement start
        while(run == true){
            System.out.println("\n\n\nHello Welcome to the inventory");
            System.out.println("Please select what you want to do:");
            System.out.println("1. View Inventory");
            System.out.println("2. Add items");
            System.out.println("3. Remove Element");
            System.out.println("4. Replace Element");
            System.out.println("5. Clear Inventory List");
            System.out.println("0. Exit Program");
            int select = scan.nextInt();
            
            //Prints Inventory
            if(select == 1){
                System.out.println("Printing Inventory:");
                Inventory.printInven();
            }
            //Adds food items to array list
            else if (select == 2) {
                String name;
                int ID;
                double price;
                boolean in_stock;
                boolean food; 
                String isFood;
                System.out.println("Entering Food Item");
                System.out.println("Please enter the Item's NAME (string), ID(integer), PRICE(double), STOCK AVAILABILITY(boolean)");
                name = scan.next();
                ID = scan.nextInt();
                price = scan.nextDouble();
                in_stock = scan.nextBoolean();
                boolean loop = true;
                while (loop == true){
                    System.out.println("Is the item a food yes/no: ");
                    isFood = scan.next().toLowerCase();
                    if(isFood.equals("yes")){
                        food = true;
                        Inventory.addFood(name, ID, price, in_stock, food);
                        loop = false;
                    }
                    else if(isFood.equals("no")){
                        food = false;
                        Inventory.addNonFood(name, ID, price, in_stock, food);
                        loop = false;
                    }
                    else{
                        System.out.println("Answer yes or no");
                    }
                }
            }
            //Removes Item from arraylist
            else if (select ==3) {
            
                System.out.println("What item do you want to remove?");
                Inventory.printInven();
                int RemUserin;
                RemUserin = scan.nextInt();
                Inventory.delInven(RemUserin);
            }
            //Replaces Item
            else if (select == 4) {
                int replaceInt;
                System.out.println("What Item do you want to replace: ");
                Inventory.printInven();
                replaceInt = scan.nextInt();
                
            }
            //Clears Inventory List
            else if (select == 5) {
                System.out.println("Are you sure you want to clear inventory? This action cannot be undone");
                System.out.println("Type YES to confirm");
                String ExitUserin;
                ExitUserin = scan.next();
                if (ExitUserin.equals("YES")){
                    Inventory.clearInven();
                }
                else{
                    System.out.println("Going back to menu");
                }
            }
            //Exits Program
            else if (select == 0) {
            
                String exitProgram;
                System.out.println("Please type 'EXIT' to exit program otherwise press enter");
                exitProgram = scan.next();
                if (exitProgram.equals("EXIT")) {
                    break;
                }   
            }
        }
    }
}
