package com.tawin;

public abstract class QuestionType {
	private int nbQuestion;
	private int score;
	private String signe[] = {"+","-","*"}; 
	private String capital[] = {"France","Allemagne","Italie","Liberia","Espagne","Canada","Croatie","Mali"};
	private String responce[] = {"Paris","Berlin","Rome","Monrovia","Madrid","Ottawa","Zagreb","Bamako"};
	
	public abstract void createQuestion();
	
	QuestionType(int nb){
		setNbQuestion(nb);
	}

	public int getNbQuestion() {
		return nbQuestion;
	}

	public void setNbQuestion(int nbQuestion) {
		this.nbQuestion = nbQuestion;
	}

	public String[] getCapital() {
		return capital;
	}

	public void setCapital(String capital[]) {
		this.capital = capital;
	}

	public String[] getResponce() {
		return responce;
	}

	public void setResponce(String responce[]) {
		this.responce = responce;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String[] getSigne() {
		return signe;
	}

	public void setSigne(String signe[]) {
		this.signe = signe;
	}
}
