package com.orcun.streamtraining.training;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

import com.orcun.streamtraining.domain.User;

/*
 * Get users name and surname
 */
public class TrainingA2 {
	//With for
	public List<String> getUserNameSurnameV1(List<User> userList) {
		List<String> newUserList = new ArrayList<>();
		for(User user:userList) {
			newUserList.add(user.getName()+" "+user.getSurname());
		}
		return newUserList;
	}
	
	//With lambda
	public List<String> getUserNameSurnameV2(List<User> userList) {
		return userList.stream().map(u->u.getName()+" "+u.getSurname()).collect(toList());
	}
}
