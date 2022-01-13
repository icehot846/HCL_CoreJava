package com.hcl.collections;
import java.util.*;

public class NameCompare implements Comparator<movie>{
	
	public int compare(movie movie1, movie movie2) {
		return movie1.getName().compareTo(movie2.getName());
	}
	
}
