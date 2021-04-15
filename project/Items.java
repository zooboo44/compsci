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

    public int getQuant(){
        return quant;
    }

    public String toString(){
        return "Name:" + this.item_name + " ID:" + this.item_ID + " Price:"+ this.item_price + " In Stock:"+ this.in_stock + " Quantity:" + quant;
    }

    public abstract boolean getIsFood();
}