package com.orcun.streamtraining;

import java.util.ArrayList;
import java.util.List;

import com.orcun.streamtraining.domain.Question;
import com.orcun.streamtraining.domain.User;
import com.orcun.streamtraining.training.TrainingA1;
import com.orcun.streamtraining.training.TrainingA2;
import com.orcun.streamtraining.training.TrainingA3;
import com.orcun.streamtraining.training.TrainingA4;
import com.orcun.streamtraining.training.TrainingA5;
import com.orcun.streamtraining.training.TrainingA6;
import com.orcun.streamtraining.training.TrainingA7;
import com.orcun.streamtraining.training.TrainingA8;
import com.orcun.streamtraining.training.TrainingA9;
import com.orcun.streamtraining.training.TrainingB1;
import com.orcun.streamtraining.training.TrainingB2;
import com.orcun.streamtraining.training.TrainingB3;
import com.orcun.streamtraining.training.TrainingB4;
import com.orcun.streamtraining.training.TrainingB5;
import com.orcun.streamtraining.training.TrainingB6;
import com.orcun.streamtraining.training.TrainingB7;
import com.orcun.streamtraining.training.TrainingB8;
import com.orcun.streamtraining.training.TrainingB9;
import com.orcun.streamtraining.training.TrainingC1;
import com.orcun.streamtraining.training.TrainingC3;
import com.orcun.streamtraining.training.TrainingC4;
import com.orcun.streamtraining.util.StreamConstans.Language;
import com.orcun.streamtraining.util.StreamConstans.Title;

public class Application {
	private static List<User> userList;
	private static List<Question> questionList;
	
	public static void main(String[] args) {
		setData();
		
		TrainingA1 trainingA1 = new TrainingA1();
		print("A1 V1",trainingA1.getVegetarianUserV1(userList));
		print("A1 V2",trainingA1.getVegetarianUserV2(userList));
		print("A1 V3",trainingA1.getVegetarianUserV3(userList));
		System.out.println();
		
		TrainingA2 trainingA2 = new TrainingA2();
		print("A2 V1",trainingA2.getUserNameSurnameV1(userList));
		print("A2 V2",trainingA2.getUserNameSurnameV2(userList));
		System.out.println();
		
		TrainingA3 trainingA3 = new TrainingA3();
		print("A3 V1",trainingA3.getUniqueTitlesV1(userList));
		print("A3 V2",trainingA3.getUniqueTitlesV2(userList));
		print("A3 V3",trainingA3.getUniqueTitlesV3(userList));
		System.out.println();
		
		TrainingA4 trainingA4 = new TrainingA4();
		print("A4 V1",trainingA4.getSortedUserListBySalaryV1(userList));
		print("A4 V2",trainingA4.getSortedUserListBySalaryV2(userList));
		print("A4 V3",trainingA4.getSortedUserListBySalaryV3(userList));
		System.out.println();
		
		TrainingA5 trainingA5 = new TrainingA5();
		print("A5 V1",trainingA5.getSortedUserListBySalaryV1(userList));
		print("A5 V2",trainingA5.getSortedUserListBySalaryV2(userList));
		print("A5 V3",trainingA5.getSortedUserListBySalaryV3(userList));
		System.out.println();
		
		TrainingA6 trainingA6 = new TrainingA6();
		print("A6 V1",trainingA6.getCountOfVegetarianUsersV1(userList));
		print("A6 V2",trainingA6.getCountOfVegetarianUsersV2(userList));
		print("A6 V3",trainingA6.getCountOfVegetarianUsersV3(userList));
		System.out.println();
		
		TrainingA7 trainingA7 = new TrainingA7();
		trainingA7.getPrintAllUsersV1(userList);
		System.out.println();
		trainingA7.getPrintAllUsersV2(userList);
		System.out.println();
		trainingA7.getPrintAllUsersV3(userList);
		System.out.println();
		
		TrainingA8 trainingA8 = new TrainingA8();
		print("A8 V1",trainingA8.getOldUsersV1(userList));
		print("A8 V2",trainingA8.getOldUsersV2(userList));
		System.out.println();
		
		TrainingA9 trainingA9 = new TrainingA9();
		print("A9 V1",trainingA9.getNUsersV1(userList,35));
		print("A9 V2",trainingA9.getNUsersV2(userList,35));
		System.out.println();
		
		TrainingB1 trainingB1 = new TrainingB1();
		print("B1 V1",trainingB1.getSumOfUsersAgeV1(userList));
		print("B1 V2",trainingB1.getSumOfUsersAgeV2(userList));
		print("B1 V3",trainingB1.getSumOfUsersAgeV3(userList));
		print("B1 V4",trainingB1.getSumOfUsersAgeV4(userList));
		System.out.println();
		
		TrainingB2 trainingB2 = new TrainingB2();
		print("B2 V1",trainingB2.getOldestUserV1(userList));
		print("B2 V2",trainingB2.getOldestUserV2(userList));
		print("B2 V3",trainingB2.getOldestUserV3(userList));
		print("B2 V4",trainingB2.getOldestUserV4(userList));
		System.out.println();
		
		TrainingB3 trainingB3 = new TrainingB3();
		print("B3 V1",trainingB3.getCountOfVegetarianUsersV1(userList));
		print("B3 V2",trainingB3.getCountOfVegetarianUsersV2(userList));
		print("B3 V3",trainingB3.getCountOfVegetarianUsersV3(userList));
		System.out.println();
		
		TrainingB4 trainingB4 = new TrainingB4();
		trainingB4.printSoftwareEngineersNameV1(userList);
		System.out.println();
		trainingB4.printSoftwareEngineersNameV2(userList);
		System.out.println();
		
		TrainingB5 trainingB5 = new TrainingB5();
		print("B5 V1",trainingB5.getTwoVegeterianUserV1(userList));
		print("B5 V2",trainingB5.getTwoVegeterianUserV2(userList));
		print("B5 V3",trainingB5.getTwoVegeterianUserV3(userList));
		System.out.println();
		
		TrainingB6 trainingB6 = new TrainingB6();
		print("B6 V1",trainingB6.getUsersWhoEarnsMoreV1(userList, 3000));
		print("B6 V2",trainingB6.getUsersWhoEarnsMoreV1(userList, 3000));
		System.out.println();
		
		TrainingB7 trainingB7 = new TrainingB7();
		trainingB7.getDistinctUserNameWhoEarnsMoreV1(userList, 5000);
		System.out.println();
		trainingB7.getDistinctUserNameWhoEarnsMoreV2(userList, 5000);
		System.out.println();
		trainingB7.getDistinctUserNameWhoEarnsMoreV3(userList, 5000);
		System.out.println();
		
		TrainingB8 trainingB8 = new TrainingB8();
		print("B8 V1",trainingB8.getUserStartsInSpecificYearV1(userList, 2011));
		print("B8 V2",trainingB8.getUserStartsInSpecificYearV2(userList, 2011));
		print("B8 V3",trainingB8.getUserStartsInSpecificYearV3(userList, 2011));
		System.out.println();
		
		TrainingB9 trainingB9 = new TrainingB9();
		print("B9 V1",trainingB9.groupEngineersByIsVegetarianV1(userList));
		print("B9 V2",trainingB9.groupEngineersByIsVegetarianV2(userList));
		System.out.println();
		

		TrainingC1 trainingC1 = new TrainingC1();
		print("C1 V1",trainingC1.countEmployeesOfTitlesV1(userList));
		print("C1 V2",trainingC1.countEmployeesOfTitlesV2(userList));
		System.out.println();
		
		TrainingC3 trainingC3 = new TrainingC3();
		print("C3 V1",trainingC3.getLanguagesKnownV1(userList));
		print("C3 V2",trainingC3.getLanguagesKnownV2(userList));
		System.out.println();
		
		TrainingC4 trainingC4 = new TrainingC4();
		print("C4 V1",trainingC4.getUserWhoEarnsHighSalaryAmongUsers(userList));
		System.out.println();
	}
	
