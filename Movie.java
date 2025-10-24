public class Movie extends ItemForSale
{
    //attributes
    private double duration;
    private String creator;

    //constructor
    public Movie(String name, double price, String dateOfSale, double duration, String creator){

        super(name, price, dateOfSale);
        this.duration = duration;
        this.creator = creator;
    }
    //getters
    public double getDuration(){

        return duration;
    }
    //override method to return movie details
    @Override
    public String getCreator(){
        
        return "Movie created by: " + creator + ", duration: " + duration;
    }
}
