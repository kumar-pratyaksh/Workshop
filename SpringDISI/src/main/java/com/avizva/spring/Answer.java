package com.avizva.spring;

public class Answer {

	private int answerId;
	private String answer;

	public Answer() {
	}

	public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answer + "]";
	}

}
