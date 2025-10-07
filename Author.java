public class Author
{
    //attributes
    private String authorName;
    private String dateOfBirth;

    //constructor
    public Author (String authorName, String dateOfBirth){

        this.authorName = authorName;
        this.dateOfBirth = dateOfBirth;
    }
    //getters
    public String getAuthorName(){

        return authorName;
    }
    public String getDateOfBirth(){

        return dateOfBirth;
    }
}
