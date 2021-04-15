package project;

public class Food extends Items {

    public Food(String name, int ID, double price, boolean in_stock, int quant){
        super(name, ID, price, in_stock, quant);
    }

    public boolean getIsFood(){
        return true;
    }

    public String toString(){
        return super.toString() + " Is food:" + this.getIsFood();
    }
}