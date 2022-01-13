package com.hcl.collections;
import java.util.*;

public class YearCompare implements Comparator<movie>{

	public int compare(movie movie1, movie movie2) {
		if(movie1.getYear() < movie2.getYear()) {
			return -1;
		}
		else if(movie1.getYear() > movie2.getYear()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
