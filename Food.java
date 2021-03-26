package project;

public class Food extends Items {

    private boolean is_food;
    public Food(String name, int ID, double price, boolean in_stock, int quant, boolean food){
        super(name, ID, price, in_stock, quant);
        this.is_food = food;
    }

    public boolean getIsFood(){
        return is_food; 
    }
    public String toString(){
        return super.toString() + " Is food:" + this.is_food;
    }
}