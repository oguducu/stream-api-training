package com.orcun.streamtraining.domain;

public class Question {
	private int code;
	private String question;
	private int type; //1 for Software Engineers, 2 for Accounted
	
	public Question(int code, String question, int type) {
		this.code = code;
		this.question = question;
		this.type = type;
	}

	public int getCode() {
		return code;
	}

	public String getQuestion() {
		return question;
	}

	public int getType() {
		return type;
	}
}
