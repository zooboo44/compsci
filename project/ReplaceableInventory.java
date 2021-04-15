package project;

class ReplaceableInventory {

    private InventoryInterface inventory;

    public ReplaceableInventory(InventoryInterface inventory) {
        this.inventory = inventory;
    }

    //Replace item
    //Polymorphism for food and non food items
    public void replaceItem(int n, String name, int ID, double price, boolean in_stock, int quant){
      this.inventory.delInven(n);
      this.inventory.addNonFood(name, ID, price, in_stock, quant);
    }
    public void replaceItem(int n, String name, int ID, double price, boolean in_stock, int quant, boolean food){
      if (!food) {
        replaceItem(n, name, ID, price, in_stock, quant);
      } else {
        this.inventory.delInven(n);
        this.inventory.addFood(name, ID, price, in_stock, quant);
      }
    }

}
