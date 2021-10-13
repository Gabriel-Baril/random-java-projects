package com.tawin;

import java.util.Scanner;

public class Quiz {
	Scanner sc = new Scanner(System.in);
	
	private QuestionType type;
	private long startTime;
	private long endTime;

	private Object demand;
	
	
	public Quiz(QuestionType type){
		this.setType(type);
	}

	public void start() {
		startTime = System.currentTimeMillis();
		type.createQuestion();
	}

	public void displayResult() {
		endTime = System.currentTimeMillis();
		System.out.println("Votre score est de " + type.getScore() + "/" + type.getNbQuestion());
		System.out.println("Vous avez resolu le quiz en "  + (endTime - startTime)/1000 + " secondes");
		demandReplay();
	}
	
	public void demandReplay(){
		do{
			String demand = null;
			System.out.println("Voulez vous rejouer ?(O/N)");
			demand = sc.nextLine();
			if(demand.equals("O")){
				start();
				displayResult();
			}else{
				System.exit(0);
			}
		}while(!demand.equals("O") && !demand.equals("N"));
	}

	public QuestionType getType() {
		return type;
	}

	public void setType(QuestionType type) {
		this.type = type;
	}
}
