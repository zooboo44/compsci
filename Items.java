package project;

public abstract class Items {
    private String item_name;
    private int item_ID;
    private double item_price;
    private boolean in_stock;
    
    public Items(String name, int ID, double price, boolean in_stock){
        this.item_name = name;
        this.item_ID = ID;
        this.item_price = price;
        this.in_stock = in_stock;
    }

    public String getItemName(){
        return item_name;
    }

    public int getItemID(){
        return item_ID;
    }

    public double getItemPrice(){
        return item_price;
    }

    public boolean getInStock(){
        return in_stock;
    }

    public String toString(){
        return "Name: " + this.item_name + " ID: " + this.item_ID + " Price: "+ this.item_price + " In Stock: "+ this.in_stock;
    }
    
    public abstract boolean getIsFood();
}
