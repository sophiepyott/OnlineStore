/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/
import java.util.ArrayList;
import java.util.List;
public class Store
{
  //attributes
  private double profit;
  private List<ItemForSale> items;
  
  //constructor
  public Store(){

    this.profit = 0.0;
    this.items = new ArrayList<>();
  }
  //methods
  public void showItems(){

    for(ItemForSale item : items){

      System.out.println(item.getName() + ", $" + item.getPrice());
    }
  }
  public void addItem(ItemForSale item){

    items.add(item);
    System.out.println(item.getName() + " added.");
  }
  public void sellItem(String itemName){

    ItemForSale itemSold = null;

    for(ItemForSale item : items){
      if(item.getName().equals(itemName)){
        itemSold = item;
        break;
      }
    }
    profit += itemSold.getPrice();
    items.remove(itemSold);
    System.out.println(itemSold.getName() + " sold for $" + itemSold.getPrice());
  }
  public void creator(String itemName){

    for(ItemForSale item : items){
      if(item.getName().equals(itemName)){
        System.out.println(item.getCreator());
        return;
      }
    }
  }
  //getter
  public double getProfit(){
    return profit;
  }
}
