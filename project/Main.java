package project;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Inventory inven = new Inventory();

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
            int select = -1;
            while (select < 0 || select > 5) {
                try {
                  select = scan.nextInt();
                } catch (InputMismatchException e) {
                  System.out.println("Invalid input. Please enter an integer value.");
                  scan.next();
                }
            }

            //Prints Inventory
            if(select == 1){
                System.out.println("\nPrinting Inventory:");
                inven.printInven();
                System.out.println("\n");
            }
            //Adds food items to array list
            else if (select == 2) {
                userInputPrompt(inven);
            }
            //Removes Item from arraylist
            else if (select ==3) {
                System.out.println("\nWhat item do you want to remove?");
                inven.printInven();
                int RemUserin;
                RemUserin = scan.nextInt() - 1;
                inven.delInven(RemUserin);
                System.out.println();
            }
            //Replaces Item
            else if (select == 4) {
                int replaceInt;
                System.out.println("\nWhat Item do you want to replace: ");
                inven.printInven();
                replaceInt = scan.nextInt() - 1;
                replaceInputPrompt(inven, replaceInt);
            }
            //Clears Inventory List
            else if (select == 5) {
                System.out.println("\nAre you sure you want to clear inventory? This action cannot be undone");
                System.out.println("Type YES to confirm");
                String ExitUserin;
                ExitUserin = scan.next();
                if (ExitUserin.equals("YES")){
                    inven.clearInven();
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

    public static void userInputPrompt(Inventory inven){
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
                        inven.addFood(name, ID, price, in_stock, quant, food);
                        System.out.println();
                        loop = false;
                    }
                    else if(isFood.equals("no")){
                        food = false;
                        inven.addNonFood(name, ID, price, in_stock, quant, food);
                        System.out.println();
                        loop = false;
                    }
                    else{
                        System.out.println("Answer yes or no");
                    }
                }
    }

    public static void replaceInputPrompt(Inventory inven, int n){
        int replaceInt = n;
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
                        inven.replaceNewFoodInven(replaceInt, name, ID, price, in_stock, quant, food);
                        System.out.println();
                        loop = false;
                    }
                    else if(isFood.equals("no")){
                        food = false;
                        inven.replaceNewNonFoodInven(replaceInt, name, ID, price, in_stock, quant, food);
                        System.out.println();
                        loop = false;
                    }
                    else{
                        System.out.println("Answer yes or no");
                    }
                }
    }
}