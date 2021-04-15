package project;
public abstract class Items {
    private String item_name;
    private int item_ID;
    private double item_price;
    private boolean in_stock;
    private int quant;
    public Items(String name, int ID, double price, boolean in_stock, int quant){
        this.item_name = name;
        this.item_ID = ID;
        this.item_price = price;
        this.in_stock = in_stock;
        this.quant = quant;
    }
    //Returns the item price that is used in another class to calculate the total price
    public double getItemPrice(){
        return item_price;
    }
    //Returns the item quantity that is used in another class to calculate the total price
    public int getQuant(){
        return quant;
    }
    //toString
    public String toString(){
        return "Name:" + this.item_name + " ID:" + this.item_ID + " Price:"+ this.item_price + " In Stock:"+ this.in_stock + " Quantity:" + quant;
    }
    //Declare an abstract method
    public abstract boolean getIsFood();
}