package com.demo.model;

public class Cinema {
    
	private int id;
	private String title;
	private String director;
	private double rating;
    private int year;


    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", director='" + getDirector() + "'" +
            ", rating='" + getRating() + "'" +
            ", year='" + getYear() + "'" +
            "}";
    }
	

	public Cinema() {}
	public Cinema(String title, String director, double rating) {
		this.title = title;
		this.director = director;
		this.rating = rating;
	}
	public Cinema(int id, String title, String director, double rating) {
		this(title, director, rating);
		this.id=id;
	}	

}