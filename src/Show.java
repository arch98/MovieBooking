import java.util.ArrayList;
import java.util.List;

public class Show {
   private int show_id;
   private Movie movie;
   private Hall hall;
   private int startTime;
   private List<Integer> bookedSeats = new ArrayList<>();


    public int getShow_id(){
        return this.show_id;
    }

    public Movie getMovie(){
        return this.movie;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public Hall getHall(){
        return this.hall;
    }

    public void setShow_id(int show_id){
        this.show_id = show_id;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

    public void setStartTime(int startTime){
        this.startTime = startTime;
    }

    public void setHall(Hall hall){
        this.hall = hall;
    }
}
