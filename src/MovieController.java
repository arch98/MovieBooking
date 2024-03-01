import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    private  Map<City,List<Movie>> city_movies;
    private  List<Movie> allMovies;

    public MovieController(){
        city_movies = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(Movie movie,City city){
        allMovies.add(movie);
        List<Movie> movies = city_movies.getOrDefault(city,new ArrayList<>());
        movies.add(movie);
        city_movies.put(city,movies);
    }

    public Movie getMovieByName(String name){
        for(Movie movie : allMovies){
            if(movie.getName().equals(name)){
                return movie;
            }
        }

        return null;
    }

    public List<Movie>  getMovieByCity(City city){
        return city_movies.get(city);
    }
}
