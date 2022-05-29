package com.BWD.movieLibrary2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")//adnotacja do wszystkich metod
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping("/test")
    public int test() {
        return 1;
    }

    @GetMapping("")
    public List<Movie> getAll() {
        return movieRepository.getAll();
    }

    @GetMapping("/{id}")
    public Movie getById(@PathVariable("id") int id) {
        return movieRepository.getById(id);
    }

    @PostMapping("/add")
    public int add(@RequestBody List<Movie> movies) {//podpowiadamy spring bootowi że ten obiekt przyjdzie razem z zapytaniem
        return movieRepository.save(movies);
    }

    @PutMapping("/{id}")//przy zapytaniu put trzeba podać wszystkie pola obiektu inaczej je wyNULLuje
    public int update(@PathVariable("id") int id, @RequestBody Movie updatedMovie) {
        Movie movie = movieRepository.getById(id);

        if (movie != null) {
            movie.setName(updatedMovie.getName());
            movie.setRating(updatedMovie.getRating());
            movieRepository.update(movie);

            return 1;
        } else {
            return -1;
        }
    }

    @PatchMapping("/{id}")//patch aktualizuje wybrane parametry
    public int partiallyUpdate(@PathVariable("id") int id, @RequestBody Movie updatedMovie) {
        Movie movie = movieRepository.getById(id);

        if (movie != null) {
            if (updatedMovie.getName() != null) {
                movie.setName(updatedMovie.getName());
            }
            if (updatedMovie.getRating() > 0) {
                movie.setRating(updatedMovie.getRating());
            }

            movieRepository.update(movie);

            return 1;
        } else {
            return -1;
        }
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable("id") int id) {
        return movieRepository.delete(id);
    }
}
