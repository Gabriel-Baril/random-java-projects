package strategy;

public class RatingHelper {
	private IRatingHandler handler;
	private String rawRatingValue;
	
	public RatingHelper(String rawRatingValue) {
		this.rawRatingValue = rawRatingValue;
		this.initHandlers();
	}
	
	public Float getRating() {
		return handler.handle(this.rawRatingValue);
	}
	
	private void initHandlers() {
		PercentageRatingHandler h1 = new PercentageRatingHandler();
		DivisionRatingHandler h2 = new DivisionRatingHandler();
		h1.setNext(h2);
		h2.setNext(null);
		
		this.handler = h1;
	}
}
