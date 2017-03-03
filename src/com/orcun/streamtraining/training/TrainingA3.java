package com.orcun.streamtraining.training;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.orcun.streamtraining.domain.User;
import com.orcun.streamtraining.util.StreamConstans.Title;

/*
 * Get unique titles of users
 */
public class TrainingA3 {
	//With for
	public List<Title> getUniqueTitlesV1(List<User> userList) {
		Map<Title,Boolean> titleMap = new HashMap<>(); 
		List<Title> titleList = new ArrayList<>();
		for(User user:userList) {
			if(!titleMap.containsKey(user.getTitle())) {
				titleMap.put(user.getTitle(), true);
				titleList.add(user.getTitle());
			}
		}
		return titleList;
	}
	
	//With lambda
	public List<Title> getUniqueTitlesV2(List<User> userList) {
		return userList.stream().map(u->u.getTitle()).distinct().collect(toList());
	}
	
	//With method reference
	public List<Title> getUniqueTitlesV3(List<User> userList) {
		return userList.stream().map(User::getTitle).distinct().collect(toList());
	}
}
