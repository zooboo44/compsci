package project;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory{
    public static ArrayList<Items> inven = new ArrayList<Items>();
    Scanner scan = new Scanner (System.in);
    private String name;
    private int ID;
    private double price;
    private boolean in_stock;
    private boolean food;
    private int quant;
    private static double totalPrice;
    private static int totalQuantity;
    public static void main(String[] args) {
    
    }

    //Add Food Item
    public static void addFood(String name, int ID, double price, boolean in_stock, int quant, boolean food){
        name = name;
        ID = ID;
        price = price;
        in_stock = in_stock;
        food = food;
        quant = quant;
        Food newFood = new Food(name, ID, price, in_stock, quant, food);
        inven.add(newFood);
        totalPrice += Items.getItemPrice();
        totalQuantity += Items.getQuant();
    }

    //Add Non food item
    public static void addNonFood(String name, int ID, double price, boolean in_stock, int quant, boolean food){
        name = name;
        ID = ID;
        price = price;
        in_stock = in_stock;
        food = food;
        quant = quant;
        NonFood newNonFood = new NonFood(name, ID, price, in_stock, quant, food);
        inven.add(newNonFood);
        totalPrice += Items.getItemPrice();
        totalQuantity += Items.getQuant();
    }

    //Remove item from inventory
    public static void delInven(int num){
        inven.get(num);
        totalPrice -= Items.getItemPrice();
        totalQuantity -= Items.getQuant();
        inven.remove(num);
    }

    //Print Inventory
    public static void printInven(){
        System.out.println(inven);
        System.out.println(inven.get(0));
        System.out.println(inven.get(1));
        /* int num = 0;
        for(num = 0; num < inven.size(); num++){
            System.out.println(num + " " + inven.get(num));
            //System.out.println(i + " " + inven.get(i));
        }
        System.out.println("Total quantity:" + totalQuantity);
        System.out.println("Total price:" + totalPrice); */
    }
    

    //Clear Inventory
    public static void clearInven(){
        inven.clear();
        totalPrice = 0;
        totalQuantity = 0;
    }

    //Replace item
    //Polymorphism for food and non food items
    public static void replaceNewNonFoodInven(int n, String name, int ID, double price, boolean in_stock, int quant, boolean food){
        name = name;
        ID = ID;
        price = price;
        in_stock = in_stock;
        food = food;
        quant = quant;
        NonFood newNonFood = new NonFood(name, ID, price, in_stock, quant, food);
        inven.set(n, newNonFood);
    }
    public static void replaceNewFoodInven(int n, String name, int ID, double price, boolean in_stock, int quant, boolean food){
        name = name;
        ID = ID;
        price = price;
        in_stock = in_stock;
        food = food;
        NonFood newNonFood = new NonFood(name, ID, price, in_stock, quant, food);
        inven.set(n, newNonFood);
    }
    
}