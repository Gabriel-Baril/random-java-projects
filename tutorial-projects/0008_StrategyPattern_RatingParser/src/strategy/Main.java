package strategy;

public class Main {
	public static void main(String[] args) {
		RatingHelper helper = new RatingHelper("60%");
		System.out.println(helper.getRating());
	}
}
