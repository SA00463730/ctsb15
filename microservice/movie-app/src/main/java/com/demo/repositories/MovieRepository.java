package com.demo.repositories;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

//	@Autowired
//	private DataSource ds;
//	
//	public List<Movie> findAllMovies(){
//		return null;
//	}
//	
//	public Movie findMovieById(int id){
//		return null;
//	}
//	
//	public Movie saveMovie(Movie movie){
//		return null;
//	}
	
}
