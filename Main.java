
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
      //create a store
      Store store = new Store();
      //create authors
      Author author1 = new Author("JK Rowling", "07/31/1965");
      Author author2 = new Author("Stephen King", "09/21/1947");

      //create item for sale
      Book book1 = new Book("Harry Potter", 19.99, "10/01/2025", "Bloomsbury", author1);
      Book book2 = new Book("It", 18.45, "10/06/2025", "Viking", author2);

      //create movies
      Movie movie1 = new Movie("Guardians Of The Galaxy", 15.99, "09/28/2025", 2.02, "James Gunn");
      Movie movie2 = new Movie("E.T. The Extra-Terrestrial", 10.00, "10/05/2025", 2.0, "Steven Spielberg");

      //add items
      store.addItem(book1);
      store.addItem(book2);
      store.addItem(movie1);
      store.addItem(movie2);

      System.out.println("Items for sale: ");
      store.showItems();

      System.out.println("Creators: ");
      store.creator("Harry Potter");
      store.creator("It");
      store.creator("Guardians Of The Galaxy");
      store.creator("E.T. The Extra-Terrestrial");

      System.out.println("Selling: ");
      store.sellItem("It");

      System.out.println("updated items for sale: ");
      store.showItems();

      System.out.println("Profit: ");
      System.out.println("Profit: $" + store.getProfit());
     }
}
