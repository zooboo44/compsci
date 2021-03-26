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

    //Delete inventory
    public static void delInven(int num){
        inven.remove(num);
        totalPrice -= Items.getItemPrice();
        totalQuantity -= Items.getQuant();
    }

    //Print Inventory
    public static void printInven(){
        for(int i = 0; i < inven.size(); i++){
            System.out.println(i+1 + " " + inven.get(i).toString());
        }
        System.out.println("Total quantity is:" + totalQuantity);
        System.out.println("Total price is:" + totalPrice);
    }
    

    //Clear Inventory
    public static void clearInven(){
        inven.clear();
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
        totalPrice += Items.getItemPrice();
        totalQuantity += Items.getQuant();
    }
    public static void replaceNewFoodInven(int n, String name, int ID, double price, boolean in_stock, int quant, boolean food){
        name = name;
        ID = ID;
        price = price;
        in_stock = in_stock;
        food = food;
        NonFood newNonFood = new NonFood(name, ID, price, in_stock, quant, food);
        inven.set(n, newNonFood);
        totalPrice += Items.getItemPrice();
        totalQuantity += Items.getQuant();
    }
    
}