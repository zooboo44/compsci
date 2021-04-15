package project;

public class NonFood extends Items {
    public NonFood(String name, int ID, double price, boolean in_stock, int quant){
        super(name, ID, price, in_stock, quant);
    }

    public boolean getIsFood(){
        return false;
    }

    public String toString(){
        return super.toString() + " Is food:" + this.getIsFood();
    }

}