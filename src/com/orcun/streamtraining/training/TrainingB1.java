package com.orcun.streamtraining.training;

import java.util.List;

import com.orcun.streamtraining.domain.User;

/*
 * Sum of users age
 */
public class TrainingB1 {
	//With for
	public int getSumOfUsersAgeV1(List<User> userList) {
		int sum = 0;
		for(User user:userList) {
			sum+=user.getAge();
		}
		return sum;
	}
	
	//With lambda
	public int getSumOfUsersAgeV2(List<User> userList) {
		return userList.stream().mapToInt(user->user.getAge()).sum();
	}
	
	//With method reference
	public int getSumOfUsersAgeV3(List<User> userList) {
		return userList.stream().mapToInt(User::getAge).sum();
	}
	
	//With method reference
	public int getSumOfUsersAgeV4(List<User> userList) {
		return userList.stream().mapToInt(User::getAge).reduce(0, (a1,a2)->a1+a2);
	}
}
