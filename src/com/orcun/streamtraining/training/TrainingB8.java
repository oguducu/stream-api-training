package com.orcun.streamtraining.training;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.orcun.streamtraining.domain.User;

/*
 * Find users who start in year x and sort them with salary (increasing order)
 */
public class TrainingB8 {
	//With for
	public List<User> getUserStartsInSpecificYearV1(List<User> userList, int year) {
		List<User> list = new ArrayList<>();
		for(User user:userList) {
			if(user.getStartYear()==year)
				list.add(user);
		}
		list.sort(new Comparator<User>(){
			@Override
			public int compare(User u1, User u2) 
		    {
				return (int)(u1.getSalary() - u2.getSalary()); 
		    }
		});
		return list;
	}
	
	//With lambda
	public List<User> getUserStartsInSpecificYearV2(List<User> userList, int year) {
		return userList.stream().filter(user->user.getStartYear()==year)
			.sorted((u1,u2)->(int)(u1.getSalary()-u2.getSalary())).collect(Collectors.toList());
	}
	
	//With method reference
	public List<User> getUserStartsInSpecificYearV3(List<User> userList, int year) {
		return userList.stream().filter(user->user.getStartYear()==year)
			.sorted(Comparator.comparing(User::getSalary)).collect(Collectors.toList());
	}
}
