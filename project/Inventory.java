package project;
import java.util.ArrayList;

public class Inventory implements Admin{
    public static ArrayList<Items> inven = new ArrayList<>();
    private static double totalPrice;
    private static int totalQuantity;

    //Add Food Item
    @Override
    public static void addFood(String name, int ID, double price, boolean in_stock, int quant, boolean food){
        Food newFood = new Food(name, ID, price, in_stock, quant, food);
        inven.add(newFood);
        totalPrice += newFood.getItemPrice();
        totalQuantity += newFood.getQuant();
    }

    //Add Non food item
    @Override
    public static void addNonFood(String name, int ID, double price, boolean in_stock, int quant, boolean food){
        NonFood newNonFood = new NonFood(name, ID, price, in_stock, quant, food);
        inven.add(newNonFood);
        totalPrice += newNonFood.getItemPrice();
        totalQuantity += newNonFood.getQuant();
    }

    //Remove item from inventory
    public static void delInven(int num){
        Items item = inven.remove(num);
        totalPrice -= item.getItemPrice();
        totalQuantity -= item.getQuant();
    }

    //Print Inventory
    @Override
    public static void printInven(){
        for(int i = 0; i < inven.size(); i++){
            System.out.println(i+1 + " " + inven.get(i));
        }
        System.out.println("Total quantity:" + totalQuantity);
        System.out.println("Total price:" + Math.round(totalPrice*100)/100);
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
        NonFood newNonFood = new NonFood(name, ID, price, in_stock, quant, food);
        inven.set(n, newNonFood);
    }
    public static void replaceNewFoodInven(int n, String name, int ID, double price, boolean in_stock, int quant, boolean food){
        Food newFood = new Food(name, ID, price, in_stock, quant, food);
        inven.set(n, newFood);
    }
    
}