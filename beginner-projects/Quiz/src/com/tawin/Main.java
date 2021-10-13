package com.tawin;

public class Main {

	public static void main(String[] args) {
		Quiz quiz = new Quiz(new MathQuestionGenerator(5));
		quiz.start();
		quiz.displayResult();
	}
}
