package com.orcun.streamtraining.training;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;

import com.orcun.streamtraining.domain.User;

/*
 * Get users sorted order (salary - increase order)
 */
public class TrainingA4 {
	//With for
	public List<User> getSortedUserListBySalaryV1(List<User> userList) {
		userList.sort(new Comparator<User>() {
			@Override
			public int compare(User u1,User u2) {
				return (int) (u1.getSalary()-u2.getSalary());
			}
		});
		return userList;
	}
	
	//With lambda
	public List<User> getSortedUserListBySalaryV2(List<User> userList) {
		return userList.stream().sorted((u1,u2)->(int)(u1.getSalary()-u2.getSalary())).collect(toList());
	}
	
	//With method reference
	public List<User> getSortedUserListBySalaryV3(List<User> userList) {
		return userList.stream().sorted(Comparator.comparing(User::getSalary)).collect(toList());
	}
}
