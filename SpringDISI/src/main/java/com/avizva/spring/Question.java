package com.avizva.spring;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int qid;
	private String qname;

	private Map<User, Answer> answers;

	public Question() {
	}

	public Question(int qid, String qname, Map<User, Answer> answers) {
		this.qid = qid;
		this.qname = qname;
		this.answers = answers;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public void setAnswers(Map<User, Answer> answers) {
		this.answers = answers;
	}

	public void display() {
		System.out.println("QID:" + qid + " QNAME:" + qname);
		System.out.println("Answers");
		Set<Entry<User, Answer>> entries = answers.entrySet();
		for (Entry<User, Answer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
