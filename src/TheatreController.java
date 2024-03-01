import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
   private Map<City, List<Theatre>> city_theatre;
   private List<Theatre>allTheatres;

    public TheatreController(){
        city_theatre = new HashMap<>();
        allTheatres = new ArrayList<>();
    }

    public void AddTheatre(Theatre theatre,City city){
        allTheatres.add(theatre);
        List<Theatre>theatres = city_theatre.getOrDefault(city,new ArrayList<>());
        theatres.add(theatre);
        city_theatre.put(city,theatres);
    }

    public Map<Theatre,List<Show>> getAllshowsinTheatre(Movie movie,City city){
            Map<Theatre,List<Show>> allShowsinTheatre = new HashMap<>();

            List<Theatre>theatres = city_theatre.get(city);
            for(Theatre theatre1 : theatres){
                List<Show>shows = theatre1.getShows();
                List<Show>movies = new ArrayList<>();
                for(Show show : shows){
                    Movie movie1 = show.getMovie();
                    if(movie1.getMovie_id() == movie.getMovie_id()){
                        movies.add(show);
                    }
                }
                allShowsinTheatre.put(theatre1,movies);
            }

            return allShowsinTheatre;
    }

}
