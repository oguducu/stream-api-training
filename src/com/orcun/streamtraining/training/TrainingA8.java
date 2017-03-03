package com.orcun.streamtraining.training;

import java.util.List;

import com.orcun.streamtraining.domain.User;

/*
 * Get any user who is older than 25
 */
public class TrainingA8 {
	//With for
	public User getOldUsersV1(List<User> userList) {
		for(User user:userList) {
			if(user.getAge()>25)
				return user;
		}
		return null;
	}
	
	//With lambda
	public User getOldUsersV2(List<User> userList) {
		return userList.stream().filter(u->u.getAge()>25).findAny().get();
	}
}
