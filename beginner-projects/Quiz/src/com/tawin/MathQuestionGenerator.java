package com.tawin;

import java.util.Scanner;

public class MathQuestionGenerator extends QuestionType{
	Scanner sc = new Scanner(System.in);
	
	public MathQuestionGenerator(int nbQuestion){
		super(nbQuestion);
	}

	public void createQuestion() {
		int theResponce;
		for(int i = 0;i < this.getNbQuestion();i++){
			int randSigne = (int)(Math.random()*2);
			int randFNb = (int)(Math.random()*30);
			int randSNb = (int)(Math.random()*30);
			System.out.println(randFNb + " " + super.getSigne()[randSigne] + " " + randSNb + " = ");
			theResponce = sc.nextInt();
			switch(randSigne){
				case 0:
					if(randFNb + randSNb == theResponce){
						System.out.println("Bonne reponse!");
						super.setScore(super.getScore() + 1);
					}else{
						System.out.println("Mauvaise reponse");
					}
					break;
				case 1:
					if(randFNb - randSNb == theResponce){
						System.out.println("Bonne reponse!");
						super.setScore(super.getScore() + 1);
					}else{
						System.out.println("Mauvaise reponse");
					}
					break;
				case 2:
					if(randFNb * randSNb == theResponce){
						System.out.println("Bonne reponse!");
						super.setScore(super.getScore() + 1);
					}else{
						System.out.println("Mauvaise reponse");
					}
					break;
			
			}
		}
	}
}
