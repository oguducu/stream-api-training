package com.orcun.streamtraining.domain;

import java.util.Arrays;
import java.util.List;

import com.orcun.streamtraining.util.StreamConstans.Language;
import com.orcun.streamtraining.util.StreamConstans.Title;


public class User {
	private String name;
	private String surname;
	private int age;
	private double salary;
	private Title title;
	private boolean isVegetarian;
	private int startYear;
	private List<Language> languages;
	
	public User(String name,String surname,int age,double salary, 
			Title title, boolean isVegetarian,int startYear,Language[] languages) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.salary = salary;
		this.title = title;
		this.isVegetarian = isVegetarian;
		this.startYear = startYear;
		this.languages = Arrays.asList(languages);
	}
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public Title getTitle() {
		return title;
	}
	
	public boolean isVegetarian() {
		return isVegetarian;
	}

	public int getStartYear() {
		return startYear;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append(name +" "+surname).append("- age:"+age).append(" - salary:"+salary).append(" - title:"+title).toString();
	}
}
