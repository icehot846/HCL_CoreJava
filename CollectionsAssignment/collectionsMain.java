package com.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;

public class collectionsMain {
	public static void main(String[] args) {
		
		ArrayList<movie> ar = new ArrayList<movie>();
		ar.add(new movie("I am Legend",7.2,2007));
		ar.add(new movie("The Hunger Games",7.2,2012));
		ar.add(new movie("The Hurt Locker",7.5,2008));
		ar.add(new movie("Cars 3",6.7,2017));
		
		System.out.println("\n\tUnsorted Movies List: \n");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("\n\tSorted by Rating: \n");
		Collections.sort(ar, new RatingCompare());
		//for (int i = 0; i < ar.size(); i++) {
		//	System.out.println(ar.get(i));
		//}
		
		ar.forEach(movie -> System.out.println(movie));
		
		System.out.println("\n\tSorted by Name: \n");
		Collections.sort(ar, new NameCompare());
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("\n\tSorted by Year: \n");
		Collections.sort(ar, new YearCompare());
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
}