	private static <T> void print(String trainingCode,T t) {
		if(t!=null)
			System.out.println("Training "+trainingCode+"- result: "+t.toString());
		else
			System.out.println("Training "+trainingCode+"- result: null");
	}

	private static void setData() {
		userList = new ArrayList<>();
		questionList = new ArrayList<>();
		
		userList.add(new User("Jane","Lawrence",21,5600,Title.SOFTWARE_ENGINEER,true,2011,new Language[]{Language.ENGILISH,Language.GERMAN}));
		userList.add(new User("Kate","Winston",23,6560,Title.ACCOUNTED,false,2012,new Language[]{Language.ENGILISH,Language.TURKISH}));
		userList.add(new User("John","Gordan",25,3500,Title.SECURTY,true,2013,new Language[]{Language.ENGILISH}));
		userList.add(new User("Kate","Marvel",29,8000,Title.POD_LEADER,false,2011,new Language[]{Language.GERMAN}));
		userList.add(new User("Jane","Marvel",32,8000,Title.PROJECT_LEADER,true,2010,new Language[]{Language.TURKISH}));
		userList.add(new User("Visnu","Sarej",22,4000,Title.SOFTWARE_ENGINEER,false,2008,new Language[]{Language.GERMAN}));
		userList.add(new User("Mike","Denis",21,3500,Title.SOFTWARE_ENGINEER,true,2011,new Language[]{Language.ENGILISH}));
		userList.add(new User("Rajess","Visnu",22,4000,Title.SOFTWARE_ENGINEER,true,2009,new Language[]{Language.ENGILISH}));
		
		questionList.add(new Question(1,"What is lambda?",1));
		questionList.add(new Question(2,"What is stream?",1));
		questionList.add(new Question(3,"What is filter?",1));
		questionList.add(new Question(4,"What is money?",2));
	}
}
