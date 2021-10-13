package strategy;

public class DivisionRatingHandler extends BaseRatingHandler {
	@Override
	public Float handle(String rawRating) {
		if(canHandle(rawRating)) {
			return this.parse(rawRating);
		}
		return super.handle(rawRating);
	}
	
	private float parse(String rawRating) {
		String[] ratingValues = rawRating.split("/");
		float num = Float.parseFloat(ratingValues[0]);
		float den = Float.parseFloat(ratingValues[1]);
		
		return num / den; 
	}
	
	private boolean canHandle(String rawRating) {
		return rawRating.contains("/");
	}
}
