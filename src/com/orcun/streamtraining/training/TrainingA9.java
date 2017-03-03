package com.orcun.streamtraining.training;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.orcun.streamtraining.domain.User;

/*
 * Get n users
 */
public class TrainingA9 {
	//With for
	public List<User> getNUsersV1(List<User> userList,int n) {
		if(n>userList.size())
			n=userList.size();
		List<User> newUserList = new ArrayList<>();
		for(int i=0;i<n;i++) {
			newUserList.add(userList.get(i));
		}
		return newUserList;
	}
	
	//With lambda
	public List<User> getNUsersV2(List<User> userList,int n) {
		return userList.stream().limit(n).collect(Collectors.toList());
	}
}
