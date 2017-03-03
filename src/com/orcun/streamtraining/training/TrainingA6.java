package com.orcun.streamtraining.training;

import java.util.List;

import com.orcun.streamtraining.domain.User;

/*
 * Get count of users who are vegetarian
 */
public class TrainingA6 {
	//With for
	public long getCountOfVegetarianUsersV1(List<User> userList) {
		long count = 0;
		for(User user:userList) {
			if(user.isVegetarian())
				count++;
		}
		return count;
	}
	
	//With lambda
	public long getCountOfVegetarianUsersV2(List<User> userList) {
		return userList.stream().filter(u->u.isVegetarian()).count();
	}
	
	//With method referance
	public long getCountOfVegetarianUsersV3(List<User> userList) {
		return userList.stream().filter(User::isVegetarian).count();
	}
}
