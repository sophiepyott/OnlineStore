
public class Book extends ItemForSale
{
    //attributes
    private String publisher;
    private Author author;

    //constructor
    public Book(String name, double price, String dateOfSale, String publisher, Author author){

        super(name, price, dateOfSale); //parent
        this.publisher = publisher;
        this.author = author;
    }
    //getters
    public String getPublisher(){

        return publisher;
    }
    public Author getAuthor(){
        
        return author;
    }
    //override method to return book creator details
    @Override
    public String getCreator(){
        return "Author: " + author.getAuthorName() + ", DOB: " + author.getDateOfBirth();
    }
}
