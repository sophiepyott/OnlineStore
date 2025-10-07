public abstract class ItemForSale
{
    //attributes
    private String name;
    private double price;
    private String dateOfSale;

    //constructor
    public ItemForSale(String name, double price, String dateOfSale){

        this.name = name;
        this.price = price;
        this.dateOfSale = dateOfSale;
    }
    //getters
    public String getName(){

        return name;
    }
    public double getPrice(){

        return price;
    }
    public String getDateOfSale(){

        return dateOfSale;
    }
    public abstract String getCreator();
}
