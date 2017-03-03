package com.orcun.streamtraining.training;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

import com.orcun.streamtraining.domain.User;

/*
 * Get users who are vegetarian
 */
public class TrainingA1 {
	
	//With for
	public List<User> getVegetarianUserV1(List<User> userList) {
		List<User> newUserList = new ArrayList<>();
		for(User user:userList) {
			if(user.isVegetarian())
				newUserList.add(user);
		}
		return newUserList;
	}
	
	//With lambda
	public List<User> getVegetarianUserV2(List<User> userList) {
		return userList.stream().filter(u->u.isVegetarian()).collect(toList());
	}
	
	//With method reference
	public List<User> getVegetarianUserV3(List<User> userList) {
		return userList.stream().filter(User::isVegetarian).collect(toList());
	}
}
