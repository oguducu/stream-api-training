package com.orcun.streamtraining.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.orcun.streamtraining.domain.User;
import com.orcun.streamtraining.util.StreamConstans.Language;
import com.orcun.streamtraining.util.StreamConstans.Title;

/*
 * Get user who knows English and has the highest salary among the users who knows English
 */
public class TrainingC4 {
	//With for
	public User getUserWhoEarnsHighSalaryAmongUsers(List<User> userList) {
		User highestEarningUser = null;
		for(User user:userList) {
			boolean knowsEnglish = user.getLanguages().contains(Language.ENGILISH);
			if(!knowsEnglish)
				continue;
			
			if(highestEarningUser==null || highestEarningUser.getSalary()<user.getSalary()) {
				highestEarningUser = user;
			}				
		}
		return highestEarningUser;
	}
	
	//With stream
	public List<Language> getLanguagesKnownV2(List<User> userList) {
		return null;
	}
}
