import java.util.ArrayList;
import java.util.List;

public class Hall {
   private int hall_id;
   private List<Seat> seats = new ArrayList<>();

    public int getHallId(){
        return this.hall_id;
    }

    public void setHall_id(int hall_id){
        this.hall_id = hall_id;
    }

    public void setSeats(List<Seat> seats){
        this.seats = seats;
    }

    public List<Seat> getSeats(){
        return this.seats;
    }
}
