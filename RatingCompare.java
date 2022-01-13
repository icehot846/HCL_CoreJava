package com.hcl.collections;
import java.util.*;

public class RatingCompare implements Comparator<movie> {

	public int compare(movie movie1, movie movie2) {
		if (movie1.getRating() < movie2.getRating()) {
			return -1;
		}
		else if (movie1.getRating() > movie2.getRating()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
