package com.tawin;
import java.util.Scanner;

public class CapitalCityQuestionGenerator extends QuestionType{
	Scanner sc = new Scanner(System.in);
	
	public CapitalCityQuestionGenerator(int nbQuestion){
		super(nbQuestion);
	}

	public void createQuestion() {
		String theResponce;
		for(int i = 0;i < this.getNbQuestion();i++){
			int rand = (int)(Math.random() * 7);
			System.out.println("Quelle est la capitale de ce pays: " + super.getCapital()[rand]);
			theResponce = sc.nextLine();
			if(theResponce.equals(super.getResponce()[rand])){
				System.out.println("Bonne reponse!");
				super.setScore(super.getScore() + 1);
			}else{
				System.out.println("Mauvaise reponse!");
			}
		}
	}
	
}
