package com.orcun.streamtraining.training;

import java.util.Comparator;
import java.util.List;

import com.orcun.streamtraining.domain.User;

/*
 * Get oldest user
 */
public class TrainingB2 {
	//With for
	public User getOldestUserV1(List<User> userList) {
		int age = 0;
		User oldestUser = null;
		for(User user:userList) {
			if(age<user.getAge()) {
				age = user.getAge();
				oldestUser = user;
			}
		}
		return oldestUser;
	}
	
	//With lambda
	public User getOldestUserV2(List<User> userList) {
		return userList.stream().reduce((u1,u2)->u1.getAge()>u2.getAge()?u1:u2).get();
	}
	
	//With lambda
	public User getOldestUserV3(List<User> userList) {
		return userList.stream().max((u1,u2)->u1.getAge()-u2.getAge()).get();
	}
	
	//With method reference
	public User getOldestUserV4(List<User> userList) {
		return userList.stream().max(Comparator.comparing(User::getAge)).get();
	}
}
