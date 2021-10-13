package strategy;

public class PercentageRatingHandler extends BaseRatingHandler {

	@Override
	public Float handle(String rawRating) {
		if(canHandle(rawRating)) {
			return this.parse(rawRating);
		}
		return super.handle(rawRating);
	}
	
	private float parse(String rawRating) {
		String strRating = rawRating.substring(0, rawRating.length() - 1);
		return Float.parseFloat(strRating) / 100;
	}
	
	private boolean canHandle(String rawRating) {
		return rawRating.indexOf('%') == (rawRating.length() - 1);
	}
}
