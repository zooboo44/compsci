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
            System.out.println("Hello Welcome to the inventory");
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
                System.out.println("\nPrinting Inventory:");
                Inventory.printInven();
                System.out.println("\n");
            }
            //Adds food items to array list
            else if (select == 2) {
                System.out.println("\nEntering Food Item");
                System.out.println("Please enter the Item's NAME (string), ID(integer), PRICE(double), STOCK AVAILABILITY(boolean), Quantity(integer)");
                System.out.print("Name:");
                String name = scan.next();
                System.out.print("ID:");
                int ID = scan.nextInt();
                System.out.print("Price:");
                double price = scan.nextDouble();
                System.out.print("In stock (true/false)");
                boolean in_stock = scan.nextBoolean();
                System.out.print("Quantity:");
                int quant = scan.nextInt();
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
            }
            //Removes Item from arraylist
            else if (select ==3) {
            
                System.out.println("\nWhat item do you want to remove?");
                Inventory.printInven();
                int RemUserin;
                RemUserin = scan.nextInt() - 1;
                Inventory.delInven(RemUserin);
                System.out.println();
            }
            //Replaces Item
            else if (select == 4) {
                int replaceInt;
                System.out.println("\nWhat Item do you want to replace: ");
                Inventory.printInven();
                replaceInt = scan.nextInt() - 1;
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
            //Clears Inventory List
            else if (select == 5) {
                System.out.println("\nAre you sure you want to clear inventory? This action cannot be undone");
                System.out.println("Type YES to confirm");
                String ExitUserin;
                ExitUserin = scan.next();
                if (ExitUserin.equals("YES")){
                    Inventory.clearInven();
                    System.out.println();
                }
                else{
                    System.out.println("Going back to menu");
                    System.out.println();
                }
            }
            //Exits Program
            else if (select == 0) {
            
                String exitProgram;
                System.out.println("\nPlease type 'EXIT' to exit program otherwise press enter");
                exitProgram = scan.next();
                if (exitProgram.equals("EXIT")) {
                    break;
                }   
            }
        }
    }
}
