package project;
import java.util.ArrayList;
public class Inventory implements InventoryInterface {
    //Instantiate Arraylist and create variables
    private final ArrayList<Items> inven = new ArrayList<>();
    private double totalPrice;
    private int totalQuantity;
    //Add Food Item
    public void addFood(String name, int ID, double price, boolean in_stock, int quant){
        Food newFood = new Food(name, ID, price, in_stock, quant);
        inven.add(newFood);
        totalPrice += newFood.getItemPrice();
        totalQuantity += newFood.getQuant();
    }
    //Add Non food item
    public void addNonFood(String name, int ID, double price, boolean in_stock, int quant){
        NonFood newNonFood = new NonFood(name, ID, price, in_stock, quant);
        inven.add(newNonFood);
        totalPrice += newNonFood.getItemPrice();
        totalQuantity += newNonFood.getQuant();
    }
    //Remove item from inventory
    public void delInven(int num){
        Items item = inven.remove(num);
        totalPrice -= item.getItemPrice();
        totalQuantity -= item.getQuant();
    }
    //Print Inventory using iteration by enhanced loop
    public void printInven(){
        int i = 0;
        for(Items number: inven){
            i++;
            System.out.print(i + " ");
            System.out.println(number);
        }
        System.out.println("Total quantity:" + totalQuantity);
        System.out.println("Total price:" + Math.round(totalPrice*100)/100);
    }
    //Clear Inventory
    public void clearInven(){
        inven.clear();
        totalPrice = 0;
        totalQuantity = 0;
    }
}