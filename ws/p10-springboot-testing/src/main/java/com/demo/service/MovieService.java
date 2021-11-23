package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Movie;
import com.demo.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repo;
	
	public List<Movie> findAllMovies(){
		return repo.findAll();
	}
	
	public Movie findMovieById(int id){
		Optional<Movie> optional = repo.findById(id);
		
		if(optional.isPresent()) {
			return optional.get();
		} else {
//			System.out.println("Movie is not found in database with id: "+id);
			throw new RuntimeException("Movie is not found in database with id: "+id);
		}
	}
	
	public Movie saveMovie(Movie movie){
		return repo.save(movie);
	}
	
	
	
	
	
}
