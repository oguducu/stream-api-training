package com.orcun.streamtraining.training;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.orcun.streamtraining.domain.User;

/*
 * Print distinct user name who earns more than x dolar
 */
public class TrainingB7 {
	//With for
	public void getDistinctUserNameWhoEarnsMoreV1(List<User> userList, double salary) {
		Map<String,Boolean> userNameMap = new HashMap<>();
		for(User user:userList) {
			if(user.getSalary()>salary)
				userNameMap.put(user.getName(), true);
		}
		Iterator<String> it = userNameMap.keySet().iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	
	//With lambda
	public void getDistinctUserNameWhoEarnsMoreV2(List<User> userList, double salary) {
		userList.stream().filter(user->user.getSalary()>salary)
			.map(user->user.getName()).distinct().forEach(name->System.out.println(name));
	}
	
	//With method reference
	public void getDistinctUserNameWhoEarnsMoreV3(List<User> userList, double salary) {
		userList.stream().filter(user->user.getSalary()>salary)
			.map(User::getName).distinct().forEach(System.out::println);
	}
}
