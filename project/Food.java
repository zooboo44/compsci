package project;
public class Food extends Items {
    //Constructor
    public Food(String name, int ID, double price, boolean in_stock, int quant){
        super(name, ID, price, in_stock, quant);
    }
    //Implement abstract method
    public boolean getIsFood(){
        return true;
    }
    //toString
    public String toString(){
        return super.toString() + " Is food:" + this.getIsFood();
    }
}