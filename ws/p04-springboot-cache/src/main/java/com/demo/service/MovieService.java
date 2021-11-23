package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.demo.entity.Movie;
import com.demo.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repo;
	
	public List<Movie> findAllMovies(){
		System.out.println("In service: get movies");

		return repo.findAll();
	}
	

	@Cacheable(key="#id", value="movieStore")
	public Movie findMovieById(int id){
		System.out.println("In service: get movie by id: "+id);

		Optional<Movie> optional = repo.findById(id);
		
		if(optional.isPresent()) {
			return optional.get();
		} else {
			System.out.println("Movie is not found in database with id: "+id);
			// throw exception
			// return new Movie()
			return null;
		}
	}
	
	public Movie saveMovie(Movie movie){
		System.out.println("In service: save movie in db: "+movie);

		return repo.save(movie);
	}
	
	
	
	//put
	// @CachePut(key="#id", value="movieStore")

	//delete
	// @CacheEvit(key="#id", value="movieStore")

	
	
}
