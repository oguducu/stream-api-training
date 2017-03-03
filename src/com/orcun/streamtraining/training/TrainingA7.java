package com.orcun.streamtraining.training;

import java.util.List;

import com.orcun.streamtraining.domain.User;

/*
 * Print all users
 */
public class TrainingA7 {
	//With for
	public void getPrintAllUsersV1(List<User> userList) {
		for(User user:userList) {
			System.out.println(user.toString());
		}
	}
	
	//With lambda
	public void getPrintAllUsersV2(List<User> userList) {
		userList.stream().forEach(u->System.out.println(u.toString()));
	}
	
	//With method referance
	public void getPrintAllUsersV3(List<User> userList) {
		userList.stream().forEach(System.out::println);
	}
}
