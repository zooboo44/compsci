package project;

public class NonFood extends Items {

    private boolean is_food;
    
    public NonFood(String name, int ID, double price, boolean in_stock, boolean food){
        super(name, ID, price, in_stock);
        this.is_food = food;
    }

    public boolean getIsFood(){
        return is_food; 
    }

}