package lowLevelDesign.bookMyShow;

import lowLevelDesign.bookMyShow.enums.City;

import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityMoviesMap;
    List<Movie> allMovies;

    public void addMovie(Movie movie, City city) {
        allMovies.add(movie);
        cityMoviesMap.get(city).add(movie);
    }

    public void removeMovie(Movie movie, City city) {
        allMovies.remove(movie);
        cityMoviesMap.get(city).remove(movie);
    }

    public List<Movie> getMoviesByName(String name) {
        return allMovies.stream().filter(movie -> movie.getName().equals(name)).toList();
    }

    public List<Movie> getMoviesByCity(City city) {
        return cityMoviesMap.get(city);
    }

    public List<Movie> getMoviesByLanguage(City city, String language) {
        List<Movie> movies = cityMoviesMap.get(city);
        return movies.stream().filter(movie -> movie.getLanguage().equals(language)).toList();
    }

    public List<Movie> getMoviesByGenre(City city, String genre) {
        List<Movie> movies = cityMoviesMap.get(city);
        return movies.stream().filter(movie -> movie.getGenre().equals(genre)).toList();
    }


}
