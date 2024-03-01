import java.util.ArrayList;
import java.util.List;

public class Theatre {

    int theatre_id;
    List<Hall> halls;
    private List<Show> shows = new ArrayList<>();

    public  void setShows(List<Show>shows){
        this.shows = shows;
    }

    public List<Show> getShows(){
        return this.shows;
    }
}
