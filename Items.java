package project;

public abstract class Items {
    private static String item_name;
    private static int item_ID;
    private static double item_price;
    private static boolean in_stock;
    private static int quant;
    
    public Items(String name, int ID, double price, boolean in_stock, int quant){
        this.item_name = name;
        this.item_ID = ID;
        this.item_price = price;
        this.in_stock = in_stock;
        this.quant = quant;
    }

    public static String getItemName(){
        return item_name;
    }

    public static int getItemID(){
        return item_ID;
    }

    public static double getItemPrice(){
        return item_price;
    }

    public static boolean getInStock(){
        return in_stock;
    }

    public static int getQuant(){
        return quant;
    }

    public String toString(){
        return "Name:" + this.item_name + " ID:" + this.item_ID + " Price:"+ this.item_price + " In Stock:"+ this.in_stock + " Quantity:" + quant;
    }
    
    public abstract boolean getIsFood();
}
