package com.demo;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import java.util.Optional;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.demo.entity.Movie;
import com.demo.repositories.MovieRepository;
import com.demo.service.MovieService;

@SpringBootTest
public class TestServiceClass {

	@Autowired
	private MovieService service;
	
	@MockBean
	private MovieRepository repo;
	
//	@Test
	public void shouldFindMovieById() {
		int id = 52;
		
		Mockito.when(repo.findById(id)).thenReturn(Optional.of(new Movie(id, "This is pokemon", "Wong Jong", 4.8)));
		
		
		Movie movie = service.findMovieById(id);
		System.out.println(movie);
		
		Assertions.assertNotNull(movie);
		Assertions.assertEquals("This is pokemon", movie.getTitle());
		Assertions.assertEquals("Wong Jong", movie.getDirector());
		
		
		Matchers.allOf(Matchers.instanceOf(Movie.class));
//		Matchers.allOf(Matchers.anything());
		Matchers.allOf(Matchers.not(Matchers.instanceOf(String.class)));
		
	}
	
	@Test
	public void shouldNotFindMovieById() {
		int id = 52;
		
		Mockito.when(repo.findById(id)).thenReturn(Optional.ofNullable(null));
		
		Assertions.assertThrows(RuntimeException.class, ()->{			
			service.findMovieById(id);
		});
		
	}
	
}
