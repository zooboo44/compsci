package project;
import java.util.ArrayList;

public class Inventory implements Admin {
    public ArrayList<Items> inven = new ArrayList<>();
    private double totalPrice;
    private int totalQuantity;

    //Add Food Item
    public void addFood(String name, int ID, double price, boolean in_stock, int quant, boolean food){
        Food newFood = new Food(name, ID, price, in_stock, quant, food);
        inven.add(newFood);
        totalPrice += newFood.getItemPrice();
        totalQuantity += newFood.getQuant();
    }

    //Add Non food item
    public void addNonFood(String name, int ID, double price, boolean in_stock, int quant, boolean food){
        NonFood newNonFood = new NonFood(name, ID, price, in_stock, quant, food);
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

    //Print Inventory
    public void printInven(){
        for(Items number: inven){
            System.out.println(number);
        }
        System.out.println("Total quantity:" + totalQuantity);
        System.out.println("Total price:" + Math.round(totalPrice*100)/100);
    }

    @Override
    public void addFood() {
        // TODO: implement
    }

    @Override
    public void addNonFood() {
        // TODO: implement
    }

    @Override
    public void delInven() {
        // TODO: implement
    }

    //Clear Inventory
    public void clearInven(){
        inven.clear();
        totalPrice = 0;
        totalQuantity = 0;
    }

    //Replace item
    //Polymorphism for food and non food items
    public void replaceNewNonFoodInven(int n, String name, int ID, double price, boolean in_stock, int quant, boolean food){
        NonFood newNonFood = new NonFood(name, ID, price, in_stock, quant, food);
        inven.set(n, newNonFood);
    }
    public void replaceNewFoodInven(int n, String name, int ID, double price, boolean in_stock, int quant, boolean food){
        Food newFood = new Food(name, ID, price, in_stock, quant, food);
        inven.set(n, newFood);
    }
    
}