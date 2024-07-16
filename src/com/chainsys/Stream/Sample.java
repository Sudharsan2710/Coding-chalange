package com.chainsys.Stream;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
public class Sample {

	public static void main(String[] args) { 
		
		List<String> languages = new ArrayList<String>();
		languages.add("tamil");
		languages.add("french");
		languages.add("english");

		languages.stream().forEach(System.out::println);
		System.out.println();
		languages.stream().filter(i->i.startsWith("t")).forEach(System.out::println);
		System.out.println();
		languages.stream().sorted().forEach(System.out::println);
		System.out.println();
		languages.stream().map(i->i.toUpperCase()).forEach(System.out::println);
		System.out.println();
		List<String> fly = languages.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
		System.out.println(fly);
		System.out.println();
		int c = (int) languages.stream().filter(i->i.startsWith("f")).count();		
		System.out.println(c);
		
		
	
	}
}
