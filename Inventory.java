package project;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory{
    public static ArrayList<Items> inven = new ArrayList<Items>();
    Scanner scan = new Scanner (System.in);
    private static String name;
    private static int ID;
    private double price;
    private boolean in_stock;
    private boolean food;
    public static void main(String[] args) {
    
    }

    //Add Food Item
    public static void addFood(String name, int ID, double price, boolean in_stock, boolean food){
        name = name;
        ID = ID;
        price = price;
        in_stock = in_stock;
        food = food;

        Food newFood = new Food(name, ID, price, in_stock, food);
        inven.add(newFood);
    }

    //Add Non food item
    public static void addNonFood(String name, int ID, double price, boolean in_stock, boolean food){
        name = name;
        ID = ID;
        price = price;
        in_stock = in_stock;
        food = food;

        NonFood newNonFood = new NonFood(name, ID, price, in_stock, food);
        inven.add(newNonFood);
    }

    //Delete inventory
    public static void delInven(int num){
        inven.remove(num);
    }

    //Print Inventory
    public static void printInven(){
        for(int i = 0; i < inven.size(); i++){
            System.out.println(i+1 + " " + inven.get(i).toString());
        }
    }
    

    //Clear Inventory
    public static void clearInven(){
        inven.clear();
    }

    //Replace item
    //Polymorphism for food and non food items
    public static void replaceNewNonFoodInven(int n, String name, int ID, double price, boolean in_stock, boolean food){
        name = name;
        ID = ID;
        price = price;
        in_stock = in_stock;
        food = food;
        NonFood newNonFood = new NonFood(name, ID, price, in_stock, food);
        inven.set(n, newNonFood);
    }

    public String toString() {
        String results = "+";
        for(Items obj: inven) {
            System.out.println(obj + " ");
        }
        return results;
      }
    
}