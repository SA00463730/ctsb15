package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Movie;
import com.demo.service.MovieService;

// localhost:8080/

@RestController
@RequestMapping("/v1/api/movies")
public class MovieController {
	
	@Autowired
	private MovieService service;

	@GetMapping("")
	public List<Movie> getAllMovies(){
		System.out.println("get movies");
		// may write ->
		 	// delete
			// create
		return service.findAllMovies();
	}
	
	@GetMapping("/{id}")
	public Movie getMovie(@PathVariable int id){
		System.out.println("get movie by id: "+id);
		return service.findMovieById(id);
	}
	
	@PostMapping("")
	public Movie createMovie(@RequestBody Movie movie){
		System.out.println("save movie in db: "+movie);
		return service.saveMovie(movie);
	}
	
	@PutMapping("/{id}")
	public Movie updateMovie(@PathVariable int id, @RequestBody Movie movie){
		return null;
	}
	
	@DeleteMapping("/{id}")
	public Movie deleteMovie(@PathVariable int id){
		return null;
	}
	
	
	
	
}
