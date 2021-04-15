package project;
//Inventory interface that will be used in Inventory class
interface InventoryInterface {
  void addFood(String name, int ID, double price, boolean in_stock, int quant);
  void addNonFood(String name, int ID, double price, boolean in_stock, int quant);
  void delInven(int num);
  void clearInven();
  void printInven();
}