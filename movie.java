package com.hcl.collections;
import java.io.*;
import java.util.*;

public class movie implements Comparable<movie>{
	
	private double rating;
	private String name;
	private int year;
	
	public movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	
	public int compareTo(movie movie) {
		return this.year - movie.year;
	}
	
	public double getRating() {
		return rating;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getName() {
		return name;
	}
}
