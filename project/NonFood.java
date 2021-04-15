package project;
public class NonFood extends Items {
    //Constructor
    public NonFood(String name, int ID, double price, boolean in_stock, int quant){
        super(name, ID, price, in_stock, quant);
    }
    //Implements abstract method
    public boolean getIsFood(){
        return false;
    }
    //toString method
    public String toString(){
        return super.toString() + " Is food:" + this.getIsFood();
    }
}